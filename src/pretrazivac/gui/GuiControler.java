package pretrazivac.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import javax.management.RuntimeErrorException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import pretrazivac.Film;
import pretrazivac.Korisnik;
import pretrazivac.Pretrazivac;
import pretrazivac.gui.*;
import pretrazivac.sistemske_operacije.SOSacuvajKorisnikeUFajl;


public class GuiControler {
	private static Login log;
	private static PocetniEkran pe;
	private static KorisnikEkran ke;
	private static FilmEkran fe;
	private static SignUpEkran su;
	private static Pretrazivac pr;
	private static Korisnik ulogovanKorisnik;
	private static GledanjeFilma glf;
	private static LinkedList<Film> pomocna;
	private static LinkedList<Film> pomocnaKorisnik;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pr=new Pretrazivac();
					log= new Login();
					log.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
				
			}
		});
		
	}
	
	public static void pokreniPocetniEkran(LinkedList<Film>filmovi){
		pe=new PocetniEkran();
		pe.setVisible(true);
		log.setVisible(false);
		log.postaviPrazan();
		pe.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				if(JOptionPane.showConfirmDialog(pe, "Da li zelite da izadjete iz aplikacije?", "LOGOUT", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
					pr.sacuvajFilmoveUFajl("filmovi.out");
					pr.sacuvajKorisnikeUFajl("korisnici.out");
					log.setVisible(true);
					pe.dispose();
				}
				
			}
		});
		napuniPocetniPanelFilmovima(filmovi);
	}
	public static void ugasiPocetniEkran(){
		log.setVisible(true);
		pe.dispose();
		
	}
	public static void pokreniKorisnikEkran(){
		ke=new KorisnikEkran(ulogovanKorisnik);
		ke.setVisible(true);
		pe.setVisible(false);
		ke.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				ugasiKorisnikEkran();
				
			}
		});
		napuniKorisnikovPanelFilmovima(ulogovanKorisnik.getFilmovi());
	}
	public static void pokreniKorisnikEkran(LinkedList<Film>filmovi){
		ke=new KorisnikEkran(ulogovanKorisnik);
		ke.setVisible(true);
		pe.setVisible(false);
		ke.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				ugasiKorisnikEkran();
				
			}
		});
		napuniKorisnikovPanelFilmovima(filmovi);
	}
	public static void ugasiKorisnikEkran(){
		pe.setVisible(true);
		ke.dispose();
	}
	public static void pokreniFilmEkran(Film film){
		Boolean odgledan=false;
		
		fe=new FilmEkran(film,ulogovanKorisnik.getFilmovi().contains(film)?true:false,ulogovanKorisnik.getFilmovi().contains(film)?ulogovanKorisnik.getFilmovi().get(ulogovanKorisnik.getFilmovi().indexOf(film)).getOcena()+"":"");
		fe.setVisible(true);
		pe.setVisible(false);
		fe.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				ugasiFilmEkran();
				
			}
		});
	}
	public static void ugasiFilmEkran(){
		pe.dispose();
		pokreniPocetniEkran(pr.getFilmovi());
		fe.dispose();
	}
	public static void pokreniSignUpEkran(){
		su=new SignUpEkran();
		su.setVisible(true);
		log.setVisible(false);
		log.postaviPrazan();
		su.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				ugasiSignUpEkran();
				
			}
		});
	}
	public static void ugasiSignUpEkran(){
		log.setVisible(true);
		su.dispose();
	}
	public static void ulogujKorisnika(String username,String pass){
		ulogovanKorisnik=null;
		try{
		for(int i=0;i<pr.getKorisnici().size();i++){
			if(pr.getKorisnici().get(i).getUsername().equals(username) && pr.getKorisnici().get(i).getPass().equals(pass)){
				ulogovanKorisnik=pr.getKorisnici().get(i);
				break;
			}
		}
		if(ulogovanKorisnik==null)
			throw new RuntimeException();
		}catch (RuntimeException e){
			log.postaviPrazan();
			JOptionPane.showMessageDialog(log, "Uneli ste pogresan username ili password","Login Greska", JOptionPane.ERROR_MESSAGE);
			return;
		}
		pokreniPocetniEkran(pr.getFilmovi());
	}
	
	public static void napraviNoviNalog(String ime, String prezime, String username, String pass){
		try{
			Korisnik novi=new Korisnik(ime, prezime, username, pass);
			if(!pr.ubaciKorisnika(novi)){
				throw new RuntimeException("Korisnicko ime je zauzeto!");
			}
				
		}catch(RuntimeException e1){
			JOptionPane.showMessageDialog(su, e1.getMessage(),"SignUp Greska", JOptionPane.ERROR_MESSAGE);
			return;
		}
		JOptionPane.showMessageDialog(su, "Uspesno ste napravili novi nalog!", "Novi nalog", JOptionPane.OK_OPTION, new ImageIcon(SignUpEkran.class.getResource("/images/tick.png")));
		ugasiSignUpEkran();

	}
	public static void napuniPocetniPanelFilmovima(LinkedList<Film> filmovi){
		for(int i=0;i<filmovi.size();i++){
			PristupFilmu d=new PristupFilmu(filmovi.get(i));
			d.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					pokreniFilmEkran(d.getFilm());
				}
			});
			pe.dodajDugme(d);
		}
		
	}
	public static void napuniKorisnikovPanelFilmovima(LinkedList<Film> filmovi){
		for(int i=0;i<filmovi.size();i++){
			PristupFilmu d=new PristupFilmu(filmovi.get(i));
			d.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					pokreniFilmEkran(d.getFilm());
				}
			});
			ke.dodajDugme(d);
		}
		
	}
	public static void sortirajListuPoGledanosti(){
		pr.setFilmovi(pr.azurirajPoGledanosti());
		ugasiPocetniEkran();
		pokreniPocetniEkran(pr.getFilmovi());
	}
	public static void sortirajListuPoNazivu(){
		pr.setFilmovi(pr.sortirajPoNazivu());
		ugasiPocetniEkran();
		pokreniPocetniEkran(pr.getFilmovi());
	}
	public static void sortirajListuPoGodini(){
		pr.setFilmovi(pr.sortirajPoGodini());
		ugasiPocetniEkran();
		pokreniPocetniEkran(pr.getFilmovi());
	}
	public static void sortirajListuPoOceni(){
		pr.setFilmovi(pr.sortirajPoOceni());
		ugasiPocetniEkran();
		pokreniPocetniEkran(pr.getFilmovi());
	}
	public static void sortirajKorisnikovuListuPoGledanosti(){
		ulogovanKorisnik.setFilmovi(ulogovanKorisnik.sortirajPoPopularnosti());
		ugasiKorisnikEkran();
		pokreniKorisnikEkran(ulogovanKorisnik.getFilmovi());
	}
	public static void sortirajKorisnikovuListuPoNazivu(){
		ulogovanKorisnik.setFilmovi(ulogovanKorisnik.sortirajPoNazivu());
		ugasiKorisnikEkran();
		pokreniKorisnikEkran(ulogovanKorisnik.getFilmovi());
	}
	public static void sortirajKorisnikovuListuPoGodini(){
		ulogovanKorisnik.setFilmovi(ulogovanKorisnik.sortirajPoGodini());
		ugasiKorisnikEkran();
		pokreniKorisnikEkran(ulogovanKorisnik.getFilmovi());
	}
	public static void sortirajKorisnikovuListuPoOceni(){
		ulogovanKorisnik.setFilmovi(ulogovanKorisnik.sortirajPoOceni());
		ugasiKorisnikEkran();
		pokreniKorisnikEkran(ulogovanKorisnik.getFilmovi());
	}
	public static void pretraziFilmove(String naziv, int godina, String zanr){
		pomocna=pr.pretrazi(naziv, godina, zanr);
		if(pomocna.isEmpty()){
			JOptionPane.showMessageDialog(pe, "Nema rezultata za tu pretragu","Nema rezultata", JOptionPane.OK_OPTION);
			return;
		}
		ugasiPocetniEkran();
		pokreniPocetniEkran(pomocna);
	}
	public static void ponistiIzmene(){
		ugasiPocetniEkran();
		pokreniPocetniEkran(pr.getFilmovi());
	}
	public static void pretraziKorisnikoveFilmove(String naziv, int godina, String zanr){
		pomocnaKorisnik=ulogovanKorisnik.pretrazi(naziv, godina, zanr);
		if(pomocnaKorisnik.isEmpty()){
			JOptionPane.showMessageDialog(pe, "Nema rezultata za tu pretragu","Nema rezultata", JOptionPane.OK_OPTION);
			return;
		}
		ugasiKorisnikEkran();
		pokreniKorisnikEkran(pomocnaKorisnik);
	}
	public static void ponistiKorisnikoveIzmene(){
		ugasiKorisnikEkran();
		pokreniKorisnikEkran(ulogovanKorisnik.getFilmovi());
	}
	public static void preporuciFilmove(){
		pomocna=pr.preporuci(ulogovanKorisnik);
		ugasiPocetniEkran();
		pokreniPocetniEkran(pomocna);
	}
	
	public static void pokreniGledanjeFilma(Film film){
		fe.setEnabled(false);
		glf=new GledanjeFilma(film);
	}
	
	public static void ugasiGledanjeFilma(){
		ugasiFilmEkran();
		glf.dispose();
		
	}
	public static void azurirajFilm(Film film,Double ocena){
		pr.azurirajDodavanjeFilma(film, ocena);
	}
	public static void dodajKorisnikuFilm(Film film, double ocena){
		Film g=new Film();
		g.setNaziv(film.getNaziv());
		g.setBrojPregleda(film.getBrojPregleda());
		g.setImagepath(film.getImagepath());
		g.setZanr(film.getZanr());
		g.setGodina(film.getGodina());
		g.setTrailerpath(film.getTrailerpath());
		g.setOcena(ocena);
		ulogovanKorisnik.dodajFilm(g);
		for (int i = 0; i < ulogovanKorisnik.getFilmovi().size(); i++) {
			System.out.println(ulogovanKorisnik.getFilmovi().get(i).toString());
		}
	}
	public static void obrisiKorisnickiNalog(){
		if(JOptionPane.showConfirmDialog(ke, "Da li ste sigurni da zelite da obrisete Vas nalog?", "Brisanje naloga", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
		pr.izbaciKorsnika(ulogovanKorisnik);
		log.setVisible(true);
		ke.dispose();
		pr.sacuvajFilmoveUFajl("filmovi.out");
		pr.sacuvajKorisnikeUFajl("korisnici.out");
		pr=new Pretrazivac();
		}
	}
}

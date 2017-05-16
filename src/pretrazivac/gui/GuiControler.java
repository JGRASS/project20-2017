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
	private static LinkedList<Film> pomocna;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pr=new Pretrazivac();
					//pr.setKorisnici(korisnici);
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
				ugasiPocetniEkran();
				
			}
		});
		napuniPocetniPanelFilmovima(filmovi);
	}
	public static void ugasiPocetniEkran(){
		log.setVisible(true);
		pe.dispose();
	}
	public static void pokreniKorisnikEkran(){
		ke=new KorisnikEkran();
		ke.setVisible(true);
		pe.setVisible(false);
		ke.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				ugasiKorisnikEkran();
				
			}
		});
	}
	public static void ugasiKorisnikEkran(){
		pe.setVisible(true);
		ke.dispose();
	}
	public static void pokreniFilmEkran(Film film){
		fe=new FilmEkran(film);
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
		pe.setVisible(true);
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
	public static void pretraziFilmove(String naziv, int godina, String zanr){
		pomocna=pr.pretrazi(naziv, godina, zanr);
		ugasiPocetniEkran();
		pokreniPocetniEkran(pomocna);
	}
	public static void ponistiIzmene(){
		ugasiPocetniEkran();
		pokreniPocetniEkran(pr.getFilmovi());
	}
	public static void preporuciFilmove(){
		pomocna=pr.preporuci(ulogovanKorisnik);
		ugasiPocetniEkran();
		pokreniPocetniEkran(pomocna);
	}
}

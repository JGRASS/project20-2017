package pretrazivac.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;

import javax.management.RuntimeErrorException;
import javax.swing.JOptionPane;

import pretrazivac.Film;
import pretrazivac.Korisnik;
import pretrazivac.Pretrazivac;
import pretrazivac.gui.*;


public class GuiControler {
	private static Login log;
	private static PocetniEkran pe;
	private static KorisnikEkran ke;
	private static FilmEkran fe;
	private static KorisnikovFilmEkran kf;
	private static SignUpEkran su;
	private static Pretrazivac pr;
	private static Korisnik ulogovanKorisnik;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LinkedList<Film> filmovi1 = new LinkedList<Film>();
					LinkedList<Film> filmovi3 = new LinkedList<Film>();
					LinkedList<Film> filmovi2 = new LinkedList<Film>();
					LinkedList<Film> filmovi4 = new LinkedList<Film>();
					LinkedList<Korisnik> korisnici = new LinkedList<>();
				
					
					Film f1 = new Film();
					f1.setNaziv("a");
					f1.setGodina(2015);
					f1.setBrojPregleda(1);
					f1.setImagepath("faef");
					f1.setOcena(7);
					f1.setZanr("fa");
					f1.setTrailerpath("faf");
					filmovi1.add(f1);
					
					
					Film f2 = new Film();
					f2.setNaziv("b");
					f2.setGodina(2013);
					f2.setBrojPregleda(1);
					f2.setImagepath("faef");
					f2.setOcena(8);
					f2.setZanr("fa");
					f2.setTrailerpath("faf");
					filmovi1.add(f2);
					
					Film f3 = new Film();
					f3.setNaziv("fa");
					f3.setGodina(2014);
					f3.setBrojPregleda(1);
					f3.setImagepath("faef");
					f3.setOcena(5);
					f3.setZanr("fa");
					f3.setTrailerpath("faf");
					filmovi2.add(f3);
					
					Film f4 = new Film();
					f4.setNaziv("gaga");
					f4.setGodina(2015);
					f4.setBrojPregleda(1);
					f4.setImagepath("faef");
					f4.setOcena(3);
					f4.setZanr("fa");
					f4.setTrailerpath("faf");
					filmovi2.add(f4);
					
					Film f5 = new Film();
					f5.setNaziv("a");
					f5.setGodina(2015);
					f5.setBrojPregleda(1);
					f5.setImagepath("faef");
					f5.setOcena(7);
					f5.setZanr("fa");
					f5.setTrailerpath("faf");
					filmovi3.add(f5);
					
					Film f6 = new Film();
					f6.setNaziv("a");
					f6.setGodina(2015);
					f6.setBrojPregleda(1);
					f6.setImagepath("faef");
					f6.setOcena(3);
					f6.setZanr("fa");
					f6.setTrailerpath("faf");
					filmovi4.add(f6);
					
					Film f8 = new Film();
					f8.setNaziv("b");
					f8.setGodina(2013);
					f8.setBrojPregleda(1);
					f8.setImagepath("faef");
					f8.setOcena(4);
					f8.setZanr("fa");
					f8.setTrailerpath("faf");
					filmovi4.add(f8);
					
					Film f7 = new Film();
					f7.setNaziv("fjdkfdkfd");
					f7.setGodina(2015);
					f7.setBrojPregleda(1);
					f7.setImagepath("faef");
					f7.setOcena(3);
					f7.setZanr("fa");
					f7.setTrailerpath("faf");
					filmovi4.add(f7);
					
					Film f9= new Film();
					f9.setNaziv("fjdkfkdjfk");
					f9.setGodina(2015);
					f9.setBrojPregleda(1);
					f9.setImagepath("faef");
					f9.setOcena(3);
					f9.setZanr("fa");
					f9.setTrailerpath("faf");
					filmovi3.add(f9);
					
					Film f10 = new Film();
					f10.setNaziv("gahga");
					f10.setGodina(2015);
					f10.setBrojPregleda(1);
					f10.setImagepath("faef");
					f10.setOcena(3);
					f10.setZanr("fa");
					f10.setTrailerpath("faf");
					filmovi3.add(f10);
					
					
					//SOSortirajPoOceni.izvrsi(filmovi);
					
					Korisnik k1 = new Korisnik();
					k1.setIme("Ana");
					k1.setPrezime("C");
					k1.setPass("anacolovic");
					k1.setUsername("anacolovic");
					k1.setKoeficijent(0);
					k1.setFilmovi(filmovi1);
					korisnici.add(k1);
					
					Korisnik k2 = new Korisnik();
					k2.setIme("Ana");
					k2.setPrezime("C");
					k2.setPass("adasksjdksdksd");
					k2.setUsername("jjjjjjjjjjjjjjjj");
					k2.setKoeficijent(0);
					k2.setFilmovi(filmovi2);
					korisnici.add(k2);
					
					Korisnik k3 = new Korisnik();
					k3.setIme("Ana");
					k3.setPrezime("C");
					k3.setPass("adasdjdfdkf");
					k3.setUsername("jjjjjjjjjjj");
					k3.setKoeficijent(0);
					k3.setFilmovi(filmovi3);
					korisnici.add(k3);
					
					Korisnik k4 = new Korisnik();
					k4.setIme("Ana");
					k4.setPrezime("C");
					k4.setPass("adkfjkdfdasd");
					k4.setUsername("jjjjjjjjjjjjjjjjjj");
					k4.setKoeficijent(0);
					k4.setFilmovi(filmovi4);
					korisnici.add(k4);
					LinkedList<Film> filmovi=new LinkedList<>();
					filmovi.add(f1);
					filmovi.add(f2);
					filmovi.add(f3);
					filmovi.add(f4);
					filmovi.add(f2);
					filmovi.add(f1);
					filmovi.add(f3);
					filmovi.add(f4);
					filmovi.add(f1);
					filmovi.add(f2);
					filmovi.add(f3);
					filmovi.add(f4);
					filmovi.add(f1);
					filmovi.add(f2);
					filmovi.add(f3);
					filmovi.add(f4);
					filmovi.add(f1);
					filmovi.add(f2);
					filmovi.add(f3);
					filmovi.add(f4);
					filmovi.add(f1);
					filmovi.add(f2);
					filmovi.add(f3);
					filmovi.add(f4);

					pr=new Pretrazivac();
					pr.setKorisnici(korisnici);
					pr.setFilmovi(filmovi);
					log= new Login();
					log.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void pokreniPocetniEkran(){
		pe=new PocetniEkran();
		pe.setVisible(true);
		log.setVisible(false);
		pe.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				ugasiPocetniEkran();
				
			}
		});
		napuniPocetniPanelFilmovima();
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
	public static void pokreniKorisnikFilmEkran(){
		kf=new KorisnikovFilmEkran();
		kf.setVisible(true);
		ke.setVisible(false);
		kf.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				ugasiKorisnikovFilmEkran();
				
			}
		});
	}
	public static void ugasiKorisnikovFilmEkran(){
		ke.setVisible(true);
		kf.dispose();
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
		}
		pokreniPocetniEkran();
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
		

	}
	public static void napuniPocetniPanelFilmovima(){
		for(int i=0;i<pr.getFilmovi().size();i++){
			PristupFilmu d=new PristupFilmu(pr.getFilmovi().get(i));
			d.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					pokreniFilmEkran(d.getFilm());
				}
			});
			pe.dodajDugme(d);
		}
		
	}
	
}

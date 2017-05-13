package pretrazivac.gui;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;

import javax.management.RuntimeErrorException;
import javax.swing.JOptionPane;

import pretrazivac.Korisnik;
import pretrazivac.Pretrazivac;
import pretrazivac.gui.KorisnikEkran;
import pretrazivac.gui.Login;
import pretrazivac.gui.PocetniEkran;
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
					pr=new Pretrazivac();
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
	public static void pokreniFilmEkran(){
		fe=new FilmEkran();
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
		for(Korisnik k:pr.getKorisnici()){
			if(k.getUsername().equals(username) && k.getPass().equals(pass))
				ulogovanKorisnik=k;
				
		}
		if(ulogovanKorisnik==null)
			throw new RuntimeException();
		}catch (RuntimeException e){
			log.postaviPrazan();
			JOptionPane.showMessageDialog(log, "Uneli ste pogresan username ili password","Login Greska", JOptionPane.ERROR_MESSAGE);
		}
		
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
	
}

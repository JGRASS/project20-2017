package pretrazivac;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.After;

public class FilmTest {
	Film f;
	
	@Before
	public void setUp() throws Exception {
		f = new Film();
	}

	@After
	public void tearDown() throws Exception {
		f=null;
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetNazivNull(){
		f.setNaziv(null);
	}
	
	@Test
	public void testSetNaziv(){
		f.setNaziv("Taken");
		assertEquals("Taken",f.getNaziv());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetZanrNull(){
		f.setZanr(null);
	}
	
	@Test
	public void testSetZanr(){
		f.setZanr("triler");
		assertEquals("triler",f.getZanr());
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetGodinaManjaOd(){
		f.setGodina(1800);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetGodinaVecaOd(){
		f.setGodina(3000);
	}
	
	@Test
	public void testSetGodina(){
		f.setGodina(2008);
		assertEquals(2008, f.getGodina());
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetOcenaManjaOd(){
		f.setOcena(-6);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetOcenaVecaOd(){
		f.setOcena(30);
	}
	
	@Test
	public void testSetOcena(){
		f.setOcena(9.8);
		assertEquals(9.8, f.getOcena(), 0.0001);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetImagePathNull(){
		f.setImagepath(null);
	}
	
	@Test
	public void testSetImagePath(){
		f.setImagepath("/data/film.dat");
		assertEquals("/data/film.dat", f.getImagepath());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetTrailerPathNull(){
		f.setTrailerpath(null);
	}
	
	@Test
	public void testSetTrailerPath(){
		f.setTrailerpath("/data/film.dat");
		assertEquals("/data/film.dat", f.getTrailerpath());
	}
}

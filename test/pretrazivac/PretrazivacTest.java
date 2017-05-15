package pretrazivac;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.AssertionFailedError;

public class PretrazivacTest {
	Pretrazivac p;
	@Before
	public void setUp() throws Exception {
		p = new Pretrazivac();
	}

	@After
	public void tearDown() throws Exception {
		p=null;
	}
	
	@Test
	public void testUbaciKorisnika(){
		Korisnik k = new Korisnik();
		k.setIme("Jovana");
		k.setPrezime("Mirovic");
		k.setUsername("jovanam");
		k.setKoeficijent(0);
		k.setPass("jovanam96");
		k.setFilmovi(null);
		assertTrue(p.ubaciKorisnika(k));
	}
	
	@Test
	public void testUbaciKorisnikaIsti(){
		Korisnik k = new Korisnik();
		k.setIme("jovana");
		k.setPrezime("Mirovic");
		k.setUsername("admin");
		k.setKoeficijent(0);
		k.setPass("jovanam96");
		k.setFilmovi(null);
		assertFalse(p.ubaciKorisnika(k));
	}
	
	
}

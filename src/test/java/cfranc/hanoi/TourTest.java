package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

	Tour tour = new Tour();
	Disque disqueSmall = new Disque(1);
	Disque disqueMedium = new Disque(5);
	Disque disqueLarge = new Disque(10);

	@Test
	public void empiler_Tour(){
		boolean expected = true;
		boolean actuel = tour.empiler(disqueSmall);
		assertEquals(expected, actuel);
	}

	@Test
	public void empiler_TourFalse(){
		boolean expected = false;
		tour.empiler(disqueSmall);
		boolean actuel = tour.empiler(disqueLarge);
		assertEquals(expected, actuel);
	}

	@Test
	public void depiler_Tour(){
		Disque expected = disqueSmall;
		tour.empiler(disqueSmall);
		Disque actuel = tour.depiler();
		assertEquals(expected, actuel);
	}

	@Test
	public void disqueSomet(){
		Disque expected = disqueSmall;
		tour.empiler(disqueSmall);
		Disque actuel = tour.sommet();
		assertEquals(expected,actuel);
	}

	@Test
	public void tourPleineTrue(){
		boolean expected = true;
		tour.empiler(disqueLarge);
		tour.empiler(disqueMedium);
		tour.empiler(disqueSmall);
		boolean actuel = tour.estPleine();
		assertEquals(expected, actuel);
	}

	@Test
	public void tourPleineFalse(){
		boolean expected = false;
		boolean actuel = tour.estPleine();
		assertEquals(expected, actuel);
	}

	@Test
	public void tourVide(){
		boolean expected = true;
		boolean actuel = tour.estVide();
		assertEquals(expected, actuel);
	}

	@Test
	public void tailleTour(){
		int expected = 1;
		tour.empiler(disqueSmall);
		int actuel = tour.taille();
		assertEquals(expected, actuel);
	}

	@Test
	public void diamNull(){
		int expected = Integer.MAX_VALUE;
		int actuel = tour.diam();
		assertEquals(expected,actuel);
	}

	@Test
	public void diamSmall(){
		int expected = disqueSmall.d;
		tour.empiler(disqueSmall);
		int actuel = tour.diam();
		assertEquals(expected,actuel);
	}


}

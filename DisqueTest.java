package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisqueTest {
	Disque dSmall = new Disque(1);
	Disque dLarge = new Disque(3);
	Disque noDisk = new  Disque(0);

	@Test
	public void testCompareTo() {
		Disque petit = new Disque(1);
		Disque moyen = new Disque(2);
		Disque grand = new Disque(3);
		assertEquals(-1, petit.compareTo(moyen));
		assertEquals(-1, moyen.compareTo(grand));
		//TODO : à compléter
	}

	@Test
	public void compareTo_SmallLarge_Negatif(){
		int expected = -1;
		int actual = dSmall.compareTo(dLarge);
		assertEquals(expected, actual);
	}

	@Test
	public void compareTo_LargeSmall_Positif(){
		int expected = 1;
		int actual = dLarge.compareTo(dSmall);
		assertEquals(expected, actual);
	}

	@Test
	public void compareTo_SmallnoDisk(){
		int expected = 1;
		int actuel = dSmall.compareTo(noDisk);
		assertEquals(expected, actuel);
	}


}

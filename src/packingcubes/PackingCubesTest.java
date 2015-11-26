package packingcubes;

import static org.junit.Assert.*;

import org.junit.Test;

public class PackingCubesTest {

	@Test
	public void test1() {
		assertEquals(3, PackingCubes.getMinimumCost(1));
	}

	@Test
	public void test2() {
		assertEquals(6, PackingCubes.getMinimumCost(6));
	}

	@Test
	public void test3() {
		assertEquals(9, PackingCubes.getMinimumCost(7));
	}

	@Test
	public void test4() {
		assertEquals(11, PackingCubes.getMinimumCost(25));
	}
	
	@Test
	public void test5() {
		assertEquals(18, PackingCubes.getMinimumCost(200));
	}
	
}

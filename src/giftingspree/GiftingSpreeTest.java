package giftingspree;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class GiftingSpreeTest {

	@Test
	public void test1() {
		assertEquals(2, GiftingSpree.getMaximumItems(4.0, Arrays.asList(2.0, 2.0, 2.0)));
	}

	@Test
	public void test2() {
		assertEquals(1, GiftingSpree.getMaximumItems(5.0, Arrays.asList(5.0, 6.0, 1.0)));
	}

	@Test
	public void test3() {
		assertEquals(0, GiftingSpree.getMaximumItems(5.0, Arrays.asList(7.0, 6.0, 6.0)));
	}

	@Test
	public void test4() {
		assertEquals(3, GiftingSpree.getMaximumItems(7.0, Arrays.asList(0.0, 4.0, 3.0, 1.0, 2.0, -2.0)));
	}
}

package org.institutoserpis.ED;
import static org.junit.Assert.*;
import junit.framework.Assert;
import org.junit.Test;

public class VectorTest {

	@Test
	public void testMin() {
//		int[] v = new int[] { 32, 33, 16, 15, 7 };
//		int menor = Vector.min(v);
//		assertEquals(7, menor);
//		v = new int [] { 12, 33, 16, 15, 24 };
//		menor = Vector.min(v);
//		assertEquals(12, menor);
		assertEquals(15, Vector.min(new int [] {19, 33, 16, 15, 17})); 

	@Test
	public void testIndexOf() {
		int[] v = new int[] { 12, 33, 15, 7 };
		assertEquals(0, Vector.indexOf(v, 12));
		assertEquals(5, Vector.indexOf(v, 12));
		assertEquals(12, Vector.indexOf(v, 12));
		assertEquals(9, Vector.indexOf(v, 12));
		}

}
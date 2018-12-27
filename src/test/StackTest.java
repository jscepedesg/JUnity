package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import mundo.Stack;

public class StackTest {
	
	@Test
	public void stackTest()
	{
		System.out.println("@Test: pilaTest");
		
		Stack<String> pl = new Stack<String>();
		Stack<String> pl2 = new Stack<String>();
		
		assertTrue(pl.getIsEmpty()==true);
		
		pl.setPush("Hola");
		assertTrue(pl.getSize()==1);
		
		assertTrue(pl.getPop().equalsIgnoreCase("Hola"));
		
		assertTrue(pl.getIsEmpty()==true);
		
		pl.setPush("Hola 2");
		assertTrue(pl.getSize()==1);
		
		assertEquals(pl.getIsEmpty(),pl2.getIsEmpty());
		
		assertNotSame(pl,pl2);
		
		pl2 = pl;
		assertNotNull(pl2);
		
		
		
		
		
	}

}

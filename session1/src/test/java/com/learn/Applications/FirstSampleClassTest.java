package com.learn.Applications;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstSampleClassTest {

	@Test
	public void positiveTestcase() {
		//positive test case
		FirstSampleClass firstSampleClassObject = new FirstSampleClass();
		assertEquals(5, firstSampleClassObject.add(2, 3));
	}
	
	@Test
	public void NegativeTestCase()
	{
		//negative test case
		FirstSampleClass firstSampleClassObject = new FirstSampleClass();
		assertNotEquals(4, firstSampleClassObject.add(2, 3));
	}
	

}

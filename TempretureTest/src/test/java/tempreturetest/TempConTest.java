package tempreturetest;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import tempreture.TempCon;


public class TempConTest {

	TempCon temp = new TempCon();
	
	
	@BeforeClass
		public static void init () {
		System.out.println("Before All Test");
	}
	
	@Test
		public void test1 () {
		System.out.println("First Test");
		
		assertEquals (20, temp.convertFahrenheitToCelsius(10), 2);
		
	}
	
	
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
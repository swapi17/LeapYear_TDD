  
package leapyear;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLeapYear {

	private LeapYear leapYear;

	@Before
	public void setUp() throws Exception {
		
	    leapYear = new LeapYear();
		
	}

	@Test
	public void when2000_thenIsLip() {
		boolean isLeap = this.isLeap(2000);
		assertTrue(isLeap);	
	}
        
	@Test
	public void when1700_thenIsNotLip() {
		boolean isLeap = this.isLeap(1700);
		assertFalse(isLeap);	
	}
	
	@Test
	public void when2008_thenIsLip() {
		boolean isLeap = this.isLeap(2008);
		assertTrue(isLeap);	
	}
	
	@Test
	public void when2017_thenIsNotLip() {
		boolean isLeap = this.isLeap(2017);
		assertTrue(isLeap);	
	}
	
	private boolean isLeap(int year) {
		return leapYear.isLeap(year);
	}
	
}

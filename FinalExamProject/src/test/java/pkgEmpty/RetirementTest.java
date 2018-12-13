package pkgEmpty;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Retirement;

public class RetirementTest {

	@Test
	public void testPMT() {
		
		Retirement R = new Retirement(40,7,20,2,10000,2642);
		System.out.println(R.AmountToSave());
		assertEquals(554.13,R.AmountToSave(),2);
		
	}
	@Test
	public void testPV() {
	
		Retirement R1 = new Retirement(40,7,20,2,10000,2642);
		System.out.println(R1.TotalAmountSaved());
		assertEquals(1454485.55,R1.TotalAmountSaved(),2);
	}

}

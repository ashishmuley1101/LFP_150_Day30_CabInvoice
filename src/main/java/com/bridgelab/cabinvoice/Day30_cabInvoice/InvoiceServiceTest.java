package com.bridgelab.cabinvoice.Day30_cabInvoice;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceServiceTest {

	@Test
	public void givenDistanceAndTime_whenCalculateFare_ShouldReturnTotalFare() { // Pass Case
		CabInvoiceGenerator invoiceService = new CabInvoiceGenerator();
		double totalFare = invoiceService.calculateFare(2.0, 5);
		System.out.println("Total Fare = " + totalFare);
		Assert.assertEquals(25.0, totalFare, 0.0);
	}

	@Test
	public void givenDistanceAndTime1_whenCalculateFare_ShouldReturnTotalFare() { // Fail Case
		CabInvoiceGenerator invoiceService = new CabInvoiceGenerator();
		double totalFare = invoiceService.calculateFare(0, 5);
		System.out.println("Total Fare = " + totalFare);
		Assert.assertEquals(25.0, totalFare, 0.0);
	}

	@Test
	public void givenDistanceAndTime_whenCalculateFareIsLessThan5_ShouldReturnTotalFareAs5() {
		CabInvoiceGenerator invoiceService = new CabInvoiceGenerator();
		double totalFare = invoiceService.calculateFare(0.1, 1);
		System.out.println("Total Fare = " + totalFare);
		Assert.assertEquals(5, totalFare, 0.0);
	}
}

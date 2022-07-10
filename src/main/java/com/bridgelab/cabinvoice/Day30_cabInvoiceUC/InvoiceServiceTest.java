package com.bridgelab.cabinvoice.Day30_cabInvoiceUC;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceServiceTest {
//
//	@Test
//	public void givenDistanceAndTime_whenCalculateFare_ShouldReturnTotalFare() { // Pass Case
//		CabInvoiceGenerator invoiceService = new CabInvoiceGenerator();
//		double totalFare = invoiceService.calculateFare(2.0, 5);
//		System.out.println("Total Fare = " + totalFare);
//		Assert.assertEquals(25.0, totalFare, 0.0);
//	}

//	@Test
//	public void givenDistanceAndTime1_whenCalculateFare_ShouldReturnTotalFare() { // Fail Case
//		CabInvoiceGenerator invoiceService = new CabInvoiceGenerator();
//		double totalFare = invoiceService.calculateFare(0, 5);
//		System.out.println("Total Fare = " + totalFare);
//		Assert.assertEquals(25.0, totalFare, 0.0);
//	}
//
//	@Test
//	public void givenDistanceAndTime_whenCalculateFareIsLessThan5_ShouldReturnTotalFareAs5() {
//		CabInvoiceGenerator invoiceService = new CabInvoiceGenerator();
//		double totalFare = invoiceService.calculateFare(0.1, 1);
//		System.out.println("Total Fare = " + totalFare);
//		Assert.assertEquals(5, totalFare, 0.0);
//	}

	@Test
	public void givenMultipleRides_whenCalculateFare_ShouldReturnAggregateTotalFare() {
		CabInvoiceGenerator invoiceService = new CabInvoiceGenerator();
		Rides[] rides = { new Rides(2.0, 5), new Rides(1.0, 5), new Rides(0.1, 1) };
		InvoiceSummary expectedSummary = new InvoiceSummary(3, 45);
		InvoiceSummary summary = invoiceService.calculateFare(rides);
		Assert.assertEquals(expectedSummary, summary);
	}
}

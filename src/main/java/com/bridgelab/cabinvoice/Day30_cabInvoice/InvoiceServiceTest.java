package com.bridgelab.cabinvoice.Day30_cabInvoice;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceServiceTest {

	@Test
    public void givenDistanceAndTime_whenCalculateFare_ShouldReturnTotalFare() {
		CabInvoiceGenerator invoiceService = new CabInvoiceGenerator();
        double totalFare = invoiceService.calculateFare(2.0, 5);
        System.out.println("Total Fare = " + totalFare);
        Assert.assertEquals(25.0, totalFare, 0.0);
    }
}

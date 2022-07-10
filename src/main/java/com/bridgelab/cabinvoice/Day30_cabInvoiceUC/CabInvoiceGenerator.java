package com.bridgelab.cabinvoice.Day30_cabInvoiceUC;

public class CabInvoiceGenerator {

	private final double COST_PER_KM = 10.0;
	private final int COST_PER_MIN = 1;
	private final double MIN_FARE = 5.0;

	public double calculateFare(double distance, int time) {
		double totalFare = distance * COST_PER_KM + time * COST_PER_MIN;
		return Math.max(totalFare, MIN_FARE);
	}

	public InvoiceSummary calculateFare(Rides[] rides) {
		double totalFare = 0.0;
		for (Rides ride : rides) {
			totalFare += calculateFare(ride.getDistance(), ride.getTime());
		}
		System.out.println("Length is " + rides.length + " Fare is " + totalFare);
		return new InvoiceSummary(rides.length, totalFare);
	}
	
	public Invoice CabInvoice(Rides[] rides, String invoiceId) {
        double totalFare = 0.0;
        for (Rides ride : rides) {
			totalFare += this.calculateFare(ride.getDistance(), ride.getTime());
		}
        System.out.println("Length is " + rides.length + " Fare is " + totalFare + " ID : " + invoiceId);
		return new Invoice(invoiceId,totalFare);
	}

	public static void main(String[] args) {
		System.out.println("****************Cab Invoice Generator****************");

		CabInvoiceGenerator cab = new CabInvoiceGenerator();
		double res = cab.calculateFare(2.0, 5);
		System.out.println("Total Fare = " + res);

	}

}

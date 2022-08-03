package com.assignment;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest
{
    /*
    Method to check the Test Case if Passing or Not
     */
    @Test
    public void givenTwoIntegerWhenCalculateShouldReturnTotalFare()
    {
        CabInvoice cabInvoice = new CabInvoice();
        double result = cabInvoice.calculateFare(0.2,1);
        Assert.assertEquals(5,result,0);
    }

    /*
    Test Method for testing Multiple Rides
     */
    @Test
    public void givenMultipleRidesWhenCalculateShouldReturnTotalFare()
    {
        CabInvoice cabInvoice = new CabInvoice();
        /*
        rideArray Contains Multiple Rides Distance and Values
         */
        double [][] rideArray = {
                {10,2},
                {4,6},
                {1.5,2}
        };
        double result = cabInvoice.calculateTotalFare(rideArray);
        Assert.assertEquals(165,result,0);
    }

    /*
    Test Method to Return the Following Parts of Invoice
    No-of-Rides
    Total-Fare
    Average-Fare
     */
    @Test
    public void givenArrayWhenCalculateShouldReturnTotalNumberOfRidesTotalFareAndAverageFarePrice()
    {
        InvoiceGenerator invoice = new InvoiceGenerator();
        double[][] rideArray = {
                {10,2},
                {4,6},
                {1.5,2}
        };
        int noOfRides = invoice.getTotalRides(rideArray);
        double totalFare = invoice.calculateTotalFare(rideArray);
        double averageFare = invoice.calculateAverageFare(rideArray);
        Assert.assertEquals(3,noOfRides);
        Assert.assertEquals(165,totalFare,0);
        Assert.assertEquals(55,averageFare,0);
    }
}

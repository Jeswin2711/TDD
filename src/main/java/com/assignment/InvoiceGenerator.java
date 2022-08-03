package com.assignment;

/*
Invoice Generator Class that has functions
getTotalRides
calculateTotalFare
calculateAverageFare
 */
public class InvoiceGenerator
{

    /*
    To return the No of Rides
     */
    public int getTotalRides(double[][] rideArray)
    {
        int count = 0;
        for(double[] a : rideArray)
        {
            count++;
        }
        return count;
    }

    /*
    To return the Total Fare
     */
    public double calculateTotalFare(double[][] rideArray) {
        CabInvoice cabInvoice = new CabInvoice();
        return cabInvoice.calculateTotalFare(rideArray);
    }

    /*
    To return the Average Fare by Diving the Total Fare with the total Count of Rides
     */
    public double calculateAverageFare(double[][] rideArray) {
        double totalFare = calculateTotalFare(rideArray);
        int noOfRides = getTotalRides(rideArray);
        double averageFare = totalFare / noOfRides;
        return averageFare;
    }
}

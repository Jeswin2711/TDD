package com.assignment;

public class CabInvoice
{
    /*
    Function to Calculate Fare Based on Distance and Time
     */
    public double calculateFare(double distance, double time)
    {
        double totalFare = (distance * 10) + time;
        if(totalFare < 5 ) return 5;
        else return totalFare;
    }

    /*
    Function to Calculate the Total Fare for Multiple Rides
     */
    public double calculateTotalFare(double[][] rideArray)
    {
        double totalFare = 0;
        for(double[] ride : rideArray)
        {
            totalFare += calculateFare(ride[0],ride[1]);
        }
        return totalFare;
    }
}

package com.assignment;

public class CabInvoice
{
    /*
    Function to Calculate Fare Based on Distance and Time
     */
    public double calculateFare(double distance, double time)
    {
        double totalFare = (distance * 10) + time;
        if((distance * 10) + time < 5 ) return 5;
        else return totalFare;
    }
}

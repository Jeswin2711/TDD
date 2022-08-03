package com.assignment;

import java.util.HashMap;
import java.util.Map;

public class InvoiceService
{
    Map<Integer,Double> invoice = new HashMap<>();
    CabInvoice cabInvoice = new CabInvoice();
    /*
    getInvoice function has two argument user_id and rideArray that returns the totalfare of the user_id
     */
    public double getInvoice(int user_id, double[][] rideArray) {
        for(int i = 0 ; i < rideArray.length ; i++)
        {
            invoice.put(i+1,cabInvoice.calculateFare(rideArray[i][0],rideArray[i][1]));
            System.out.println("------"+invoice);
        }
        return invoice.get(user_id);
    }
}

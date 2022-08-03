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
}

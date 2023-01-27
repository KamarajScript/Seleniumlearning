package com.sample.Iview;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {

    @Test
    public void testAssertions() {
        String str1 = new String("Test");
        String str2 = new String("Test");
        String str3 = null;
        String str4 = "Test";
        String str5 = "Test";
        String str6 = new String("Not Test");
        int val1 = 5;
        int val2 = 6;
        Assert.assertEquals(str1, str2);
        System.out.println("Equal Assertion is Successfully");
        Assert.assertNotEquals(str2,str6);
        System.out.println("Not Equal Assertion is Successfully");
        Assert.assertTrue(val1<val2);
        System.out.println("True Assertion is Successfully");
        Assert.assertFalse(val1>val2);
        System.out.println("False Assertion is Successfully");
        Assert.assertNotNull(str1);
        System.out.println("Notnull Assertion is Successfully");
        Assert.assertNull(str3);
        Assert.assertSame(str4, str5);
        System.out.println("Same Assertion is successful");
        Assert.assertNotSame(str1,str3);
        System.out.println("Not Same Assertion is successful");

    }

}

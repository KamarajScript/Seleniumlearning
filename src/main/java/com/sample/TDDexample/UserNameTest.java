package com.sample.TDDexample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserNameTest {

    @Test
    public void TestUsernameLength(){
        Username user = new Username();
        Assert.assertEquals(true, user.isValid("KAMARAJ"));
        user.isValid("Kamaraj");
    }
}

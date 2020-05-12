package test;


import org.testng.annotations.Test;
import org.testng.Assert;
import base.BaseTest;



public class LoginTest extends BaseTest
{
    public final String username = "miq.mir.93";
    public final String password = "homework2020";
    public final String wrongPass = "homework";

    @Test
    public void testSuccessfulLogin()
    {
        loginPage.successLogin();
        Assert.assertTrue(mainPage.getUsername().toLowerCase().contains("miq.mir.93@mail.ru"));


    }

    @Test
    public void testFailLogin()
    {
        String actual_error = loginPage.invalidLogin(username,wrongPass);
        System.out.println(actual_error);
        Assert.assertEquals(actual_error,"Неверное имя или пароль");
    }
    @Test
    public void checkUserInfo() {
        loginPage.successLogin();
        Assert.assertTrue(mainPage.getUsername().toLowerCase().contains("miq.mir.93@mail.ru"));


    }
}
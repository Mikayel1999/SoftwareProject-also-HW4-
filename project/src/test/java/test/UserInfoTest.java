package test;


import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class UserInfoTest extends BaseTest {

    @Test
    public void checkUserInfo() {
        loginPage.successLogin();
        mainPage.clickUsername();
        mainPage.clickPersonalData();
        Assert.assertTrue(mainPage.personalDataPage().contains("Личные данные"));
        Assert.assertTrue(mainPage.getNameFromPersonalData().contains("miq"));
        Assert.assertTrue(mainPage.getSurnameFromPersonalData().contains("mir"));
        Assert.assertTrue(mainPage.getNicknameFromPersonalData().contains("miq mir"));


    }

}
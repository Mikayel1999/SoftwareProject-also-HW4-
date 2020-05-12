package test;


import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GameTest extends BaseTest {

    @Test
    public void checkUserInfo() {
        loginPage.successLogin();
        Assert.assertTrue(mainPage.getUsername().toLowerCase().contains("miq.mir.93@mail.ru"));
        mainPage.goGamePage();
        Assert.assertTrue(gamePage.getLogoText().contains("Игры Mail.Ru"));
        gamePage.clickSearchLogo();
        gamePage.setSearchingText("Call of Duty");
        gamePage.search();
        Assert.assertTrue(gamePage.getGameName().contains("Call of Duty"));


    }

}
import helpers.Common;
import org.junit.Test;
import pages.CarsPage;
import pages.DogsPage;
import pages.HomePage;

public class SSlvDemoPom {

    Common common = new Common();
    HomePage homePage = new HomePage();
    DogsPage dogsPage = new DogsPage();
    CarsPage carsPage = new CarsPage();


    @Test
    public void suniUnKuceniTest(){
        common.startChrome();
        homePage.openHomePage();
        homePage.openSpecificTab("Dogs");
        dogsPage.fillMinPriceAndMaxPrice("1", "1000");
        dogsPage.fillMinAgeAndMaxAge("1", "10");
        dogsPage.pressSearchButton();
        common.stopChrome();
    }
    @Test
    public void carsTestYears(){
        common.startChrome();
        homePage.openHomePage();
        homePage.openSpecificTab("Cars");
        carsPage.fillMinAndMaxYear("1990", "2004");
        carsPage.pressSearchButton();
        common.stopChrome();
    }
    @Test
    public void carPrice(){
        common.startChrome();
        homePage.openHomePage();
        homePage.openSpecificTab("Cars");
        carsPage.fillMinPriceAndMaxPrice("1000", "3000");
        carsPage.pressSearchButton();
        common.stopChrome();
    }
    @Test
    public void engineType(){
        common.startChrome();
        homePage.openHomePage();
        homePage.openSpecificTab("Cars");
        carsPage.fillEngineType("Hybrid");
        carsPage.pressSearchButton();
        common.stopChrome();
    }
    @Test
    public void engineVolume(){
        common.startChrome();
        homePage.openHomePage();
        homePage.openSpecificTab("Cars");
        carsPage.fillEngineVolume("1.0", "2.0");
        carsPage.pressSearchButton();
        common.stopChrome();
    }
    @Test
    public void transmisionType(){
        common.startChrome();
        homePage.openHomePage();
        homePage.openSpecificTab("Cars");
        carsPage.fillTransmisionType("Automats");
        carsPage.pressSearchButton();
        common.stopChrome();
    }
    @Test
    public void bodyType(){
        common.startChrome();
        homePage.openHomePage();
        homePage.openSpecificTab("Cars");
        carsPage.fillBodyType("Kupeja");
        carsPage.pressSearchButton();
        common.stopChrome();

    }
    @Test
    public void carColor(){
        common.startChrome();
        homePage.openHomePage();
        homePage.openSpecificTab("Cars");
        carsPage.fillCarColor("Sarkana");
        carsPage.pressSearchButton();
        common.stopChrome();
    }



}

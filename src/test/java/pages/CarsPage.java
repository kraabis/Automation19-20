package pages;

import helpers.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

    public class CarsPage extends Common {

        private final By minYear = By.id("f_o_18_min");
        private final By engineTypeSelector = By.id("f_o_34");
        private final By maxYear = By.id("f_o_18_max");
        private final By searchButton = By.xpath("//input[@class='b s12']");
        private final By minPrice = By.id("f_o_8_min");
        private final By maxPrice = By.id("f_o_8_max");
        private final By minVolume = By.id("f_o_15_min");
        private final By maxVolume = By.id("f_o_15_max");
        private final By transmisionTypeSelector = By.id("f_o_35");
        private final By bodyTypeSelector = By.id("f_o_32");
        private final By carColorSelector = By.id("f_o_17");

        public void fillMinAndMaxYear(String min, String max) {
            driver.findElement(minYear).sendKeys(min);
            driver.findElement(maxYear).sendKeys(max);
        }

        public void fillMinPriceAndMaxPrice(String min, String max) {
            driver.findElement(minPrice).sendKeys(min);
            driver.findElement(maxPrice).sendKeys(max);
        }

        public void fillEngineVolume(String min, String max) {
            driver.findElement(minVolume).sendKeys(min);
            driver.findElement(maxVolume).sendKeys(max);
        }

        public void fillEngineType(String choosenEngineType) {
            Select engineType = new Select(driver.findElement(engineTypeSelector));
            if ("Hybrid".equals(choosenEngineType)) {
                engineType.selectByValue("7434");
            } else if ("Benzins".equals(choosenEngineType)) {
                engineType.selectByValue("493");
            }
        }

        public void fillTransmisionType (String chooseTransmisionType) {
            Select transmisionType = new Select(driver.findElement(transmisionTypeSelector));
            if ("Automats".equals(chooseTransmisionType)) {
                transmisionType.selectByValue("497");
            } else if ("Manuala".equals(chooseTransmisionType)) {
                transmisionType.selectByValue("496");
            }
        }
        public void fillBodyType (String chooseBodyType) {
            Select bodyType = new Select(driver.findElement(bodyTypeSelector));
            if ("Kupeja".equals(chooseBodyType)){
                bodyType.selectByValue("487");
            } else if ("Universals".equals(chooseBodyType)){
                bodyType.selectByValue("483");
            }

        }
        public void fillCarColor (String chooseCarColor) {
            Select carColor = new Select(driver.findElement(carColorSelector));
            if("Balta".equals(chooseCarColor)){
                carColor.selectByValue("6318");
            } else if("Melna".equals(chooseCarColor)){
                carColor.selectByValue("153");
            }
            else if("Sarkana".equals(chooseCarColor)){
                carColor.selectByValue("6308");
            }
            else if("Zila".equals(chooseCarColor)){
                carColor.selectByValue("6314");
            }
        }


        public void pressSearchButton() {
            driver.findElement(searchButton).click();
        }
    }

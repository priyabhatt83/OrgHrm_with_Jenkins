package OrgHRM;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class Hooks extends Utils {


    BrowserSelecter browserSelecter = new BrowserSelecter();


    @Before//run before every method
    public void openBrowser(){
        browserSelecter.setUpBrowser();
        //Asking Driver to get the URL.
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @After //run after every method //ITestResult result

    public void closeBrowser(Scenario scenario) {
        if (scenario.isFailed()) {
            try {

                TakesScreenshot ts = (TakesScreenshot) driver;

                File source = ts.getScreenshotAs(OutputType.FILE);

                FileUtils.copyFile(source, new File("ScreenShots\\" + scenario.getName() + ".png"));

                System.out.println("Screenshot taken");
            } catch (Exception e) {

                System.out.println("Exception while taking screenshot" + e.getMessage());
            }

        }
        driver.quit();
    }
}
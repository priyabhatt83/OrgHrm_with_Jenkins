package OrgHRM;

import org.openqa.selenium.By;

public class VerificationPage extends Utils {

    private By _welcomeadmin =By.linkText("//div[@id='welcome-menu']");

    public void welcomePage(){
        asserCurrentURL("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

    }

    public void welcomeMessage(){


    }
}

package OrgHRM;

import org.openqa.selenium.By;

public class LoginPage extends Utils {



        LoadProps loadProps = new LoadProps();

        private By _username = By.xpath("//input[@id='txtUsername']");
        private By _password = By.xpath("//input[@id='txtPassword']");
        private By _loginbtn = By.xpath("//input[@id='btnLogin']");

        public void usershouldbeLogin() {

            enterText(_username, loadProps.getProperty("username"));
            enterText(_password, loadProps.getProperty("password"));
            clickElementBy(_loginbtn);


        }
    }



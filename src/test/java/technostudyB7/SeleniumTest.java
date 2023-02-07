package technostudyB7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        //to set the chrome driver
        WebDriverManager.chromedriver().setup();

// opening the browser
    WebDriver driver= new ChromeDriver();
//3- go to google page
 driver.get("https://www.google.com");

        System.out.println("title of google.com="+driver.getTitle());
        System.out.println("url of google.com="+driver.getCurrentUrl());
        driver.navigate().to("https://www.techno.study");

        String expectedTitle="<Join the best coding bootcamps online and get IT training in the US";
        String actualTitle= driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("verification is done:Pass");
            System.out.println("actual title="+actualTitle);
        }else System.out.println("verification is FAILED");
        System.out.println("actual title="+actualTitle);

    }
}
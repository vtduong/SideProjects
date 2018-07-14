package checker;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

public class Checker {

	public static void main(String[] args) {
		//source: https://stackoverflow.com/questions/35080166/how-to-login-into-website-using-java-code
		 // Create a new instance of the html unit driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanduong\\Documents\\SideProjects\\JavaProjects\\jarFiles\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //visit website
        driver.manage().window().maximize();
        driver.get("https://my.concordia.ca/psp/upprpr9/?cmd=login&languageCd=ENG&");

        // Find the text input element by its name
        driver.findElement(By.id("userid")).sendKeys("v_duo");
        //find password field and enter
        WebElement pw = driver.findElement(By.id("pwd"));
        pw.sendKeys("Dung&Diem93");
        pw.submit();
        
        //go to student center
        driver.get("https://campus.concordia.ca/psp/pscsprd/EMPLOYEE/SA/c/SA_LEARNER_SERVICES.SSS_STUDENT_CENTER.GBL?");
        
        //click on third enroll button
        driver.findElement(By.id("DERIVED_SSS_SCR_SSS_LINK_ANCHOR2")).click();
        //select first term on the list and continue;
        driver.findElement(By.id("SSR_DUMMY_RECV1$sels$0$$0")).click();
        driver.findElement(By.id("DERIVED_SSS_SCT_SSR_PB_GO")).click();
        //select search
        driver.findElement(By.id("DERIVED_REGFRM1_SSR_PB_SRCH")).click();
        
        //select course career
        driver.findElement(By.id("SSR_CLSRCH_WRK_ACAD_CAREER$0")).click();
        //select 

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());

       // driver.quit();

	}

}

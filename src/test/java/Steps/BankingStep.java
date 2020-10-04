package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.*;


public class BankingStep {

    public WebDriver driver;
    public WebElement element;
    public String parameter;
    WebDriverWait wait;

    public BankingStep() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/driver/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,30);
        driver.manage().window().maximize();
    }

    public void getUrl() {
        driver.get("https://www.ziraatbank.com.tr/tr");
    }

    @Given("^a web browser is at the Ziraat Bankası home page$")
    public void aWebBrowserIsAtTheZiraatBankasiHomePage() {
        getUrl();
    }

    @When("^the user clicks Bireysel->Krediler$")
    public void theUserClicksFirstBireyselThenKrediler() {
        //clicks bireysel
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[1]/header/div[2]/div[2]/nav/ul/li[1]/a")));
        element = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[1]/header/div[2]/div[2]/nav/ul/li[1]/a"));
        element.click();

        //clicks krediler
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div/a")));
        element = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div/a"));
        element.click();
    }

    @And("^the user clicks Tüketici Kredisi$")
    public void theUserClicksTuketiciKredisi() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/div[1]/ul/li[1]/a")));
        element = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/div[1]/ul/li[1]/a"));
        element.click();
    }

    @And("^the user clicks Hesaplama Aracı$")
    public void theUserClicksHesaplamaAraci() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[1]/div[1]/div[1]/div[3]/a[2]")));
        element = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[1]/div[1]/div[1]/div[3]/a[2]"));
        element.click();
    }


    @And("^the user picks Tüketici Kredisi, ürün, tutar, vade$")
    public void theUserPicksTuketiciKredisiUrunTutarVade() {
        //clicking credit menu
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[2]/div[1]/a")));
        element = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[2]/div[1]/a"));
        element.click();

        //selecting first tuketici kredisi
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div[1]/div/a[1]")));
        element = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div[1]/div/a[1]"));
        element.click();

        //selecting urun
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div[1]/span/span[1]/span")));
        element = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div[1]/span/span[1]/span"));
        element.click();

        //selecting second tuketici kredisi
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div[1]/select/option[3]")));
        element = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div[1]/select/option[3]"));
        element.click();

        //selecting tutar
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div[2]/div/div[2]/div/input")));
        element = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div[2]/div/div[2]/div/input"));
        element.clear();
        element.sendKeys("1000");

        //selecting vade
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div[3]/div/div[2]/div/input")));
        element = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div[3]/div/div[2]/div/input"));
        element.clear();
        element.sendKeys("24");

        parameter="tuketici";

    }
    @And("^the user cliks Hesapla$")
    public void theUserClicksHesapla() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div/div[1]/div/div/div[2]/div[2]/a")));
        element = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div/div[1]/div/div/div[2]/div[2]/a"));
        Thread.sleep(500);
        element.click();
    }
    @Then("^Hesap is checked$")
    public void hesapIsChecked() throws InterruptedException{
        String s1, s2, s3;
        if (parameter=="tuketici")
        {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/div/div/div[1]/div/div/div[3]/div[2]/div[1]/span")));
            s1 = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/div/div/div[1]/div/div/div[3]/div[2]/div[1]/span")).getText();
            assertEquals("50,55 TL",s1);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/div/div/div[1]/div/div/div[3]/div[2]/div[2]/span")));
            s2 = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/div/div/div[1]/div/div/div[3]/div[2]/div[2]/span")).getText();
            assertEquals("% 1,34",s2);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/div/div/div[1]/div/div/div[3]/div[2]/div[3]/span")));
            s3 = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/div/div/div[1]/div/div/div[3]/div[2]/div[3]/span")).getText();
            assertEquals("% 21.7515",s3);
        }
        else if (parameter=="konut"){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/div/div/div[1]/div/div/div[3]/div[2]/div[1]/span")));
            s1 = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/div/div/div[1]/div/div/div[3]/div[2]/div[1]/span")).getText();
            assertEquals("48,09 TL",s1);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/div/div/div[1]/div/div/div[3]/div[2]/div[2]/span")));
            s2 = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/div/div/div[1]/div/div/div[3]/div[2]/div[2]/span")).getText();
            assertEquals("% 1,29",s2);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/div/div/div[1]/div/div/div[3]/div[2]/div[3]/span")));
            s3 = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/div/div/div[1]/div/div/div[3]/div[2]/div[3]/span")).getText();
            assertEquals("% 54.2661",s3);
        }
        else if (parameter=="tasit"){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/div/div/div[1]/div/div/div[3]/div[2]/div[1]/span")));
            s1 = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/div/div/div[1]/div/div/div[3]/div[2]/div[1]/span")).getText();
            assertEquals("50,27 TL",s1);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/div/div/div[1]/div/div/div[3]/div[2]/div[2]/span")));
            s2 = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/div/div/div[1]/div/div/div[3]/div[2]/div[2]/span")).getText();
            assertEquals("% 1,30",s2);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/div/div/div[1]/div/div/div[3]/div[2]/div[3]/span")));
            s3 = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/div/div/div[1]/div/div/div[3]/div[2]/div[3]/span")).getText();
            assertEquals("% 21.0618",s3);

        }

        Thread.sleep(500);

    }
    @When("^the user picks Konut Kredisi, ürün, tutar, vade$")
    public void theUserPicksKonutKredisiUrunTutarVade(){
        //clicking credit menu
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div[1]/a")));
        element = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div[1]/a"));
        element.click();

        //selecting first konut kredisi
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div[1]/div/a[3]")));
        element = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div[1]/div/a[3]"));
        element.click();

        //selecting urun
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div[1]/span/span[1]/span")));
        element = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div[1]/span/span[1]/span"));
        element.click();

        //selecting second konut kredisi
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div[1]/select/option[3]")));
        element = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div[1]/select/option[3]"));
        element.click();

        //selecting tutar
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div[2]/div/div[2]/div/input")));
        element = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div[2]/div/div[2]/div/input"));
        element.clear();
        element.sendKeys("2000");

        //selecting vade
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div[3]/div/div[2]/div/input")));
        element = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div[3]/div/div[2]/div/input"));
        element.clear();
        element.sendKeys("60");

        parameter="konut";

    }

    @When("^the user picks Taşıt Kredisi, ürün, tutar, vade$")
    public void theUserPicksTasitKredisiUrunTutarVade(){
        //clicking credit menu
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[2]/div[1]/a")));
        element = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[2]/div[1]/a"));
        element.click();

        //selecting first Taşıt kredisi
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div[1]/div/a[2]")));
        element = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div[1]/div/a[2]"));
        element.click();

        //selecting urun
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div[1]/span/span[1]/span")));
        element = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div[1]/span/span[1]/span"));
        element.click();

        //selecting second Taşıt ürün kredisi
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div[1]/select/option[4]")));
        element = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div[1]/select/option[4]"));
        element.click();

        //selecting tutar
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div[2]/div/div[2]/div/input")));
        element = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div[2]/div/div[2]/div/input"));
        element.clear();
        element.sendKeys("1000");

        //selecting vade
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div[3]/div/div[2]/div/input")));
        element = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div[3]/div/div[2]/div/input"));
        element.clear();
        element.sendKeys("24");

        parameter="tasit";

    }



    @And("^driver close$")
    public void driverClose() throws InterruptedException{
        Thread.sleep(2000);
        driver.close();
    }

}


package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {

	public ChromeDriver  driver;
	
	@Given("Launch the browser and load the url")
	public void lauchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
	}		
	
	@When("Enter the username as {string}")
	public void enterUsername(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
	}
	@When("Enter the password as {string}")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	@When("Click the Login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}

	@Then ("Landing in the home page")
	public void verifyLogin() {
		System.out.println("Landed on the right page");
	}
	
	@But("Error message should be displayed")
	public void errorMessage() {
		System.out.println("Credentials are wrong");
	}
	
	@When("Click the crmsfa link")
	public void click_the_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();	}

	@When("Click the Leads link")
	public void click_the_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@When("click the createlead link")
	public void click_the_createlead_link() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@Then("Enter the companyname as {string}")
	public void enter_the_companyname(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}

	@Then("Enter the firstname as {string}")
	public void enter_the_firstname(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);

	}

	@Then("Enter the lastname as {string}")
	public void enter_the_lastname(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}

	@When("click the createlead button")
	public void click_the_createlead_button() {
		driver.findElement(By.className("smallSubmit")).click();	
	}

	@Then("Leads created Successfully")
	public void leads_created_successfully() {
	   String title = driver.getTitle();
	   System.out.println(title);
	}
}
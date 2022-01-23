package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {

	WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.edge.driver", "D:\\Testing\\New drivers\\msedgedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='//input[@name='txtPassword']']")).sendKeys("admin");

	}

	@And("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

	}

	@Then("it should redirect to homepage")
	public void it_should_redirect_to_homepage() {

		driver.getTitle();
	}

}

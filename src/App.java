import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "E:\\java programs\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://demo.guru99.com/test/newtours/register.php";
        driver.get(baseUrl);

        WebElement firstNameInput = driver.findElement(By.name("firstName"));
        firstNameInput.sendKeys("Chitra");

        WebElement lastNameInput = driver.findElement(By.name("lastName"));
        lastNameInput.sendKeys("Sharma");

        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("0123456789");

        WebElement email = driver.findElement(By.id("userName"));
        email.sendKeys("cs@yahoo.com");

        WebElement addressInput = driver.findElement(By.name("address1"));
        addressInput.sendKeys("#123, abc street");

        WebElement cityInput = driver.findElement(By.name("city"));
        cityInput.sendKeys("Safidon");

        WebElement stateInput = driver.findElement(By.name("state"));
        stateInput.sendKeys("Haryana");

        WebElement codeInput = driver.findElement(By.name("postalCode"));
        codeInput.sendKeys("989565");

        WebElement drpCountry = driver.findElement(By.name("country"));
        drpCountry.sendKeys("India");

        WebElement username = driver.findElement(By.name("email"));
        username.sendKeys("cs@yahoo.com");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("cs@yahoo.com");

        WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
        confirmPassword.sendKeys("cs@yahoo.com");

        WebElement Login = driver.findElement(By.name("submit"));
        Login.click();

        Thread.sleep(10000);
    }
}

// public class App {
// public static void main(String[] args) throws Exception {
// System.out.println("Hello, World!");
// }
// }

// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.*;

// public class App {
// public static void main(String[] args) {

// // declaration and instantiation of objects/variables
// System.setProperty("webdriver.chrome.driver","E:\\java
// programs\\chromedriver-win64\\chromedriver.exe");
// WebDriver driver = new ChromeDriver();

// String baseUrl = "https://demo.guru99.com/test/login.html";
// driver.get(baseUrl);

// // Get the WebElement corresponding to the Email Address(TextField)
// WebElement email = driver.findElement(By.id("email"));

// // Get the WebElement corresponding to the Password Field
// WebElement password = driver.findElement(By.name("passwd"));

// email.sendKeys("abcd@gmail.com");
// password.sendKeys("abcdefghlkjl");
// System.out.println("Text Field Set");

// // Deleting values in the text box
// email.clear();
// password.clear();
// System.out.println("Text Field Cleared");

// // Find the submit button
// WebElement login = driver.findElement(By.id("SubmitLogin"));

// // Using click method to submit form
// email.sendKeys("abcd@gmail.com");
// password.sendKeys("abcdefghlkjl");
// login.click();
// System.out.println("Login Done with Click");

// //using submit method to submit the form. Submit used on password field
// driver.get(baseUrl);
// driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
// driver.findElement(By.name("passwd")).sendKeys("abcdefghlkjl");
// driver.findElement(By.id("SubmitLogin")).submit();
// System.out.println("Login Done with Submit");

// driver.close();

// }
// }

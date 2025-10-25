package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import java_class.BillCalculationHelper;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import static org.junit.Assert.assertThat;
//import static org.assertj.core.api.Assertions.assertThat;
public class FinalBillSteps {
    int InitialBillamount;
    double TaxRate;

    @Given("I have a customer")
    public void i_have_a_customer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("user enter initial bill amount as {int}")
    public void user_enter_initial_bill_amount_as(Integer InitialBillamount) {
        this.InitialBillamount= InitialBillamount;
        System.out.println("InitialBillamount"+ InitialBillamount);
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }





    @Given("Sales tax rate as {double} Percent")
    public void sales_tax_rate_as_Percent(Double TaxRate) {
        this.TaxRate = TaxRate;
        System.out.println("TaxRate"+TaxRate);
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Final bill amount calculated is {double}")
    public void final_bill_amount_calculated_is(Double expectedvalue) {// values mentioned in feature file is expectedvalue
        // Write code here that turns the phrase above into concrete actions
        double SysCalVal =  BillCalculationHelper.CalculateBillForCustomer(this.InitialBillamount,this.TaxRate);
        System.out.println("expectedvalue"+expectedvalue);
        System.out.println("SysCalVal"+SysCalVal);// is the value calculated in calculation helper class
        assertThat(expectedvalue).isEqualTo(SysCalVal);
        String WebPageResponse = invokeWebPage(expectedvalue);//calling the method
        assert(WebPageResponse.contains("final bill amount is $"+ expectedvalue));
        throw new io.cucumber.java.PendingException();
    }
    private  String invokeWebPage(double expectedvalueWebPage){ // passing the value of expected to webpage
        EdgeOptions options= new EdgeOptions();
        options.addArguments("--no sandbox--");
        WebDriver driver = new EdgeDriver(options);
        driver.get("http://127.0.0.1:8000");
        // it will direct to the following link . Here i have mentioned portnumber as it is rummimg in local server but we can mention website link also if we are testing a website
        WebElement Billamounttxt= driver.findElement(By.id("id_billamount"));
        WebElement TaxRatetxt = driver.findElement(By.id("id_taxrate"));
        WebElement CalculateButton = driver.findElement(By.id("mybutton"));
        Billamounttxt.sendKeys(Integer.toString(this.InitialBillamount));
        TaxRatetxt.sendKeys(Double.toString(this.TaxRate));
        CalculateButton.click();
        //extracting calculated bill amount from webpage and checking the result
        WebElement Header3Element = driver.findElement(By.xpath("//h3"));
        String response = Header3Element.getText();// all this value is compared with line 50 : assert(WebPageResponse.contains("final bill amount is $"+ expectedvalue));
        //System.out.println(Header3Element.getText().contains("fimal bill amount is"+expectedvalueWebPage));
        driver.quit();
        return response;
}
    /**@Given("I have a customer")
    public void i_have_a_customer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    //Step undefined
    //You can implement missing steps with the snippets below:
    @Given("user enter initial bill amount as {int}")
    public void user_enter_initial_bill_amount_as(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    //Step undefined
    //You can implement missing steps with the snippets below:
    @Given("Sales tax rate as {int} Percent")
    public void sales_tax_rate_as_Percent(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    //Step undefined
    //You can implement missing steps with the snippets below:
    @Then("Final bill amount calculated is {int}")
    public void final_bill_amount_calculated_is(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    //Step undefined
    //You can implement missing steps with the snippets below:
    @Given("I have a customer")
    public void i_have_a_customer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    //Step undefined
    //You can implement missing steps with the snippets below:
    @Given("user enter initial bill amount as {int}")
    public void user_enter_initial_bill_amount_as(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    //Step undefined
    //You can implement missing steps with the snippets below:
    @Given("Sales tax rate as {int} Percent")
    public void sales_tax_rate_as_Percent(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    //Step undefined
   // You can implement missing steps with the snippets below:
    @Then("Final bill amount calculated is {int}")
    public void final_bill_amount_calculated_is(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    //Step undefined
    //You can implement missing steps with the snippets below:
    @Given("I have a customer")
    public void i_have_a_customer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    //Step undefined
    //You can implement missing steps with the snippets below:
    @Given("user enter initial bill amount as {int}")
    public void user_enter_initial_bill_amount_as(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    //Step undefined
    //You can implement missing steps with the snippets below:
    @Given("Sales tax rate as {int} Percent")
    public void sales_tax_rate_as_Percent(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


   // Step undefined
   // You can implement missing steps with the snippets below:
    @Then("Final bill amount calculated is {int}")
    public void final_bill_amount_calculated_is(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    } */


}

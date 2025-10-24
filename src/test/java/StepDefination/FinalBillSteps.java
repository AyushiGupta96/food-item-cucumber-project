package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import java_class.BillCalculationHelper;

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
    public void final_bill_amount_calculated_is(Double expectedvalue) {
        // Write code here that turns the phrase above into concrete actions
        double SysCalVal =  BillCalculationHelper.CalculateBillForCustomer(this.InitialBillamount,this.TaxRate);
        System.out.println("expectedvalue"+expectedvalue);
        System.out.println("SysCalVal"+SysCalVal);
        assertThat(expectedvalue).isEqualTo(SysCalVal);
        throw new io.cucumber.java.PendingException();
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

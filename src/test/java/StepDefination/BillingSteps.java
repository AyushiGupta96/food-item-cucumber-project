package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class BillingSteps {

    @Given(": I placed an order for the following  itemd")
    public void i_placed_an_order_for_the_following_itemd(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        List<Map<String,String>> BillData =
                dataTable.asMaps(String.class,String.class);
        for(Map<String,String> BillItems:BillData){
        for(Map.Entry<String,String> BillItem:BillItems.entrySet()) {
           System.out.println("key"+BillItem.getKey());
            System.out.println("key"+BillItem.getValue());

        }}
        throw new io.cucumber.java.PendingException();
    }

    @When("I generated the bill")
    public void i_generated_the_bill() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("A bill for ${int} should  be generated")
    public void a_bill_for_$40_should_be_generated() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}

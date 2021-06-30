package com.test.stepdef;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import com.test.baseclass.BaseClassM;
import com.test.pom.AddToCartPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCart extends BaseClassM {
	
	
	AddToCartPOM po=new AddToCartPOM();
	@Given("Launch the url to homepage")
	public void launch_the_url_to_homepage() {
		launchBrowser();
		openUrl("http://practice.automationtesting.in/");
	   
	}

	@Given("Verify the product home page navigated or not")
	public void verify_the_product_home_page_navigated_or_not() {
	}
	@When("To select the book from product list")
	public void to_select_the_book_from_product_list() throws InterruptedException {
		AddToCartPOM po=new AddToCartPOM();
		btnClick(po.getBookOne());
		Thread.sleep(3000);
		btnClick(po.getBookTwp());
   
	}

	@When("Go to Shopping cart section")
	public void go_to_Shopping_cart_section() {
		driver.manage().timeouts().implicitlyWait(17, TimeUnit.SECONDS);
		AddToCartPOM po=new AddToCartPOM();
		btnClick(po.getCart());  
	}

	@When("To validate the selected products added in cart or not")
	public void to_validate_the_selected_products_added_in_cart_or_not() {
		driver.manage().timeouts().implicitlyWait(17, TimeUnit.SECONDS);
		AddToCartPOM po=new AddToCartPOM();
	   String addProd = po.getVeriftAddProd().getText();
	   System.out.println(addProd);
	   assertEquals("Thinking in HTML", addProd);
	}

	@When("To increase the quantity of the book and click the updatebasket")
	public void to_increase_the_quantity_of_the_book_and_click_the_updatebasket() {
		AddToCartPOM po=new AddToCartPOM();
		typeTxt(po.getQuantity(), "4");
		btnClick(po.getUpdatebasket());
	    
	}

	@Then("Verify whether it is updated or not")
	public void verify_whether_it_is_updated_or_not() {
//	   String pTot = po.getSubTotelP().getText();
	}

	@When("To remove the selected book")
	public void to_remove_the_selected_book() {
		AddToCartPOM po=new AddToCartPOM();
		btnClick(po.getRemove());
	   
	}

	@Then("Verify  Is the selected book removed or not")
	public void verify_Is_the_selected_book_removed_or_not() {
	
	}


}

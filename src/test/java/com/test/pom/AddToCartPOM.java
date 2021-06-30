package com.test.pom;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.baseclass.BaseClassM;

public class AddToCartPOM extends BaseClassM {
	
	public AddToCartPOM() {
PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[@id='menu-item-50']")
	private WebElement verifyHome;
	@FindBy(xpath="(//a[@rel='nofollow'])[1]")
	private WebElement bookOne;
	@FindBy(xpath="(//a[@rel='nofollow'])[2]")
	private WebElement bookTwp;
	@FindBy(xpath="//a[@title='View your shopping cart']")
	private WebElement cart;
	@FindBy(xpath="//a[contains(text(),'Thinking in HTML')]")
	private WebElement veriftAddProd;
	@FindBy(xpath="(//span[@class='woocommerce-Price-amount amount'])[2]")
	private WebElement subTotelP;
	@FindBy(xpath="//input[@title='Qty']")
	private WebElement quantity;
	@FindBy(xpath="(//input[@type='submit'])[2]")
	private WebElement updatebasket;
	@FindBy(xpath="(//span[@class='woocommerce-Price-amount amount'])[5]")
	private WebElement subtotal;
	@FindBy(xpath="//a[@title='Remove this item']")
	private WebElement remove;
	@FindBy(xpath="//span[@class='amount']")
	private WebElement item;
	public WebElement getVerifyHome() {
		return verifyHome;
	}
	public WebElement getBookOne() {
		return bookOne;
	}
	public WebElement getBookTwp() {
		return bookTwp;
	}
	public WebElement getCart() {
		return cart;
	}
	public WebElement getQuantity() {
		return quantity;
	}
	public WebElement getUpdatebasket() {
		return updatebasket;
	}
	public WebElement getSubtotal() {
		return subtotal;
	}
	public WebElement getRemove() {
		return remove;
	}
	public WebElement getItem() {
		return item;
	}
	public WebElement getVeriftAddProd() {
		return veriftAddProd;
	}
	
	}

	
	
	
	
	



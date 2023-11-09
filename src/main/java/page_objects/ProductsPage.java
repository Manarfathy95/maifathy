package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends PageBase {

	public ProductsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='inventory_item_price']")
	WebElement allProductsPrice ; 

	

}

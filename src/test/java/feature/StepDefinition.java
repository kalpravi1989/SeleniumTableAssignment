package feature;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition {

	private WebDriver driver = Hooks.driver;


	List<WebElement> colourColumn;
	List<WebElement> weightColumn;
	List<WebElement> starwarsTableColumn;
	List<WebElement> starwarsDescription;

	@When("^Get the details from colour column of bear table$")
	public void get_the_details_from_colour_column_of_bear_table() throws Throwable {

		colourColumn = driver.findElements(
				By.xpath("//th[text()='Bear Name']//parent::tr//parent::thead//parent::table//tbody/tr/td[2]"));


	}

	@Then("^Assert that all colour column values are 'black'$")
	public void assert_that_all_colour_column_values_are_black() throws Throwable {
		for (WebElement e : colourColumn) {
			String colour = e.getText();
			System.out.println(colour);
			Assert.assertEquals(colour, "Black");
		}
	}

	@When("^Get the details from weight column of cat table$")
	public void get_the_details_from_weight_column_of_cat_table() throws Throwable {
		weightColumn = driver.findElements(
				By.xpath("//th[text()='Cat Name']//parent::tr//parent::thead//following-sibling::tbody/tr/td[3]"));
	}

	@Then("^Assert that all  weight column values are  greater than '(\\d+)lb'$")
	public void assert_that_all_weight_column_values_are_greater_than_lb(int arg1) throws Throwable {
		for (WebElement e : weightColumn) {
			String s = e.getText().replaceAll("[a-zA-z .]", "");
			System.out.println(s);
			int weight = Integer.valueOf(s);
			Assert.assertTrue(weight <= 15);

			if (weight <= 15) {
				System.out.println("weight is less than 151b");

			} else {
				System.out.println("weight not less than 15lb");
			}
		}
	}

	@When("^Get the number of rows in starwars table$")
	public void get_the_number_of_rows_in_starwars_table() throws Throwable {
		starwarsTableColumn = driver
				.findElements(By.xpath("//th[text()='Movie']/parent::tr/parent::thead/following-sibling::tbody/tr"));
	}

	@Then("^Assert that number of rows is equals to (\\d+)$")
	public void assert_that_number_of_rows_is_equals_to(int arg1) throws Throwable {
		int size = starwarsTableColumn.size();
		System.out.println(size);
		Assert.assertTrue(size == 2);
		if (size == 2) {
			System.out.println("number of row is 2");
		} else {
			System.out.println("number of row is not 2");
		}
	}

	@When("^Get the description details from starwars table$")
	public void get_the_description_details_from_starwars_table() throws Throwable {
		starwarsDescription = driver.findElements(By.xpath(
				"//th[text()='Movie']/parent::tr/parent::thead/following-sibling::tbody/tr/td[@class='description']"));
	}

	@Then("^Assert that number of charaters in description of each rows is less than (\\d+) characters$")
	public void assert_that_number_of_charaters_in_description_of_each_rows_is_less_than_characters(int arg1)
			throws Throwable {
		for (WebElement e : starwarsDescription) {
			String s = e.getText();
			int desLen = s.length();
			System.out.println(desLen);
			Assert.assertTrue(desLen <= 350);
			if (desLen <= 350) {
				System.out.println("number of character is less than 350");
			} else {
				System.out.println("number of character is greater than 350");
			}
		}
	}

}

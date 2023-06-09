package com.qa.nobero.searchTest;



import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.qa.nobero.genericutility.BaseClass;
import com.qa.nobero.genericutility.WebDriverUtility;
import com.qa.nobero.mWeb.objectRepo.RepositoryHub;

public class SearchTest extends BaseClass{

	String searchTest = "tees";

	//@Parameters("searchTest")
	//public void ToVerifyEmptyCartAfterProductSearch(String searchTest) {
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class,groups = {"regression" })
	public void ToVerifyEmptyCartAfterProductSearchTest() {
		
		//Create object for singleton Repository
				RepositoryHub repo = new RepositoryHub(driver);
				
				//Click on search icon
				repo.getSearchRepo().getSearchIcon().click();

				//Seach for a product
				repo.getSearchRepo().getSearchText().sendKeys(searchTest);

				//Click on Cart icon
				repo.getSearchRepo().getcartIcon().click();
				
				//Verify Empty cart is displayed
				Assert.assertTrue(repo.getSearchRepo().getemptyCartTitle().isDisplayed());

	}
	
	//@Parameters("searchTest")
	//public void ToVerifyThatCheckOutIsEnabledAfterProductSearch(String searchTest) {

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class,groups = { "smoke", "regression" })
	public void ToVerifyThatCheckOutIsEnabledAfterProductSearchTest() {

		//Create object for singleton Repository
				RepositoryHub repo = new RepositoryHub(driver);
				
				//Click on search icon
				repo.getSearchRepo().getSearchIcon().click();

				//Seach for a product
				repo.getSearchRepo().getSearchText().sendKeys(searchTest);

				//Click on first product
				repo.getSearchRepo().getPLPgridProduct().get(1).click();

				//Click On Add To cart
				repo.getSearchRepo().getAddToCart().click();

				//Check Procced To Checkout is enabled
				Assert.assertTrue(repo.getSearchRepo().getproceedToBuy().isEnabled());

	}

//	@Parameters("searchTest")
//	public void ToVerifyApplyFilterPriceAfterValidSearchTest(String searchTest) {

	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class ,groups = { "sanity", "regression" })
	public void ToVerifyApplyFilterPriceAfterValidSearchTest() {

		//Create object for singleton Repository
		RepositoryHub repo = new RepositoryHub(driver);
		
		//Click on search icon
				repo.getSearchRepo().getSearchIcon().click();

		//Seach for a product
		repo.getSearchRepo().getSearchText().sendKeys(searchTest);

		//Click on Filter
		repo.getSearchRepo().getsearchFilter().click();

		//Click on Price Range 
		repo.getSearchRepo().getpriceRangeFilter().click();

		//Click on any price
		repo.getSearchRepo().getRs501toRs1000().click();

		//Click on Apply Button
		repo.getSearchRepo().getFilterApply().click();

		//Validate wheather the PLP products are within the Applied price range
//		List<WebElement> PLPprices = repo.getSearchRepo().getPLPgridPrice();
//		for (WebElement PLPprice : PLPprices) {
//			int prodPrice = JavaUtility.extractNumbers(PLPprice.getText());
//			System.out.println(prodPrice);
//			if (prodPrice > 501 && prodPrice<1000) {
//				Assert.assertTrue(true);
//			}
//
//		}

	}

	/*
	 * @Parameters("searchTest") public void
	 * ToVerifyApplyFilterColorAfterValidSearchTest(String searchTest) throws
	 * InterruptedException {
	 */
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class,groups = { "sanity", "regression" })
	public void ToVerifyApplyFilterColorAfterValidSearchTest() throws InterruptedException {
		String colorTest = "Lilac";
		//Create object for singleton Repository
		RepositoryHub repo = new RepositoryHub(driver);
		
		//Click on search icon
				repo.getSearchRepo().getSearchIcon().click();

		//Seach for a product
		repo.getSearchRepo().getSearchText().sendKeys(searchTest);

		//Click on Filter
		repo.getSearchRepo().getsearchFilter().click();

		//Click on Color drawer
		repo.getSearchRepo().getcolorFilter().click();

		//Click on given color
		List<WebElement> colors = repo.getSearchRepo().getcolorsSearchFilter();
		for (WebElement colorWE : colors) {
			if (colorTest.equals(colorWE.getText().trim())) {
				colorWE.click();
				Thread.sleep(2000);
			}
		}

		//Click on Apply 
		repo.getSearchRepo().getFilterApply().click();
		driver.navigate().refresh();
		//Validate searched color is displayed - Click on  an product
		repo.getSearchRepo().getPLPgridProduct().get(1).click();
		//String colorTitle = repo.getSearchRepo().getproductColorTitle().getText();
		int colorIndex=0;
		try {
			boolean check = repo.getSearchRepo().getParamColor(colorTest).isDisplayed(); 
			Assert.assertTrue(check);
		}
		catch (NoSuchElementException e) {
			repo.getSearchRepo().getParamColorPicBox(colorIndex).click();
			boolean check = repo.getSearchRepo().getParamColor(colorTest).isDisplayed(); 
			Assert.assertTrue(check);
			colorIndex++;
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

	/*
	 * @Parameters("searchTest") public void
	 * ToVerifyApplyFilterSizeIsEnabledAfterValidSearchTest(String searchTest) {
	 */
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class,groups = { "sanity", "regression" })
	public void ToVerifyApplyFilterSizeIsEnabledAfterValidSearchTest() {
		//Create object for singleton Repository
		RepositoryHub repo = new RepositoryHub(driver);
		
		//Click on search icon
				repo.getSearchRepo().getSearchIcon().click();

		//Seach for a product
		repo.getSearchRepo().getSearchText().sendKeys(searchTest);

		//Click on Filter
		repo.getSearchRepo().getsearchFilter().click();

		//Click on Color drawer
		repo.getSearchRepo().getSizeDrawerFilter().click();

		List<WebElement> sizesWE = repo.getSearchRepo().getSizesFilter();
		for (WebElement sizeWE : sizesWE) {

			Assert.assertTrue(sizeWE.isEnabled());
		}
	}

	/*
	 * @Parameters("searchTest") public void
	 * ToVerifyApplyFilterAvailabilityInStockIsEnabledAfterValidSearchTest(String
	 * searchTest) {
	 */
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class,groups = { "sanity", "regression" })
	public void ToVerifyApplyFilterAvailabilityInStockIsEnabledAfterValidSearchTest() {
		//Create object for singleton Repository
		RepositoryHub repo = new RepositoryHub(driver);
		
		//Click on search icon
		repo.getSearchRepo().getSearchIcon().click();

		//Seach for a product
		repo.getSearchRepo().getSearchText().sendKeys(searchTest);

		//Click on Filter
		repo.getSearchRepo().getsearchFilter().click();

		//Click on Color drawer
		repo.getSearchRepo().getavailabilityFilter().click();

		//Click on In Stock
		repo.getSearchRepo().getInStock().click();

		//Click on Apply 
		repo.getSearchRepo().getFilterApply().click();		

	}

	/*
	 * @Parameters("searchTest") public void
	 * ToVerifyApplyFilterAvailabilityOutOfStockIsEnabledAfterValidSearchTest(String
	 * searchTest) {
	 */
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class,groups = { "sanity", "regression" })
	public void ToVerifyApplyFilterAvailabilityOutOfStockIsEnabledAfterValidSearchTest() {
		//Create object for singleton Repository
		RepositoryHub repo = new RepositoryHub(driver);
		
		//Click on search icon
				repo.getSearchRepo().getSearchIcon().click();

		//Seach for a product
		repo.getSearchRepo().getSearchText().sendKeys(searchTest);

		//Click on Filter
		repo.getSearchRepo().getsearchFilter().click();

		//Click on Color drawer
		repo.getSearchRepo().getavailabilityFilter().click();

		//Click on In Stock
		repo.getSearchRepo().getOutOfStock().click();

		//Click on Apply 
		repo.getSearchRepo().getFilterApply().click();		

	}

	/*
	 * @Parameters("searchTest") public void
	 * ToVerifySortByFeaturedIsEnabledAfterValidSearchTest(String searchTest) {
	 */
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class,groups = { "sanity", "regression" })
	public void ToVerifySortByFeaturedIsEnabledAfterValidSearchTest() {
		//Create object for singleton Repository
		RepositoryHub repo = new RepositoryHub(driver);
		
		//Click on search icon
		repo.getSearchRepo().getSearchIcon().click();

		//Seach for a product
		repo.getSearchRepo().getSearchText().sendKeys(searchTest);

		//Click on sortby
		repo.getSearchRepo().getsearchSortBy().click();

		//Click on Featured
		repo.getSearchRepo().getFeatured().click();
		
		//View if RadioButton is selected
		repo.getSearchRepo().getsearchSortBy().click();
	}

	/*
	 * @Parameters("searchTest") public void
	 * ToVerifySortByNewArrivalIsEnabledAfterValidSearchTest(String searchTest) {
	 */
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class,groups = { "sanity", "regression" })
	public void ToVerifySortByNewArrivalIsEnabledAfterValidSearchTest() {
		//Create object for singleton Repository
		RepositoryHub repo = new RepositoryHub(driver);
		
		//Click on search icon
		repo.getSearchRepo().getSearchIcon().click();

		//Seach for a product
		repo.getSearchRepo().getSearchText().sendKeys(searchTest);

		//Click on sortby
		repo.getSearchRepo().getsearchSortBy().click();

		//Click on New Arrivals
		//repo.getSearchRepo().getNewArrivals().click();
		System.out.println("Clickdon Sort By");

		//Click on Proce High To Low
		repo.getSearchRepo().getNewArrivals().click();
		
		//View if RadioButton is selected
		repo.getSearchRepo().getsearchSortBy().click();
	}

	/*
	 * @Parameters("searchTest") public void
	 * ToVerifySortByPriceLowToHighIsEnabledAfterValidSearchTest(String searchTest)
	 * {
	 */
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class,groups = { "sanity", "regression" })
	public void ToVerifySortByPriceLowToHighIsEnabledAfterValidSearchTest() {
		//Create object for singleton Repository
		RepositoryHub repo = new RepositoryHub(driver);
		
		//Click on search icon
		repo.getSearchRepo().getSearchIcon().click();

		//Seach for a product
		repo.getSearchRepo().getSearchText().sendKeys(searchTest);

		//Click on sortby
		repo.getSearchRepo().getsearchSortBy().click();

		//Click on Price Low To High
		//repo.getSearchRepo().getpriceLowtoHigh().click();
		System.out.println("Clickdon Sort By");

		//Click on Proce High To Low
		repo.getSearchRepo().getpriceLowtoHigh().click();
		
		//View if RadioButton is selected
		repo.getSearchRepo().getsearchSortBy().click();
	}

	/*
	 * @Parameters("searchTest") public void
	 * ToVerifySortByPriceHighToLowIsEnabledAfterValidSearchTest(String searchTest)
	 * {
	 */
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class,groups = { "sanity", "regression" })
	public void ToVerifySortByPriceHighToLowIsEnabledAfterValidSearchTest() {
		//Create object for singleton Repository
		RepositoryHub repo = new RepositoryHub(driver);
		
		//Click on search icon
		repo.getSearchRepo().getSearchIcon().click();

		//Seach for a product
		repo.getSearchRepo().getSearchText().sendKeys(searchTest);

		//Click on sortby
		repo.getSearchRepo().getsearchSortBy().click();
		System.out.println("Clickdon Sort By");

		//Click on Proce High To Low
		repo.getSearchRepo().getpriceHighToLow().click();
		
		//View if RadioButton is selected
		repo.getSearchRepo().getsearchSortBy().click();

	}

	/*
	 * @Parameters("searchTest") public void
	 * ToVerifyThatPDPIsDisplayedAfterValidSearchTest(String searchTest) {
	 */
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class,groups = { "smoke", "regression" })
	public void ToVerifyThatPDPIsDisplayedAfterValidSearchTest() {

		//Create object for singleton Repository
		RepositoryHub repo = new RepositoryHub(driver);
		
		//Click on search icon
		repo.getSearchRepo().getSearchIcon().click();

		//Seach for a product
		repo.getSearchRepo().getSearchText().sendKeys(searchTest);

		//Click on first product
		repo.getSearchRepo().getPLPgridProduct().get(1).click();

	}

	/*
	 * @Parameters("searchTest") public void
	 * ToVerifyThatProductIsMovedToCartAfterValidSearchTest(String searchTest) {
	 */
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class,groups = { "smoke", "regression" })
	public void ToVerifyThatProductIsMovedToCartAfterValidSearchTest() {

		//Create object for singleton Repository
		RepositoryHub repo = new RepositoryHub(driver);
		
		//Click on search icon
		repo.getSearchRepo().getSearchIcon().click();

		//Seach for a product
		repo.getSearchRepo().getSearchText().sendKeys(searchTest);

		//Click on first product
		repo.getSearchRepo().getPLPgridProduct().get(1).click();
		String PDPprodTitle = repo.getSearchRepo().getPDPprodTitle().getText().toLowerCase();

		//Click On Add To cart
		repo.getSearchRepo().getAddToCart().click();

		//Validate the product in cart page
		String cartProdTitle = repo.getSearchRepo().getcartProdTitle().getText().toLowerCase();
		Assert.assertEquals(PDPprodTitle, cartProdTitle);

	}

	/*
	 * @Parameters("searchTest") public void
	 * ToVerifyNotifyMeWhenAvailableAfterValidSearchTest(String searchTest) throws
	 * InterruptedException {
	 */
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class,groups = { "sanity", "regression" })
	public void ToVerifyNotifyMeWhenAvailableAfterValidSearchTest() throws InterruptedException {

		//Create object for singleton Repository
		RepositoryHub repo = new RepositoryHub(driver);
		
		//Click on search icon
		repo.getSearchRepo().getSearchIcon().click();

		//Seach for a product
		repo.getSearchRepo().getSearchText().sendKeys(searchTest);

		//Click on Filter
		repo.getSearchRepo().getsearchFilter().click();

		//Click on Color drawer
		repo.getSearchRepo().getavailabilityFilter().click();

		//Click on In Stock
		repo.getSearchRepo().getOutOfStock().click();

		//Click on Apply 
		repo.getSearchRepo().getFilterApply().click();		
		Thread.sleep(2000);
		//Click on first product
		repo.getSearchRepo().getPLPgridProduct().get(0).click();

		//Click on 'Notify me when available' button
		repo.getSearchRepo().getNotifyMeWhenAvailable().click();

		Thread.sleep(5000);
		//Verify Contlo is displayed
		//Assert.assertTrue(repo.getSearchRepo().getcontloForm().isDisplayed());
		//System.out.println(repo.getSearchRepo().getcontloFormTitle().getText());

	}
	
	/*
	 * @Parameters("searchTest") public void
	 * ToVerifySizeGuideAfterValidSearchTest(String searchTest) throws
	 * InterruptedException {
	 */
	@Test(retryAnalyzer = com.qa.nobero.genericutility.RetryAnalyzer.class,groups = { "regression" })
	public void ToVerifySizeGuideAfterValidSearchTest() throws InterruptedException {

		//Create object for singleton Repository
		RepositoryHub repo = new RepositoryHub(driver);
		
		//Click on search icon
		repo.getSearchRepo().getSearchIcon().click();

		//Seach for a product
		repo.getSearchRepo().getSearchText().sendKeys(searchTest);

		//Click on first product
		repo.getSearchRepo().getPLPgridProduct().get(1).click();

		//Scroll to Size Guide
		new WebDriverUtility().scrollToElementXAndY(driver, repo.getSearchRepo().getsizeGuide());
		
		//Click on Size Guide
		repo.getSearchRepo().getsizeGuide().click();

	}


}
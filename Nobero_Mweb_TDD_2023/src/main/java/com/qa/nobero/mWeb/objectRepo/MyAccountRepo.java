package com.qa.nobero.mWeb.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountRepo {

WebDriver driver;
	
	public MyAccountRepo(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement LoginEmailField;
	
	@FindBy(xpath="//input[@id='id_password']")
	private WebElement LoginPassword;
	
	@FindBy(xpath="//input[@id='ForgotPassword']")
	private WebElement forgotPasswordLink;
	
	@FindBy(xpath="//button[@id='signIn']")
	private WebElement signInButton;
	
	@FindBy(xpath="//a[contains(.,'Create your account')]")
	private WebElement createAccount;
	
	@FindBy(xpath="//input[@name='customer[first_name]']")
	private WebElement FirstName;

	@FindBy(xpath="//input[@name='customer[last_name]']")
	private WebElement LastName;
	
	@FindBy(xpath="//input[@name='customer[email]']")
	private WebElement RegEmail;
	
	@FindBy(xpath="//input[@name='customer[password]']")
	private WebElement RegPassword;
	
	@FindBy(xpath="//button[contains(.,'Register')]")
	private WebElement registerButton;
	
	@FindBy(xpath="//a[contains(.,'Login Here')]")
	private WebElement LoginHere;
	
	@FindBy(xpath="//input[@id='RecoverEmail']")
	private WebElement recoverEmail;
	
	@FindBy(xpath="//input[@id='resetBtn']")
	private WebElement recoverSubmit;
	
	@FindBy(xpath="//a[contains(.,'Cancel')]")
	private WebElement cancelLink;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLoginEmailField() {
		return LoginEmailField;
	}

	public WebElement getLoginPassword() {
		return LoginPassword;
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}

	public WebElement getCreateAccount() {
		return createAccount;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getRegEmail() {
		return RegEmail;
	}

	public WebElement getRegPassword() {
		return RegPassword;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public WebElement getLoginHere() {
		return LoginHere;
	}

	public WebElement getRecoverEmail() {
		return recoverEmail;
	}

	public WebElement getRecoverSubmit() {
		return recoverSubmit;
	}

	public WebElement getCancelLink() {
		return cancelLink;
	}
	
	//Dashboard
	
	@FindBy(xpath="//a[contains(.,'Dashboard')]")
	private WebElement dashboard;
	public WebElement getDashboard() {
		return dashboard;
	}
	
	@FindBy(xpath="//a[@href='/account/addresses']")
	private WebElement addressDashboard;
	public WebElement getaddressDashboard() {
		return addressDashboard;
	}
	
	@FindBy(xpath="//a[@href='/account/logout' and contains(.,'Log out')] ")
	private WebElement logoutDashboard;
	public WebElement getlogoutDashboard() {
		return logoutDashboard;
	}
	
	//Account Details
	@FindBy(xpath="//div[.='Account Details']/../div[2]/p")
	private WebElement nameParagraphAccountDetails;
	public WebElement getnameParagraphAccountDetails() {
		return nameParagraphAccountDetails;
	}
	
	@FindBy(xpath="//div[.='Account Details']/../div[3]/div/div[text()='Name']/following-sibling::div[1]")
	private WebElement nameAccountDetails;
	public WebElement getnameValue() {
		return nameAccountDetails;
	}
	
	@FindBy(xpath="//div[.='Account Details']/../div[3]/div/div[text()='Email']/following-sibling::div[1]")
	private WebElement emailAccountDetails;
	public WebElement getemailValue() {
		return emailAccountDetails;
	}
	
	@FindBy(xpath="//div[.='Account Details']/../div[3]/div/div[text()='Address']/following-sibling::div[1]")
	private WebElement addressAccountDetails;
	public WebElement getaddressValue() {
		return addressAccountDetails;
	}
	
	@FindBy(xpath="//div[.='Account Details']/../div[3]/div/div[text()='Apartments, suites ,etc']/following-sibling::div[1]")
	private WebElement apartmentSuiteAccountDetails;
	public WebElement getapartmentSuiteValue() {
		return apartmentSuiteAccountDetails;
	}
	
	@FindBy(xpath="//div[.='Account Details']/../div[3]/div/div[text()='City']/following-sibling::div[1]")
	private WebElement cityAccountDetails;
	public WebElement getcityValue() {
		return cityAccountDetails;
	}
	
	@FindBy(xpath="//div[.='Account Details']/../div[3]/div/div[text()='Postal/ZIP code']/following-sibling::div[1]")
	private WebElement Postal_ZIPcodeAccountDetails;
	public WebElement getPostal_ZIPcodeValue() {
		return Postal_ZIPcodeAccountDetails;
	}
	
	@FindBy(xpath="//div[.='Account Details']/../div[3]/div/div[text()='Phone']/following-sibling::div[1]")
	private WebElement phoneAccountDetails;
	public WebElement getphoneValue() {
		return phoneAccountDetails;
	}
	
	@FindBy(xpath="//div[text()='Default']/../div[2]/p")
	private WebElement defaultAddessDetails;
	public WebElement getdefaultAddessDetails() {
		return defaultAddessDetails;
	}
	
	//Address
	@FindBy(xpath="//button[contains(.,'Add a new address')]")
	private WebElement AddaNewAddress;
	public WebElement getAddaNewAddress() {
		return AddaNewAddress;
	}
		
					@FindBy(xpath="//input[@id='AddressFirstNameNew']")
					private WebElement AddressFirstNameNew;
					public WebElement getAddressFirstNameNew() {
						return AddressFirstNameNew;
					}
					@FindBy(xpath="//input[@id='AddressLastNameNew']")
					private WebElement AddressLastNameNew;
					public WebElement getAddressLastNameNew() {
						return AddressLastNameNew;
					}
					@FindBy(xpath="//input[@id='AddressCompanyNew']")
					private WebElement AddressCompanyNew;
					public WebElement getAddressCompanyNew() {
						return AddressCompanyNew;
					}
					@FindBy(xpath="//input[@id='AddressAddress1New']")
					private WebElement AddressAddressNew;
					public WebElement getAddressAddressNew() {
						return AddressAddressNew;
					}
					@FindBy(xpath="//input[@id='AddressAddress2New']")
					private WebElement AddressApartmentNew;
					public WebElement getAddressApartmentNew() {
						return AddressApartmentNew;
					}
					@FindBy(xpath="//input[@id='AddressCityNew']")
					private WebElement AddressCityNew;
					public WebElement getAddressCityNew() {
						return AddressCityNew;
					}
					@FindBy(xpath="//select[@id='AddressCountryNew']")
					private WebElement AddressCountryNew;
					public WebElement getAddressCountryDropNew() {
						return AddressCountryNew;
					}
					@FindBy(xpath="//select[@id='AddressProvinceNew']")
					private WebElement AddressStateNew;
					public WebElement getAddressStateDropNew() {
						return AddressStateNew;
					}
					@FindBy(xpath="//input[@id='AddressZipNew']")
					private WebElement AddressZipNew;
					public WebElement getAddressZipNew() {
						return AddressZipNew;
					}
					@FindBy(xpath="//input[@id='AddressPhoneNew']")
					private WebElement AddressPhoneNew;
					public WebElement getAddressPhoneNew() {
						return AddressPhoneNew;
					}
					@FindBy(xpath="//input[@id='address_default_address_new']")
					private WebElement address_default_address_new;
					public WebElement getAddressDefaultAddressNew() {
						return address_default_address_new;
					}
					@FindBy(xpath="//button[text()='Add address']")
					private WebElement AddAddressButton;
					public WebElement getAddAddressButton() {
						return AddAddressButton;
					}
					@FindBy(xpath="//button[text()='Add address']/following-sibling::button[text()='Cancel']")
					private WebElement CancelButton;
					public WebElement getCancelButton() {
						return CancelButton;
					}
	
	@FindBy(xpath="//button[@aria-label='Edit Address 1']")
	private WebElement editButton;
	public WebElement geteditButton() {
		return editButton;
	}
				
					@FindBy(xpath="//h2[contains(text(),'Edit Address')]/..//input[@name='address[company]']")
					private WebElement AddressCompanyEdit;
					public WebElement getAddressCompanyEdit() {
						return AddressCompanyEdit;
					}
					@FindBy(xpath="//h2[contains(text(),'Edit Address')]/..//input[@name='address[address1]']")
					private WebElement AddressAddressEdit;
					public WebElement getAddressAddressEdit() {
						return AddressAddressEdit;
					}
					@FindBy(xpath="//h2[contains(text(),'Edit Address')]/..//input[@name='address[address2]']")
					private WebElement AddressApartmentEdit;
					public WebElement getAddressApartmentEdit() {
						return AddressApartmentEdit;
					}
					@FindBy(xpath="//h2[contains(text(),'Edit Address')]/..//input[@name='address[city]']")
					private WebElement AddressCityEdit;
					public WebElement getAddressCityEdit() {
						return AddressCityEdit;
					}
					@FindBy(xpath="//h2[contains(text(),'Edit Address')]/..//select[@name='address[country]']")
					private WebElement AddressCountryDropEdit;
					public WebElement getAddressCountryDropEdit() {
						return AddressCountryDropEdit;
					}
					@FindBy(xpath="//h2[contains(text(),'Edit Address')]/..//select[@name='address[province]']")
					private WebElement AddressStateEdit;
					public WebElement getAddressStateEdit() {
						return AddressStateEdit;
					}
					@FindBy(xpath="//h2[contains(text(),'Edit Address')]/..//input[@name='address[zip]']")
					private WebElement AddressZipEdit;
					public WebElement getAddressZipEdit() {
						return AddressZipEdit;
					}
					@FindBy(xpath="//h2[contains(text(),'Edit Address')]/..//input[@name='address[phone]']")
					private WebElement AddressPhoneEdit;
					public WebElement getAddressPhoneEdit() {
						return AddressPhoneEdit;
					}
					@FindBy(xpath="//h2[contains(text(),'Edit Address')]/..//input[@name='address[default]']")
					private WebElement address_default_address_Edit;
					public WebElement getAddressDefaultAddressEdit() {
						return address_default_address_Edit;
					}
					@FindBy(xpath="//button[contains(text(),'Update address')]")
					private WebElement updateAddressButton;
					public WebElement getupdateAddressButton() {
						return updateAddressButton;
					}
					@FindBy(xpath="//button[contains(text(),'Update address')]/following-sibling::button[text()='Cancel']")
					private WebElement CancelEditButton;
					public WebElement getCancelEditButton() {
						return CancelEditButton;
					}
	
}

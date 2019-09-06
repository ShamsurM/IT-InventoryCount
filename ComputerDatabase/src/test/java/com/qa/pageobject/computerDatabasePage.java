/**
 * 
 */
package com.qa.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Shamsur.Masum
 *
 */
public class computerDatabasePage {
	WebDriver driver;
	
	public computerDatabasePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Play sample application — Computer")
	public WebElement header_Lnktxt;
	
	@FindBy(how=How.CSS, using="#add")
	public WebElement addANewComputer_btn;
	
	@FindBy(how=How.XPATH, using="//*[text()='Add a computer']")
	public WebElement addAComputer_headerTxt;
	
	@FindBy(how=How.XPATH, using="//*[text()='Edit computer']")
	public WebElement editComputer_headerTxt;
	
	@FindBy(how=How.CSS, using="#searchbox")
	public WebElement searchBox_inptBox;
	
	@FindBy(how=How.CSS, using="#searchsubmit")
	public WebElement findByName_btn;
	
	@FindBy(how=How.CSS, using="#name")
	public WebElement computerName_inptBox;
	
	@FindBy(how=How.CSS, using="#introduced")
	public WebElement introducedDate_inptBox;
	
	@FindBy(how=How.CSS, using="#discontinued")
	public WebElement discontinuedDate_inptBox;
	
	@FindBy(how=How.CSS, using="#company")
	public WebElement Company_dpwList;
	
	@FindBy(how=How.CSS, using=".primary")
	public WebElement createThisComputer_btn;
	
	@FindBy(how=How.CSS, using=".danger")
	public WebElement deleteThisComputer_btn;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"main\"]/div[1]")
	public WebElement alartMsg_txt;
}

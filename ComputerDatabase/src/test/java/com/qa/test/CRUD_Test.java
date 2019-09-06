package com.qa.test;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.pageobject.computerDatabasePage;



public class CRUD_Test extends testBase{
	
	 
	@Test (priority=1)                     // Add Computer (priority 1 test will get executed first)
	public void addComputer() {
		computerDatabasePage computerDatabasePage= new computerDatabasePage(driver);
		computerDatabasePage.addANewComputer_btn.click();
		Assert.assertTrue(computerDatabasePage.addAComputer_headerTxt.getText().contains("Add a computer"));
		computerDatabasePage.computerName_inptBox.sendKeys(DataReader.getComputerName());
		computerDatabasePage.introducedDate_inptBox.sendKeys(DataReader.getIntroducedDate());
		computerDatabasePage.discontinuedDate_inptBox.sendKeys(DataReader.getDiscontinuedDate());
		Select company= new Select(computerDatabasePage.Company_dpwList);
		company.selectByVisibleText(DataReader.getCompany());
		computerDatabasePage.createThisComputer_btn.click();
		Assert.assertTrue(computerDatabasePage.alartMsg_txt.getText().contains("has been created"));
		computerDatabasePage.header_Lnktxt.click();
	}
	
	
    @Test (priority=2)                             //Read Computer database
	public void searchComputer() {
    	computerDatabasePage computerDatabasePage= new computerDatabasePage(driver);
    	computerDatabasePage.searchBox_inptBox.sendKeys(DataReader.getComputerName());
    	computerDatabasePage.findByName_btn.click();
		System.out.println("Search complited");
		computerDatabasePage.header_Lnktxt.click();
	}
	
    
	@Test (priority=3)                            // Update Computer database
	public void updateComputer() {
    	computerDatabasePage computerDatabasePage= new computerDatabasePage(driver);
    	computerDatabasePage.searchBox_inptBox.sendKeys(DataReader.getComputerName());
    	computerDatabasePage.findByName_btn.click();
    	driver.findElement(By.linkText(DataReader.getComputerName())).click();
		computerDatabasePage.discontinuedDate_inptBox.clear();
		computerDatabasePage.discontinuedDate_inptBox.sendKeys(DataReader.getModifiedDiscontinuedDate());
		Select company= new Select(computerDatabasePage.Company_dpwList);
		company.selectByVisibleText(DataReader.getModifiedCompany());
		computerDatabasePage.createThisComputer_btn.click();
		Assert.assertTrue(computerDatabasePage.alartMsg_txt.getText().contains("has been updated"));
		computerDatabasePage.header_Lnktxt.click();
	}
	
	
	@Test (priority=4)                        // Delete computer  (priority 4 test will get executed at the end)
	public void deleteComputer() {
    	computerDatabasePage computerDatabasePage= new computerDatabasePage(driver);
    	computerDatabasePage.searchBox_inptBox.sendKeys(DataReader.getComputerName());
    	computerDatabasePage.findByName_btn.click();
		driver.findElement(By.linkText(DataReader.getComputerName())).click();
		computerDatabasePage.deleteThisComputer_btn.click();
		Assert.assertTrue(computerDatabasePage.alartMsg_txt.getText().contains("has been deleted"));
	}
	
    

}

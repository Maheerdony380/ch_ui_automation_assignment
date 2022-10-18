package in.amazon.pages;

import in.amazon.utils.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

import org.testng.Assert;

public class AmazonPages extends TestBase {

    // hamburger menu
    @FindBy(xpath = "//a[@id='nav-hamburger-menu']")
    private WebElement hamburgerMenu;

    // tv appliances electronics
    @FindBy(xpath = "//a[@class='hmenu-item']//div[text()='TV, Appliances, Electronics']")
    private WebElement tVAppliancesElectronics;

    // televisions
    @FindBy(xpath = "//a[text()='Televisions']")
    private WebElement televisionsList;

    // samsung
    @FindBy(xpath = "//div//span[text()='Samsung']")
    private WebElement samsungBrand;

    // sort dropdown
    @FindBy(xpath = "//span[@id='a-autoid-0-announce']")
    private WebElement sortDropdown;

    // Price: High to Low option
    @FindBy(xpath = "//li//a[text()='Price: High to Low']")
    private WebElement priceHighToLow;

    // second item after filter
    @FindBy(xpath = "//div[@data-cel-widget='search_result_2']//div[2]//div//h2//a")
    private WebElement secondItem;

    // about item title
    @FindBy(xpath = "//div[@id='feature-bullets']//h1")
    private WebElement aboutItemTitle;

    // about item content
    @FindBy(xpath = "//ul[@class='a-unordered-list a-vertical a-spacing-mini']//li//span[@class='a-list-item']")
    private WebElement aboutItemContent;

    // init elements
    public AmazonPages(){
        PageFactory.initElements(driver, this);
    }

    public void clickOnHamburgerMenu(){
        hamburgerMenu.click();
    }

    public void clickOnTVAppliancesElectronics(){
        tVAppliancesElectronics.click();
    }

    public void clickOnTelevisionsList(){
        televisionsList.click();
    }

    public void clickOnSamsungBrand(){
        samsungBrand.click();
    }

    public void clickOnSortDropdown(){
        sortDropdown.click();
    }

    public void clickOnPriceHighToLow(){
        priceHighToLow.click();
    }

    public void clickOnSecondItem(){
        secondItem.click();
    }

    public void doSwitchTab(){
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
    }

    public void verifyAboutItemTitle(String expectedTitle){
        String actualText = aboutItemTitle.getText();

        Assert.assertEquals(actualText, expectedTitle);
    }

    public void logTextAboutItemContent(){
        System.out.println(aboutItemContent.getText());
    }
}

package in.amazon.pages;

import in.amazon.utils.TestBase;
import org.openqa.selenium.support.PageFactory;

public class AmazonPages extends TestBase {

    // init elements
    public AmazonPages(){
        PageFactory.initElements(driver, this);
    }
}

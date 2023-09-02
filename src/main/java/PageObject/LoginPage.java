package PageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BassClass;

public class LoginPage extends BassClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
  @FindBy(id = "email")
  public List<WebElement> userName;
  
  @FindBy(id = "pass")
  public List<WebElement> password;
  
  @FindBy(name = "login")
  public List<WebElement> login;

public List<WebElement> getUserName() {
	return userName;
}

public List<WebElement> getPassword() {
	return password;
}

public List<WebElement> getLogin() {
	return login;
}
  
  
  
}

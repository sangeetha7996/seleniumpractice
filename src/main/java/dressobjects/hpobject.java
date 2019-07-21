package dressobjects;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hpobject extends basepage 
{
  @FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
  private WebElement women;
  
  @FindBy(xpath = " //*[@id=\"block_top_menu\"]/ul/li[2]/a")
  private WebElement dress;
  
  @FindBy(xpath ="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
  
  private WebElement tshirts;
  
  @FindBy(xpath = " //*[@id=\"block_top_menu\"]/ul/li[1]/a")
  public String womenclick;
  
  @FindBy(xpath = "//*[@id=\"center_column\"]/h1/span[2]")
  public WebElement countwomen;
  
  @FindBy(xpath="//*[@class='product_list grid row']")
  public List<WebElement> firstproduct;
  
  @FindBy(xpath="//*[@id=\"center_column\"]/h1/span[2]")
  public WebElement countdress;
  
  @FindBy(xpath="//*[@class='product_list grid row']")
  public List<WebElement> secondproduct;
  
  @FindBy(xpath="//*[@id=\"center_column\"]/h1/span[2]")
  public WebElement countTshirts;
  
  @FindBy(xpath="//*[@class='product_list grid row']")
  public List<WebElement> thirdproduct;
  
  @FindBy(xpath="")
  public WebElement size;
  
  @FindBy(xpath="")
  public WebElement emaillink;
  
  @FindBy(xpath="")
  public WebElement addtocart;
  
  
  
  public hpobject()
  {
	  PageFactory.initElements(driver, this);  
	  }
  
  
	  public WebElement women()
	  {
		  return women;
	  }
	  public WebElement dress()
	  {
		  return dress;
	  }
       public WebElement tshirts()
       {
    	   return tshirts;
       }
       public void womenclick() 
       {
    	   women.click();
    	   }
       public void dressclick()
       {
    	   dress.click();
    	   }
       public void tshirtsclick() 
       {
    	   tshirts.click();
    	   }
       public WebElement addtocart()
       {
    	   return addtocart;
       }

public int womencount()
{
	String o1 = countwomen.getText();
	String[] arr1 = o1.split("");
	String number1=arr1[2];
	int num1 = Integer.parseInt(number1);
	return num1;
}

public int getwomencount()
{
	return firstproduct.size();
}

public int dresscount()
{
	String o2 = countdress.getText();
	String[] arr2 = o2.split("");
	String number2=arr2[2];
	int num2 = Integer.parseInt(number2);
	return num2;
}

public int getdresscount()
{
	return secondproduct.size();
	
}

public int tshirtcount()
{
	String o3 = countTshirts.getText();
	String[] arr3 = o3.split("");
	String number3=arr3[2];
	int num3 = Integer.parseInt(number3);
	return num3;
}

public int getTshirtscount()
{
	return thirdproduct.size();
}

public WebElement emaillink()
{
	return emaillink;
}

public WebElement verifysize()
{
	return size;
}
}





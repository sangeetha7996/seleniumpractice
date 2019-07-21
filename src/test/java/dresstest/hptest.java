package dresstest;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import dressobjects.basepage;
import dressobjects.hpobject;

public class hptest {
	
	hpobject homepage;
	basepage bp;
	
	int rand = new Random().nextInt(5000000);
	String email="sangeetha"+rand+"gmail.com";
	
	public hptest()
	{
		homepage = new hpobject();
		bp=new basepage();
	}
    @Test
	public void verifytabs() {
	Assert.assertTrue(homepage.elementFound(homepage.women()));
	Assert.assertTrue(homepage.elementFound(homepage.dress()));
	Assert.assertTrue(homepage.elementFound(homepage.tshirts()));
	
	
	}
    @Test
   public void verifyclick() {
	   homepage.womenclick();
	   String gettitle = bp.getTitlte();
	   Assert.assertEquals(gettitle, "Women - My Store");
	   
	   homepage.dressclick();
	   String gettitle1 = bp.getTitlte();
			   Assert.assertEquals(gettitle1, "Dresses - My Store");
			   
		homepage.tshirtsclick();
		String gettitle2 = bp.getTitlte();
		Assert.assertEquals(gettitle2, "T-shirts - My Store");
   }
    
    @Test
    public void verifycount()
    {
    	homepage.womenclick();
    	int act1=homepage.womencount();
    	int exp1=homepage.getwomencount();
    	Assert.assertTrue(act1==exp1, "count mismatch");
    	
    	homepage.dressclick();
    	int act2=homepage.dresscount();
    	int exp2=homepage.getdresscount();
    	Assert.assertTrue(act2==exp2, "count mismatch");
    	
    	homepage.tshirtsclick();
    	int act3=homepage.tshirtcount();
    	int exp3=homepage.getTshirtscount();
    	Assert.assertTrue(act3==exp3, "count mismatch");
    	
    }
    
    @Test
    public void verifysize()
    {
    	Assert.assertTrue(homepage.isElementVisible(homepage.verifysize()));
    }
    
    @Test
    public void verifyaddtocart()
    {
    system.out.println(started")	
    }
}





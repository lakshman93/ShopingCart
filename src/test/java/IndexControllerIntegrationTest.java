
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import junit.framework.TestCase;

import com.shoping.controller.ShopController;


public class IndexControllerIntegrationTest extends TestCase{
 
	  @Test
	    public void testQuery()  {
		  ShopController shopContr  = new ShopController(); 
	        ModelAndView check = shopContr.hello(); 
	     check.equals(shopContr);
	        
	    }
	
}
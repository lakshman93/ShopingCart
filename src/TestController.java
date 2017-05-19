package com.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import junit.framework.TestCase;

import com.shoping.controller.ShopController;
import com.shoping.service.Calculations;

public class TestController extends TestCase {
	 @Test
	public void testPrizeDetials() throws Exception {
		List<String> calcList = new ArrayList<String>();
		List<String> methodEval = new ArrayList<String>();
		Calculations calc = new Calculations();
		calcList.add("A001=Bananas=10.00");
		calcList.add("A002=Oranges=20.00");
		calcList.add("A003=Apples=30.00");
		calcList.add("A004=Lemons=40.00");
		calcList.add("A005=Peaches=50.00");

		methodEval = calc.prizeDetials();
		assertEquals(calcList, methodEval);
		assertNotNull(methodEval);

	}
	 @Test
	public void testCalculation() {
		Calculations calc = new Calculations();
		Double value = calc.Calculation(1, 1.1);
		assertEquals(1.1, value);
		assertNotNull(value);

	}
	 @Test
	    public void testQuery()  {
		  ShopController shopContr  = new ShopController(); 
	        ModelAndView check = shopContr.hello(); 
	        check.equals(shopContr);
	    }

}

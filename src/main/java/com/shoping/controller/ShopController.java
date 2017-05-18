package com.shoping.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shoping.service.Calculations;

@Controller
public class ShopController {

	static List<String> prize = null;
	static List<String> itemeName = null;
	static List<Double> prizes = null;
	static List<String> itemCodes = null;
	static List<Integer> quantitys = null;
	static List<Double> Amounts = null;
	static Double TotalAmount = 0.0;
	static String itemsname = null;
  
	@RequestMapping("/Shoping")
	public ModelAndView hello() {
		TotalAmount = 0.0;
		prize = new ArrayList<String>();
		itemeName = new ArrayList<String>();
		prizes = new ArrayList<Double>();
		itemCodes = new ArrayList<String>();
		Amounts = new ArrayList<Double>();
		quantitys = new ArrayList<Integer>();
		Calculations cal = new Calculations();
		prize = cal.prizeDetials();
		for (String itemCodess : prize) {
			itemCodes.add(itemCodess.split("=")[0].toString());
			itemeName.add(itemCodess.split("=")[1].toString());
			prizes.add(Double.parseDouble(itemCodess.split("=")[2].toString()));
		}
		itemsname = itemeName.get(0);
		ModelAndView mav = new ModelAndView("hello");
		mav.addObject("itemsname", itemsname);
		mav.addObject("TotalAmount", TotalAmount);
		return mav;
	}

	@RequestMapping(value = "/ShopingAjax", method = RequestMethod.POST)
	public ModelAndView hello1(HttpServletRequest request) {
		ModelAndView mav = null;
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		Double TotalAmounts = Double.parseDouble(request
				.getParameter("TotalAmount"));
		String itemname = request.getParameter("itemname");

		Calculations i = new Calculations();
		Double Amount = i.Calculation(quantity,
				prizes.get(itemeName.indexOf(itemname)));
		Amounts.add(Amount);
		TotalAmount = Amount + TotalAmounts;
		quantitys.add(quantity);

		try {
			int s = itemeName.indexOf(itemsname) + 1;
			System.out.println(s + "suze" + itemeName.size());
			if ((s == itemeName.size())) {
				System.out.println("quantitys::" + quantitys);
				System.out.println("Amounts::" + Amounts);
				mav = new ModelAndView("print");
				mav.addObject("itemeName", itemeName);
				mav.addObject("quantitys", quantitys);
				mav.addObject("prizes", prizes);
				mav.addObject("Amounts", Amounts);
				mav.addObject("TotalAmount", TotalAmount);
				itemsname = "";
			} else {
				mav = new ModelAndView("hello");
				itemsname = itemeName.get(s);
				mav.addObject("itemsname", itemsname);
				mav.addObject("Amount", Amount);
				mav.addObject("TotalAmount", TotalAmount);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		return mav;
	}

	
}

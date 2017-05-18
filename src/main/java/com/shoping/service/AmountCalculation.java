package com.shoping.service;
import java.io.Serializable;
import java.util.List;

 public interface AmountCalculation extends Serializable, Cloneable{

		Double Calculation(int quantity,Double itemPrize);
		List<String> prizeDetials();
    }
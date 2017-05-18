package com.shoping.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculations implements AmountCalculation {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Scanner scanner;
	static List<String> prize = null;

	static List<Integer> quantity = null;
	static Double TotalAmount = 0.0;
	Double totalAmount = 0.0;

	@Override
	public Double Calculation(int quantity, Double itemPrize) {
		totalAmount = totalAmount + (itemPrize * quantity);
		return totalAmount;
	}

	@Override
	public List<String> prizeDetials() {
		try {
			scanner = new Scanner(new File("D:/PrizeDetails.txt"));
			Scanner file = scanner.useDelimiter(",\\s*");
			prize = new ArrayList<String>();
			while (file.hasNext()) {
				prize.add(file.next().toString());
			}
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return prize;
	}

}

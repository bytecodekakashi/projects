package com.kodnest.project;

import java.util.Scanner;

public class Logic {
	Scanner scanner = new Scanner(System.in);
	double baseUnit = 1.0;
	double basePrice = baseUnit*110;
	double ratePerUnit = 4.75;
	
	double unitsUsed = scanner.nextDouble();
	double fixedCharges = baseUnit*basePrice;
	double energyCharges = unitsUsed*ratePerUnit;
	double fppcaCharges = unitsUsed*1.15;
public static void rate() {
	
}


}

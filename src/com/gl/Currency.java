package com.gl;

public class Currency {
	public void transactionTarget(int[] transactionValue, int targetValue) {

		int transactionSize = transactionValue.length;
		int calculatedValue = 0;
		int iterationCount = 0;

		int count = 0;

		while (targetValue > calculatedValue && iterationCount < transactionSize) {
			calculatedValue = calculatedValue + transactionValue[count];
			iterationCount++;
			count++;
		}

		if (calculatedValue >= targetValue) {
			System.out.println("Target acheived after " + count + " transactions");

		} else {
			System.out.println("Target not acheived");
		}
	}
}

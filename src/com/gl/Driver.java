package com.gl;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of transaction");
		int transactionSize = sc.nextInt();
		int[] transactioninputs = new int[transactionSize];
		System.out.println("Enter transaction values");
		for (int i = 0; i < transactionSize; i++) {

			transactioninputs[i] = sc.nextInt();

		}

		System.out.println("Enter the total number of targets to be acheived");

		int totalTargetsToAcheive = sc.nextInt();
		Currency c = new Currency();
		for (int i = 0; i < totalTargetsToAcheive; i++) {

			System.out.println("Enter the value of the target");

			int targetValue = sc.nextInt();
			c.transactionTarget(transactioninputs, targetValue);

		}
		sc.close();
	}
}

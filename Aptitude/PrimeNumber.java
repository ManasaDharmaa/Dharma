package com.xworkz.practice.boot;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		if(num < 2) {
			System.out.println("not prime");
			return;
		}
		
		for (int i = 2; i<num; i++) {
			if (num % i == 0) {
				System.out.println("not Prime");
				return;
			}

		}
		System.out.println(" Prime");
	}

}

package com.learning.main;

import java.util.Scanner;

import com.learning.service.Service;

public class DriverClass {

	public static void main(String[] args) {
		Service s = new Service();
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of transaction array:");
		size=sc.nextInt();
		int[] transac = new int[size];
		System.out.println("enter the values of array");
		for(int i=0;i<size;i++){
			transac[i]=sc.nextInt();	
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		int target = sc.nextInt();
		for(int j=0;j<target;j++) {
			System.out.println("Enter the value of target");
			int value=sc.nextInt();
			s.transAchieved(transac, value);
		}
		sc.close();

	}

}

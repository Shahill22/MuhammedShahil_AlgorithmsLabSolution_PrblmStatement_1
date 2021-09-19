package com.learning.service;

public class Service {
	public void transAchieved(int[] array,int value) {
		int sum=0;
		int count=0;
		int flag=0;
		for(int i =0;i<array.length-1;i++) {
			sum += array[i];
			if (sum>=value) {
				count++;
				flag=0;
				break;
			}
			else {
				count++;
				flag=1;
			}
		}
		if(flag==1) {
			System.out.println("Given target is not achieved");
		}
		else {
			System.out.println("Target achieved after " + (count) + " transactions");
		}
	}

}
//Given target is not achieved
//Your Work Done
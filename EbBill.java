package jav.ArrayPractice;

import java.util.Scanner;

public class EbBill {


public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Numer of Bills :");
		int count=sc.nextInt();
		int[] billAmount= new int[count];
		int totalBill=0;
		int highestValue=0;
	    int temp;
	    int average;
	    
		for(int i=0;i<billAmount.length;i++) {
			System.out.println("Enter bill of cycle "+(i+1)+" :");
			billAmount[i]=sc.nextInt();
		
			totalBill=totalBill+billAmount[i];
			
			if(billAmount[i]>highestValue) {
				highestValue=billAmount[i];
			}
			
			
			
		}
		for(int i=0;i<billAmount.length;i++) {
		for(int j = i+1; j<billAmount.length; j++){
            if(billAmount[i]>billAmount[j]){
               temp = billAmount[i];
               billAmount[i] = billAmount[j];
               billAmount[j] = temp;
            }
         }
		}
		average=totalBill/billAmount.length;
		System.out.println("Total is :"+totalBill);
		System.out.println("Average is :"+average);
		System.out.println("Highest is :"+highestValue);
		System.out.println("Lowest Bill is :"+billAmount[0]);
		
		// TODO Auto-generated method stub

	}
}

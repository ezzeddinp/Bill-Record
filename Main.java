package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {
	public Main() {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		String customerName;
		System.out.println("Customer Name: ");
		customerName = sc.nextLine();
		
		String foodName;
		System.out.println("Food Name: ");
		foodName = sc.nextLine();
		
		int foodPrice;
		System.out.println("Food Price: ");
		foodPrice = sc.nextInt();
		
		int quantity;
		System.out.println("Quantity: ");
		quantity = sc.nextInt();
		
		String paymentMethod;
		System.out.println("Payment Method [Cash | Transfer | Qris]: ");
		sc.nextLine();
		paymentMethod = sc.nextLine().toLowerCase();
		
		ArrayList<Integer> paymentPoint = new ArrayList<>();
		
		if (paymentMethod.equals("cash")) {
			paymentPoint.add(0);
		} else if (paymentMethod.equals("transfer")) {
			paymentPoint.add(5);
		} else if (paymentMethod.equals("qris")) {
			paymentPoint.add(10);
		} else {
			System.out.println("Invalid payment method.");
		}
		
		// Calculating Total Discount & Total Price:
		int totalDisc = customerName.length() + paymentPoint.stream().mapToInt(Integer::intValue).sum();
		int totalPrice = (foodPrice * quantity) - ((foodPrice * quantity) * (totalDisc / 100));
				
		
		int randomNum = new Random().nextInt(1000);
		
		String billID;
		System.out.println("Your Bill ID: ");
		billID = String.format("AI%03d", randomNum);
		
		
		// Output Display:
		System.out.println("============ Display ===========");
		System.out.println(customerName);
		System.out.println(foodName);
		System.out.println(foodPrice + "(Rupiah)");
		System.out.println(quantity);
		System.out.println(paymentMethod);
		System.out.println(paymentPoint);
		System.out.println(totalDisc + "%");
		System.out.println(totalPrice + "(Rupiah)");
		System.out.println(billID);
	}
	

}


// OUTPUT Display:
// Customer Name: 
// zeddin
// Food Name: 
// mie ayam
// Food Price: 
// 10000
// Quantity: 
// 4
// Payment Method [Cash | Transfer | Qris]: 
// qris
// Your Bill ID: 
// ============ Display ===========
// zeddin
// mie ayam
// 10000
// 4
// qris
// [10]
// 16
// 40000
// AI826

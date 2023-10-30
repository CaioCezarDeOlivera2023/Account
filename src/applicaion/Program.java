package applicaion;

import java.util.Locale;
import java.util.Scanner;

import entites.exeption.BusinessException;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number:");
		int number = sc.nextInt();
		System.out.print("Holder:");
		String holder = sc.next();
		sc.nextLine();
		System.out.print("Initial balance:");
		double balance = sc.nextDouble();
		System.out.print("Withdraw Limit:");
		double withdraw = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdraw);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		try {
			acc.Withdraw(amount);
			System.out.printf("New balance: %.2f%n ", acc.getBalance());
		}
		catch(BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}

package com.remitter.io;

import java.util.Scanner;

import com.remitter.bo.BeneficiaryBo;
import com.remitter.bo.RemitterBo;
import com.remitter.model.Beneficiary;
import com.remitter.model.FundTransfer;
import com.remitter.model.Remitter;

public class RemitterMain {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Would you like to create new account. Enter(Yes/No):");
		String str=s.next();
		if(str.equalsIgnoreCase("yes")) {
			addNewRemitter();
			login();
		}
		else if(str.equalsIgnoreCase("no")) {
			login();
		}
		else {
			System.out.println("Entered invalid option");
			System.exit(1);
		}
		
		menuPage();
//		getRemitterByAccountNumber();
		
	}

	private static void menuPage() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		if(choice==1) {
			int result=beneficiaryRegistration();
			if(result==1) {
				System.out.println("Beneficiary details registered successfully");
			}
			else {
				System.out.println("Beneficiary details not registered successfully");
			}
		}
		else if(choice==2) {
			fundTransfer();
		}
		else if(choice==3) {
			exit();
		}
		else {
			System.out.println("You entered invalid option");
		}
	}

	private static int beneficiaryRegistration() {
		Scanner sc=new Scanner(System.in);
		Beneficiary beneficiary=new Beneficiary();
		System.out.println("Enter beneficiary account number:");
		beneficiary.setbAccountNumber(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter beneficiary name:");
		beneficiary.setbName(sc.nextLine());
		System.out.println("Enter beneficiary bank name:");
		beneficiary.setBankname(sc.nextLine());
		System.out.println("Enter beneficiary ifsc code");
		beneficiary.setIFSC(sc.next());
		System.out.println("Enter beneficiary current balance:");
		beneficiary.setCurrentBalance(sc.nextInt());
		System.out.println("Enter beneficiary email id");
		beneficiary.setEmail(sc.next());
		BeneficiaryBo bbo=new BeneficiaryBo();
		int result=bbo.beneficiaryRegistration(beneficiary);
		return result;
	}

	private static void exit() {
		System.out.println("Transaction cancelled!!");
	}

	private static void fundTransfer() {
		Scanner sc=new Scanner(System.in);
		FundTransfer ft=new FundTransfer();
		System.out.println("Enter the transactionId:");
		ft.setTransactionId(sc.nextInt());
		System.out.println("Enter the remitter account number:");
		ft.setRemitterAccountNumber(sc.nextInt());
		System.out.println("Enter the beneficiary account number:");
		ft.setBeneficiaryAccountNumber(sc.nextInt());
		System.out.println("Enter the amount you want to transfer:");
		ft.setTransactionAmount(sc.nextInt());
		System.out.println("Enter the Transaction status");
		ft.setTransactionStatus(sc.next());
		System.out.println("Enter the date");
		ft.setTransactionDate(sc.next());
		RemitterBo rbo=new RemitterBo();
		rbo.transferFund(ft);
	}

	
	private static void login() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter remitter account number to login:");
		int aNumber=sc.nextInt();
		System.out.println("Enter remitter password to login:");
		String password=sc.next();
		RemitterBo rbo=new RemitterBo();
		Remitter remitter=rbo.login(aNumber,password);
		if(remitter!=null && aNumber==remitter.getAccountNumber() && password.equals(remitter.getPassword())) {
			System.out.println("i. Beneficiary Registration");
			System.out.println("ii. Fund Transfer");
			System.out.println("iii. Exit");
			System.out.println();
		}
		else {
			System.out.println("Invalid Credentials");
			System.out.println();
			login();
		}
	}

	private static void getRemitterByAccountNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account number of remitter you want:");
		int an=sc.nextInt();
		RemitterBo rbo=new RemitterBo();
		Remitter remitter=rbo.getRemitterByAccountNumber(an);
		if(remitter!=null) {
			System.out.println(remitter);
		}
		else {
			System.out.println("No remitter found with the details");
		}
	}

	private static void addNewRemitter() {
		Scanner sc=new Scanner(System.in);
		Remitter remitter=new Remitter();
		System.out.println("Enter remitter Account number:");
		remitter.setAccountNumber(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter remitter Name:");
		remitter.setName(sc.nextLine());
		System.out.println("Enter remitter Email Id:");
		remitter.setEmailId(sc.next());
		System.out.println("Enter remitter password:");
		remitter.setPassword(sc.next());
		System.out.println("Enter remitter balance:");
		remitter.setBalance(sc.nextInt());
		System.out.println("Enter remitter account status");
		remitter.setAccountStatus(sc.nextInt());
		System.out.println("Enter remittere IFSC Code");
		remitter.setIfsc(sc.next());
		RemitterBo rbo=new RemitterBo();
		int result=rbo.registerRemitter(remitter);
		if(result==1) {
			System.out.println("Remitter details added successfully");
		}
		else {
			System.out.println("Remitter details added successfully");
		}
	}
}

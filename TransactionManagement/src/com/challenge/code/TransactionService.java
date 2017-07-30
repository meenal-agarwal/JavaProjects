package com.challenge.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TransactionService {

	List<Transactions> transaction;
	
	public TransactionService() {
		transaction = new ArrayList<>();
	}
	
	public void addTransaction(){
		transaction = Arrays.asList(
				new Transactions(426.50,"ATM",00000002),
				new Transactions(1000.00,"Grocery",00000004),
				new Transactions(4000.00,"LifeStyle",00000002),
				new Transactions(2000.50,"Radisson",00000002));
//		Transactions trans1 = new Transactions(426.50,"ATM",00000002);
//		transaction.add(trans1);
//		Transactions trans2 = new Transactions(1000.00,"Grocery",00000004);
//		transaction.add(trans2);
//		Transactions trans3 = new Transactions(4000.00,"LifeStyle",00000002);
//		transaction.add(trans3);
//		Transactions trans4 = new Transactions(2000.50,"Radisson",00000002);
//		transaction.add(trans4);
	}
	
	public void displayALl(){
	
		for(Transactions trans : transaction){
			System.out.println("Amount: "+trans.getAmount()+" ,Type: "+trans.getType()+" ,Parent-Id: "+trans.getParent_id()+" ,Trans-id: "+trans.transaction_id);
		}
	}
	
	
	public static void main(String[] args) {
		TransactionService service = new TransactionService();
		service.addTransaction();
		service.displayALl();
		
		
	}

}

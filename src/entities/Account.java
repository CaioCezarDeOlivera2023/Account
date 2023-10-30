package entities;

import entites.exeption.BusinessException;

public class Account {

	private Integer number;
	private String name;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
		}

	public Account(Integer number, String name, Double balance, Double withdrawLimit) {
		this.number = number;
		this.name = name;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void Withdraw(double amount) {
		validateWithdraw(amount);
		balance -= amount;
	}
	private void validateWithdraw(double amount) {
		
		if(amount > getWithdrawLimit()){
			throw new BusinessException("Withdraw error: The amount exceeds withdraw limit"); 
		}
				if (amount > getBalance()){		
					throw new BusinessException("Withdraw error: Not enough balance");
		}
		
	}
}	
	

	
	


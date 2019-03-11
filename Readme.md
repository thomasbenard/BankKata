# Bank account kata
Create a simple bank application with the following features:
- Deposit into com.thomasbenard.bankkata.Account
- Withdraw from com.thomasbenard.bankkata.Account
- Print a bank statement into the console

## Objectives
Learn and practice the double loop of TDD called Acceptance Test Driven Development (ATDD).

## Requirements
Write a class `com.thomasbenard.bankkata.Account` that contains the following three functions:
> void deposit(int amount);  
void withdraw(int amount);  
void printStatements();

You are not allowed to change the signature of these functions nor to add any public method to the com.thomasbenard.bankkata.Account class, except for constructors.

Use Strings for dates and integers for the amounts.

In order to make your life easier, you can ignore the alignment of the columns when printing statements.

## Starting Point 
Start from defining an acceptance test:

> Given a client makes a deposit of 1000 on 10-01-2012  
And a deposit of 2000 on 13-01-2012  
And a withdrawal of 500 on 14-01-2012  
When she prints her bank statement  
Then she would see  
DATE | AMOUNT | BALANCE  
14/01/2012 | -500 | 2500   
13/01/2012 | 2000 | 3000  
10/01/2012 | 1000 | 1000

## Acknowledgments

A big thank you to [Sandro Mancuso](https://twitter.com/sandromancuso) for the original Bank Kata that you can find on his [github](https://github.com/sandromancuso/Bank-kata/)
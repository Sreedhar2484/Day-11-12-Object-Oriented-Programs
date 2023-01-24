package com.bridgelabz.stockaccountmanagement;

import java.util.Scanner;

public class portfolio extends StockAccount {
    public static void main(String[] args) {

        System.out.println("Enter  total number of Stocks : ");
        Scanner scanner = new Scanner(System.in);
        setNoOfStocks(scanner.nextInt());
        StockAccount stock = new StockAccount();
        stock.addShare();
        TotalValue += StockPrice;

        System.out.println("\nTotal Value is " + TotalValue);
    }
}
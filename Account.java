/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3account;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Account {
    
   private double balance;
   private String name ;
   private int password;
   public Account(String name ,double balance,int password ) {
    
   this.name=name;
   this.balance=balance;
   this.password=password;
       
}
    
 public  void add(double amount ){
     
     if(amount>0.0)
         balance+=amount;
     System.out.println("addingAmount is "+amount );
     
 }   
    
 
 public void withdraw(double amount ){
     Scanner in=new Scanner (System.in);
     int count=0;
     System.out.println("Enter a password  ");
     int pass=in.nextInt();
     while (pass!=password){
         count ++;
        if(count==3)
             System.out.println("Your number of attempts has expired:");
        else 
             System.out.println("you have "+(3-count)+"attempt");
     }
     
     if (amount>this.balance){
         System.out.println("you don't have enough money: ");
     }
     
     else {
         balance-=amount;
         System.out.println("withdrawAmount is "+amount);
     }
         
         }
 public double getBalance(){
     return this.balance;
 }

    @Override
    public String toString() {
        return "Account{" + "balance=" + balance + ", name=" + name + ", password=" + password + '}';
    }
 
 
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3account;

/**
 *
 * @author USER
 */
public class Lab3Account {

    public static void main(String[] args) {
        
        Account a1=new Account("ali",2000,1234);
        System.out.println("your current balance"+a1.getBalance());
        a1.add(200);
        a1.withdraw(2000);
        System.out.println(a1);
        Account a2=new Account("Mohanad",3000,1235);
        System.out.println("your current balance"+a2.getBalance());
        a2.add(200);
        a2.withdraw(2000);
        System.out.println(a2);
        
        
        
    }
}

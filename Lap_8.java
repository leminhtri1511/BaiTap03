/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaphien1;

import java.util.Scanner;

/**
 *
 * @author Lab
 */
public class Lap_8 {
 public static void main(String args[])
 {  
  int i,fact=1;  
  int num;
  Scanner sc = new Scanner(System.in);
  System.out.print("Nhap so: ");
  num = sc.nextInt();
  for(i=1;i<=num;i++)
  {    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+num+" is: "+fact);    
 }  
}  
    


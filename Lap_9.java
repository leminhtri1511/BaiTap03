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
public class Lap_9 
{
    public static void main(String[] args) 
    {
    int num , reversed = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap so: ");
    num = sc.nextInt();
    while(num != 0) 
    {
      int digit = num % 10;
      reversed = reversed * 10 + digit;
      num /= 10;
    }
    System.out.println("Reversed Number: " + reversed);
    }
}

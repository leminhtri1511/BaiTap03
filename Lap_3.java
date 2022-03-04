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
public class Lap_3 
{
    public static void main(String[] args)
    { 
    int i, num, sum = 0;  
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    for(i = 1; i <= num; ++i)  
    {  
        sum = sum + i;  
    }  
     System.out.println("Sum of First 10 Natural Numbers is = " + sum);  
    }  
}  
        


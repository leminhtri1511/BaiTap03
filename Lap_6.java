/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap;

import java.util.Scanner;

/**
 *
 * @author Lab
 */
public class Lap_6 {
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int min,max;
        System.out.print("nhap so nho: ");
        min=s.nextInt();
        System.out.print("nhap so lon: ");
        max=s.nextInt();
        for(int i=min; i<=max; i++) 
        {
            if(isPrime(i)) 
            {
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int num) 
    {    
        for(int i = 2; i <= num/i; ++i) 
        {
            if(num % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstproject;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class ChuVi {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    double r = 0;
    double chuvi;
    try 
    {
        System.out.print("r = ");
        r = sc.nextDouble();
    } 
    catch(Exception e)
    {
        System.out.println("Du lieu khong dung!");
    }
        chuvi = r * 2 * 3.14159;
        System.out.println("chu vi hinh tron la " + chuvi);
    }
}

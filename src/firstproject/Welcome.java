/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstproject;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Welcome {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("radius = ");
        double radius = sc.nextDouble();
        double area;
        area = radius * radius * 3.14159;
        System.out.println("dien tich hinh tron  "+ radius +" la "+ area);
  }
}
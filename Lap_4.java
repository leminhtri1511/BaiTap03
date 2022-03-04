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
public class Lap_4 {
    public static void main(String[] args) {
    int count = 0, num ;
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    while (num != 0) {
      // num = num/10
      num /= 10;
      ++count;
    }
    System.out.println("Number of digits: " + count);
  }
    
}

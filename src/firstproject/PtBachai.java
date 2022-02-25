/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//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
package bt_6;
import java.util.Scanner;
/**
 *
 * @author Lab
 */
public class BT_6 
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    double a, b, c, x1, x2, dt;
    System.out.print("a = ");
    a = sc.nextDouble();
    System.out.print("b = ");
    b = sc.nextDouble();
    System.out.print("c = ");
    c = sc.nextDouble();
    dt = Math.pow(b, 2) - 4*a*c ;
    if(a == 0)
    {
        if(b == 0)
        {
            if(c == 0)
            {
                System.out.print("Pt vo so nghiem ");
            }
            else
            {
                System.out.print("Pt vo nghiem ");
            }
        }
        else
        {
            System.out.print("Pt co nghiem duy nhat " + (-c/b));
        }  
    }
    else
    {
    if(dt < 0)
        {
                System.out.print("Pt vo nghiem ");
        }
        else if (dt == 0)
        {
                x1 = -b/(2*a);
                System.out.print("Pt co nghiem kep x1 = x2 =  " + x1);
        }
                else
                {
                x1 = ((-b + Math.sqrt(dt))/(2*a));
                x2 = ((-b - Math.sqrt(dt))/(2*a));
                System.out.print("Pt co nghiem x1 = "+ x1 +" va x2 =  " + x2);
                }
    }
    }     
}

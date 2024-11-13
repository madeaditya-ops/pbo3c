    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mi3c;

/**
 *
 * @author ASUS 
 */
import java.util.Scanner;
public class Mi3c {

    public static void main(String[] args) {
        int n;
        int i;
        System.out.println("program mulai");
        Scanner input = new Scanner(System.in);
        System.out.println("Inputkan nilai 1 : ");
        n = input.nextInt();
       for (i=1 ;i<=n ;i++)
       {
           System.out.println(i);
       }
       System.out.println();
       System.out.println("program selesai");
    } 
}

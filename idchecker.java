/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idd;

import java.util.Scanner;

/**
 *
 * @author theblackdevil
 */
public class idchecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] verefier = {1, 2};
        System.out.println("enter your ID:");
        String[] idnums = (new Scanner(System.in)).nextLine().split("");
        if (idnums.length != 9) {
            System.out.println("Incorrecet ID number");
            System.exit(0);
        }
        int lastResult = 0;
        for (int i = 0; i < idnums.length; i++) {
            int num = 0;
            if (i % 2 == 0) {
                num += Integer.parseInt(idnums[i]) * verefier[0];
            } else {
                num += Integer.parseInt(idnums[i]) * verefier[1];
            }
            if (num < 10) {
                lastResult += num;
            } else {
                int num1 = 0;
                while (num > 0) {
                    num1 += num % 10;
                    num /= 10;
                }
                lastResult += num1;
            }
        }
        if (lastResult % 10 == 0) {
            System.out.println("Correcet ID number");
        } else {
            System.out.println("Incorrecet ID number");
        }
    }

}
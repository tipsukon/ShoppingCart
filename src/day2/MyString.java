/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.Scanner;

/**
 *
 * @author ARIT
 */
public class MyString {
    public static void main(String[] args){
        
        System.out.print("Pls enter your first/last name :");
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
//        String input = "Tip San";
        
        int spaceIndex = input.indexOf(" ");
        String firstname = input.substring(0, spaceIndex);
        String lastname = input.substring(spaceIndex);
        
        System.out.println("firstname : " + firstname);
        System.out.println("lastname : " + lastname);
        
        
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.alien.day3_assignment_letsupgrade_javaessentials;

import java.util.Scanner;

/**
 *
 * @author Alien
 */
public class Day3_Assignment_LetsUpgrade_JavaEssentials {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        while(true){
            System.out.println("Enter Your Age");
            String input = scanner.nextLine();
            
            if(input.matches("[0-9]+") && Integer.parseInt(input) > 0){
                int age = Integer.parseInt(input);
                if(age >= 18){
                    System.out.println("You are " + age + " years old.\nYou are qualified to vote");
                }else{
                    System.out.println("You are " + age + " years old.\nYou do not qualify to vote");
                }
                
                break;
            }else{
                System.out.println("Please provide a valid age value\n\n");
            }
        }
    }
}


package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any two numbers  and B");
        System.out.println("A:");
        int number1 = input.nextInt();
        System.out.println("B:");
        int number2 = input.nextInt();
        if(number1>number2){
            System.out.println(number1);
       }else{
                System.out.println(number2);
       }
}
}


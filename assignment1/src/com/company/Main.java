package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // OOP ASSIGNMENT 1

        Scanner input = new Scanner(System.in);

        System.out.print("Please input your KCSE grade: ");
        int KCSE_grade = input.nextInt();

        System.out.print("Please input your interview score(1-10): ");
        int interviewMARK = input.nextInt();

        System.out.print("What is your confidence level score(1-10)? ");
        int confidenceSCORE = input.nextInt();

        {
            if (KCSE_grade >= 65 && (interviewMARK >= 6 || confidenceSCORE >= 5))
                System.out.print("QUALIFIED!\n");

            else if (KCSE_grade >= 65 && (interviewMARK < 6 || confidenceSCORE< 5))
                System.out.print("UNQUALIFIED! \n");
        }
        if (KCSE_grade < 65)
            System.out.print("UNQUALIFIED! \n");
    }
}


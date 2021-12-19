package com.aad;
import java.util.Scanner;
public class Neon_Number {

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int square= num*num;
        int n2= 0;

        while (square>0){
           int remainder= square %10;
                 n2= n2+ remainder;
                 square /=10;
        }
        if (n2==num){
            System.out.printf("Hurray you have Neon Number"+" "+num);
        }
        else{
            System.out.println("Sorry the number is not a Neon Number");
        }


}
}



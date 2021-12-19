package com.aad;
import java.util.Scanner;
public class Amstrong_Number{

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int n1 = num;
        int count=0;
        int fin_num=0;

        while (num > 0){
            num= num/10;
            count++;
        }
        while (n1 > 0){
            int remainder= n1 %10;
            fin_num = (int)(fin_num + Math.pow(remainder,count));
            n1 /=10;
        }
        if (fin_num == num){
            System.out.println("Hurray you have Amstrong Number"+" "+num);
        }
        else{
            System.out.println("Sorry the number is not a Amstrong Number");
        }


    }
}
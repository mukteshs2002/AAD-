package com.aad;
import java.util.Scanner;
public class ISBN_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        long[] arr = new long[10];
        System.out.println("Enter a 10 digit number:");
        long num1 = sc.nextLong();

        long num2;
        for (int i = 9; i < n; i--)
        {
            while (num1>0){
            num2= num1%10;
            arr[i]=num2;
                System.out.println(arr[i]);
            num1/=10;
            }
        }
        int i2=0;
        int i1=10;
        long sum1= 0;
        long sum=0;
        while (i2<10)
        {
            sum = sum + (arr[i2] * i1);
            i1--;
            i2++;
        }
         System.out.println(sum);
            if (sum % 11 == 0) {
                System.out.println("Yes, it is a ISBN Number");
            } else {
                System.out.println("NO, it is not a ISBN Number");
            }
        }

    }

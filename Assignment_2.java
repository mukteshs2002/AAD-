package com.aad;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
////1.FIBONACCI NUMBERS
//public class Assignment_2 {
//
//    public static void main(String[] args){
//        int a=0;
//        int b=1;
//        int sum=0;
//        System.out.println(a);//printing 0
//        System.out.println(b);// printing 1
//        while (sum<100){
//            sum= a+b;
//            a=b;
//            b=sum;
//            System.out.println(sum);// printing the fibonacci series
//
//        }
//    }
//}
////2.PRIME NUMBER
//public class Assignment_2 {
//    public static void main(String[] args){
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter a positive integer:");
//        int num= sc.nextInt();
//      int n1=num/2;
//        int rem=0;
//        int count=0;
//        if (num==0||num==1 ){
//            System.out.println(num+" "+"is neither prime nor composite");
//        }
//        else if (num==2){
//            System.out.println(num+" "+"is a prime number");
//        }
//        else {
//            int n;
//            for (n=2; n<n1;n++)
//                if (num % n == 0) {
//                    System.out.println(num + " " + "is a not prime number");
//                    break;
//
//                }
//           else{
//                System.out.println(num+" "+"is a prime number");
//            }
//        }
//    }
//}
////3.FACTORIAL of NUMBER
//public class Assignment_2 {
//    public static void main(String[] args){
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter your number:");
//        int num= sc.nextInt();
//        int n1;
//        int fact=1;
//
//       for(n1=1;n1<=num;n1++){
//        fact=(fact*n1);
//       }
//           System.out.println("The factorial of "+num+" is "+fact);
//}}

////4.Neon Number
//public class Assignment_2 {
//    public static void main(String[] args){
//        System.out.println("Enter a number:");
//        Scanner sc= new Scanner(System.in);
//        int num= sc.nextInt();
//        int square= num*num;
//        int n2= 0;
//
//        while (square>0){
//            int remainder= square %10;
//            n2= n2+ remainder;
//            square /=10;
//        }
//        if (n2==num){
//            System.out.printf("Hurray you have Neon Number"+" "+num);
//        }
//        else{
//            System.out.println("Sorry the number is not a Neon Number");
//        }
//
//    }
//}

//5.REVERSE OF NUMBER
//public class Assignment_2 {
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number you want to reverse:");
//        int num= sc.nextInt();
//        int remainder=0;
//        int reverse=0;
//        while (num!=0){
//            remainder= num%10;
//            reverse=reverse*10 +remainder;
//            num=num/10;
//
//        }
//        System.out.println("The reversed number is "+reverse);
//    }
//}

////6.ISBN NUMBER
//public class Assignment_2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = 10;
//        long[] arr = new long[10];
//        System.out.println("Enter a 10 digit number:");
//        long num1 = sc.nextLong();
//
//        long num2;
//        for (int i = 9; i < n; i--)
//        {
//            while (num1>0){
//                num2= num1%10;
//                arr[i]=num2;
//                System.out.println(arr[i]);
//                num1/=10;
//            }
//        }
//        int i2=0;
//        int i1=10;
//        long sum1= 0;
//        long sum=0;
//        while (i2<10)
//        {
//            sum = sum + (arr[i2] * i1);
//            i1--;
//            i2++;
//        }
//        System.out.println(sum);
//        if (sum % 11 == 0) {
//            System.out.println("Yes, it is a ISBN Number");
//        } else {
//            System.out.println("NO, it is not a ISBN Number");
//        }
//    }
//
//}

//7.COPY ARRAY
// public class Assignment_2 {
//    public static void main(String[] args){
//        int[] mk= {22,1,2,5,2};
//        int[] mk2= new int[mk.length];
//
//        int i;
//        for (i=0;i<mk.length;i++){
//            mk2[i]=mk[i];
//        }
//        System.out.println("Original array"+ Arrays.toString(mk) );
//        System.out.println("Copied array "+Arrays.toString(mk2));
//    }
//}
//8.PRINTING ARRAY ELEMENTS
//public class Assignment_2 {
//    public static void main(String[] args){
//        int[] mk= {22,1,2,5,2};
//
//
//        int i;
//        for (i=0;i<mk.length;i++) {
//            System.out.println("ARRAY ELEMENT "+(i+1)+" is " + mk[i]);
//        }
//    }
//}

//9.LARGEST NUMBER IN ARRAY
//public class Assignment_2 {
//    public static void main(String[] args){
//        int[] mk= {22,1,2,5,2,50};
//
//        int max=0;
//        int i;
//        for (i=0;i<mk.length;i++) {
//            if(mk[i]>max){
//            max=mk[i]; }
//        }
//        System.out.println("The largest number of array is "+max);
//    }
//}

//10. ADDITION OF MATRIX
//public class Assignment_2 {
//    public static void main(String[] args){
//        int[][] a={{1,4,3},{2,4,1},{33,5,1}};
//        int[][] b={{4,4,9},{3,5,7},{3,53,11}};
//        int[][] sum=new int[3][3];
//        int i,j;
//
//        for(i=0;i<3;i++){
//            for(j=0;j<3;j++){
//                sum[i][j]=a[i][j]+b[i][j];
//                System.out.print(sum[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//11. CHECKING EQUAL MATRIX
//public class Assignment_2 {
//    public static void main(String[] args) {
//        int[][] a = {{1, 4, 3}, {2, 4, 1}, {33, 5, 1}};
//        int[][] b = {{4, 4, 9}, {3, 5, 7}, {3, 53, 11}};
//        int[][] sum = new int[3][3];
//        int i, j;
//        boolean flag = false;
//        for (i = 0; i < 3; i++) {
//            for (j = 0; j < 3; j++) {
//                if (a[i][j] == b[i][j]) {
//                    flag = true;
//                    break;
//                }
//            }
//            if (flag)
//                System.out.println("The matrices are equal");
//
//             else
//                 System.out.println("The matrices are not equal");
//
//
//        }
//    }
//}

////12. TRANSPOSE OF MATRIX
//public class Assignment_2 {
//    public static void main(String[] args){
//        int[][] a={{1,4,3},{2,4,1},{33,5,1}};
//        int[][] transpose=new int[3][3];
//        int i,j;
//        for(i=0;i<3;i++){
//            for(j=0;j<3;j++){
//                transpose[i][j]=a[j][i];
//                System.out.print(transpose[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}

////13. NUMBER  OF CHARACTERS of string
//public class Assignment_2 {
//    public static void main(String[] args){
//        String mk= "Lionel Messi is the GOAT";
//        int count= 0;
//        int i;
//        for (i=0;i<mk.length();i++){
//            if(mk.charAt(i)!=' ' ){
//                count++;}
//        }
//        System.out.println("The number of characters is "+count);
//    }
//}

////14. REVERSE A STRING
//public class Assignment_2 {
//    public static void main(String[] args){
//        String mk= "Lionel Messi is the GOAT";
//        String reverse= "";
//        int i;
//        for (i=mk.length()-1;i>=0;i--){
//            reverse= reverse + mk.charAt(i);
//        }
//        System.out.println("The original string is :"+mk+"\n");
//        System.out.println("The reverse string is :"+reverse);
//}
//}

////15. NUmber of Vowels and consonants in A STRING
//public class Assignment_2 {
//    public static void main(String[] args){
//        String mk= "Lionel Messi is the GOAT";
//        mk=mk.toLowerCase();
//        int consonant=0;
//        int vowel=0;
//        int i;
//        for (i=mk.length()-1;i>=0;i--){
//            if(mk.charAt(i)=='a'||mk.charAt(i)=='e'||mk.charAt(i)=='i'||mk.charAt(i)=='o'||mk.charAt(i)=='u')
//            {
//                vowel++;
//            }
//            else if(mk.charAt(i)>='a'&& mk.charAt(i)<='z'){
//                consonant++;
//            }
//        }
//        System.out.println("The number of consonants is :"+consonant+"\n");
//        System.out.println("The number of vowels is :"+vowel);
//    }
//}







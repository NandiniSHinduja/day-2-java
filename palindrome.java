package day2;
import java.io.*;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the first digit of the number:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("Enter the second digit of the number:");
        int y=sc.nextInt();
        System.out.println("Enter the third digit of the number:");
        int z=sc.nextInt();
        int result=(z*100)+(y*10)+(x);
        System.out.println("Enter the entire number:");
        int ans=sc.nextInt();
        if(result==ans){
            System.out.println("The given number is a palindrome.");
        }
        else{
            System.out.println("The given number is not a palindrome.");
        }
    }
    
}

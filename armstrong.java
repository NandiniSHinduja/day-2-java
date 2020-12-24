package day2;
import java.io.*;
import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        System.out.println("Enter the first digit of the number:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a=x*x*x;
        System.out.println("Enter the second digit of the number: ");
        int y=sc.nextInt();
        int b=y*y*y;
        System.out.println("Enter the third digit of the number:");
        int z=sc.nextInt();
        int c=z*z*z;
        int result=a+b+c;
        System.out.println("Enter the entire number:");
        int ans=sc.nextInt();
        if(result==ans){
            System.out.println("The given number is an Armstrong number");
        }
        else{
            System.out.println("The given number is not an Armstrong number.");
        }
        sc.close();
    }
    
}

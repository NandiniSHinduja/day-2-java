package day2;
import java.io.*;
import java.util.*;

public class armstrong1 {
    public static void main(String[] args) {
        System.out.println("Armstrong.");
        Scanner sc=new Scanner(System.in);
        int n,r,s=0,temp;
        System.out.println("Enter the number:");
        n=sc.nextInt();
        temp=n;
        while(temp>0){
            r=temp%10;
            s=(r*r*r)+s;
            temp=temp/10;
        }
        if(n==s){
            System.out.println("The number is a armstrong number.");
        }
        else{
            System.out.println("The number is not a armstrong number.");
        }
    }
}

    


package day2;
import java.io.*;
import java.util.*;
public class numberpattern {
    public static void main(String[] args) {
        System.out.println("Number Pattern.");
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print( j + " ");
            }
            System.out.print("\n");
        }

    }
    
}

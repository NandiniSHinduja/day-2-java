package day2;
import java.io.*;
import java.util.*;
public class starpattern2 {
    public static void main(String[] args) {
        System.out.println("Star pattern");
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>0;j--){
                if(j>i){
                    System.out.print(" ");
                    continue;
                }
                System.out.print("*");

            }System.out.print("\n");
        }
    }
    
}

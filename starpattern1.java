package day2;
import java.io.*;
import java.util.*;
public class starpattern1 {
    public static void main(String[] args) {
        System.out.println("Star Pattern");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.print("\n");

        }
    }
    
}

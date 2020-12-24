package day2;
import java.io.*;
import java.util.*;
public class randomno {
    public static void main(String[] args) {
        System.out.println("Welcome to my random number generator!");
        System.out.println("You will have to enter the range and the random number generator will generate a number within that range.");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the upper bound:");
        int x=sc.nextInt();
        System.out.println("Enter the lower bound:");
        int y=sc.nextInt();
        if(y<x){
            Random rand=new Random();
            int z=rand.nextInt(x-y+1)+y;
            System.out.println("The random number generated is " +z);
        }
        else{
            System.out.println("The lower bound should be lesser than the upper bound.");
        }
    }
}

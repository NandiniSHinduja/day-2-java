package day2;
import java.io.*;
import java.util.*;
public class copyarray {
    public static void main(String[] args) {
        System.out.println("Copying an array");
        String A[]={"cat", "rat", "bat", "sat", "fat", "mat", "eat"};
        String B[]=new String[10];
        for(int i=0; i<A.length;i++){
            B[i]=A[i];
        }
        for(int j=0; j<B.length; j++){
            System.out.println(B[j]);
        }
       

    }
    
}

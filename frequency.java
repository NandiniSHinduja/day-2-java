package day2;
import java.util.*;
public class frequency {
    public static void main(String[] args) {
        int A[]={1,2,3,4,6,7,2,2,3,1,1,1,6,7,6,7,4,4};
        for(int i=0; i<A.length;i++){
            System.out.print(A[i] + " ");
        }
        System.out.println("Enter the no whose frequency you want to check:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int counter=0;
        for(int i=0;i<A.length; i++){
            if(A[i]==n){
                counter++;
            }
    
        }
        System.out.println("The frequency of " +n + " is " +counter);
    }
    
}

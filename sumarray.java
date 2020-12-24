package day2;

public class sumarray {
    public static void main(String[] args) {
        System.out.println("Sum of elements an array");
        int A[]={1,9,7,8,6,5,3};
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum=sum+A[i];
        
        }
        System.out.println("The array is ");
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]);
            if(i==A.length-1){
                System.out.print(".");
                break;
            }
            System.out.print(",");
        }
        System.out.println("\nThe sum of the elements of the array is " +sum);
    }
    
}

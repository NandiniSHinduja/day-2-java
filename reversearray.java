package day2;
public class reversearray {
    public static void main(String[] args) {
        System.out.println("Reversing array");
        String A[]={"doll", "call", "fall", "ball", "mall"};
        String B[]=new String[10];
        for(int i=0;i<A.length;i++){
            B[A.length-i-1]=A[i];
           

        }
        for(int j=0; j<B.length; j++){
            System.out.println(B[j]);
        }
    }
    
}

package day2;

public class numberarray {
    public static void main(String[] args) {
        
        System.out.println("No of elements in an array");
        String A []={"si", "hi", "bi", "pi", "ti"};
        int result=A.length;
        System.out.println("The elements in an array are");
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
        System.out.println("The number of elements in this array is " +result);
        
    }
    
}

package arrays;
import java.util.Scanner;
public class ARRAYSUM {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Array Length:");
        int n=s.nextInt();
        int[]A=new int[n];
        System.out.print("Ente the Array:");
        for(int i=0;i<n;i++) A[i]=s.nextInt();
        int a=A[0];
        for(int i=1;i<n;i++){
            int b=A[i];
            a=a+b;
        }
        System.out.print("The numeric sum of the Array is:");
        System.out.print(a);
        
    }
}

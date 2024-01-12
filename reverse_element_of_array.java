import java.util.*;
public class reverse_element_of_array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //enter array size
        int n=sc.nextInt();
        int array[]=new int[n];
        int reversearray[]=new int[n];
        //enter array values
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<array.length;i++){
            reversearray[i]=array[n-1];
            n--;
           
        }for(int i=0;i<array.length;i++){
         System.out.print(reversearray[i]+" ");
        }
    }
}

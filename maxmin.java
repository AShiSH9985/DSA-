import java.util.*;
public class maxmin {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
     
        int array[]=new int [n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        // for maximum
        
        int max=array[0];
        for(int i=0;i<n;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);

        //for minimum
        for(int i=0;i<n;i++){
            if(array[i]<max){
                max=array[i];
            }
        }
        System.out.println(max);
    }
    
}

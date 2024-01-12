import java.util.*;
public class delete_element_specified_position {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        int a[]=new int[n-1];
        System.out.println("enter values");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();

        }
        System.out.println("enter index for deletion");
        int m=sc.nextInt();
        for(int i=0;i<array.length;i++){
            if(i<m){
                a[i]=array[i];
            }
            else if(i==m)
                continue;
            else
                a[i-1]=array[i];
        }
        for(int i=0;i<n-1;i++){
            System.out.println(a[i]);
        }

    }
}

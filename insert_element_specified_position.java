import java.util.*;
public class insert_element_specified_position {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        array[a]=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(" "+array[i]);
        }
    }
    
}

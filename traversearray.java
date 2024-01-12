import java.util.*;
public class traversearray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int array[]=new int[a];
        for(int i=0;i<a;i++){
           array[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            System.out.print(" "+array[i]+" ");
        }

    }
}

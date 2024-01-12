import java.util.*;
public class searchelement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int [n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
         int a=sc.nextInt();
         int count=0;
        for(int j=0;j<n;j++){
            if(a==array[j]){     
                count++;
            }
        }
        System.out.println(count);
    }
}

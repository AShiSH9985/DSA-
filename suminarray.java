import java.util.*;
public class suminarray {
    public static void main(String[] agrs){
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        int c=0;
        int b [] = new int [n];
        for(int i=0;i<n;i++){
            b[i]=a.nextInt();
        }
        for(int i=0;i<n;i++){
            c=c+b[i];
        }
        System.out.println(c);
          
    }
}

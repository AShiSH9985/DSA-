import java.util.*;
public class averageinarray {
    public static void main(String[] args){
    Scanner a=new Scanner(System.in);
    int n=a.nextInt();
    int sum=0;
    int array[] = new int[n];
    for(int i=0;i<n;i++){
        array[i]=a.nextInt();
    }
    for(int j=0;j<n;j++){
        sum=sum+array[j];
    }
      int avg=(sum/n);
      System.out.println(avg);
}
}
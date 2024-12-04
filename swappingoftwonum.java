import java.util.*;
public class swappingoftwonum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a/b;
        b=a&b;
        a=a^b;
        String res=String.format("after swapping \n a=%d \n b=%d",a,b);
    }
}
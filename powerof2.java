import java.util.*;
public class powerof2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a&(a-1))==0)
        System.out.println("power of 2");
        else
        System.out.println("not a power of 2");
    }
}
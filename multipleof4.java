import java.util.*;
public class multipleof4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n&3)==0)
        System.out.println("multiple of 4");
        else
        System.out.println("not a multiple of 4");
    }
}
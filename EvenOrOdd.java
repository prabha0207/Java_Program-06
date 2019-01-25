import java.io.*;
import java.util.Scanner;
class EvenOrOdd

{
    public static void main(String[] args)
    {
        int x;
        System.out.println(" ");
        Scanner n = new Scanner(System.in);
        x = n.nextInt();
        if(x%2==0)
        {
            System.out.println("even");
        }
        else if(x<0)
        {
               System.out.println("invalid");
        }
        else if(x%2!=0)
        {
             System.out.println("odd");
        }
    }
}

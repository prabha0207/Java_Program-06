import java.io*;
import java.util.Scanner;
class PositiveOrNegative
{
  public static void main(String[] args)
  {
    int n;
    Scanner s=new Scanner(System.in);
    System.out.println(" ");
    n=s.nextInt();
    if(n>0)
    {
     System.out.prinln(" positive");
     }
    else if(n<0)
    {
     System.out.prinln(" negative");
     }
    else
    {
     System.out.prinln("zero");
    }
  }
}

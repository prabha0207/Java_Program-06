import java.util.Scanner;
public class SumOfK
{
public static void main(string[] args)
{
  Scanner sc= new Scanner(System.in);
  System.out.println(" ");
  int N=sc.nextInt();
  int K=sc.nextInt();
  int sum=0;
  int a[]=new int[N];
  for(int i=0;i<a.length;i++)
  {
    a[i]=sc.nextInt();
  }
  for(int i=0;i<K;i++)
  {
  sum=sum+a[i];
  }
  System.out.println(" ");
  System.out.println(sum);
}
}
   

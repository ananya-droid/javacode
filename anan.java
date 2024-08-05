import java.util.Scanner;
public class anan{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for (int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            if (array[i]%2==1 && i%2==0)
            System.out.println("Element"+array[i]);
        }
    }
}
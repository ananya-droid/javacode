import java.util.Scanner;
public class Q2{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        int k=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++){
            if (array[i]+array[j]==k)
            System.out.println(array[i]+" "+array[j]);}
        }
    }
}

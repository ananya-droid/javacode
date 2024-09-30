import java.util.Scanner;
 
class GFG {
 
    
    static int find_consecutive_steps(int arr[], int len)
    {
        int count = 0;
        int maximum = 0;
 
        for (int index = 1; index < len; index++) {
 
            if (arr[index] > arr[index - 1])
                count++;
            else {
                maximum = Math.max(maximum, count);
                count = 0;
            }
        }
 
        return Math.max(maximum, count);
    }
 
    // Driver code
    public static void main(String[] args)
    {
 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
  
        for  (int i=0;i<n;i++)
        {
           
            array[i]=sc.nextInt();
        } 
        System.out.println(
            find_consecutive_steps(array, n));
    }
}
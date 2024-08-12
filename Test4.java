class Test4{

   
   public static void main(String args[]) {
     int[] arr={3,1,2};
     int cloneARray[]=arr.clone();
     System.out.println(arr==cloneARray);
     for (int i=0;i<cloneARray.length;i++)
     {
        System.out.println(cloneARray[i]+" ");
     }
     
     
   }


}
class Test5{

   
   public static void main(String args[]) {
     int arr[][]={{1,2,3},{4,5}};
     int cloneARray[][]=arr.clone();
     System.out.println(arr==cloneARray);
     System.out.println(arr[0]==cloneARray[0]);
     System.out.println(arr[1]==cloneARray[1]);
     
    

    
     
   }


}
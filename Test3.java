class Test3{
    public static void main(String args[]) {
        int intArray[]=new int[3];
        byte byteArray[]=new byte[3];
        short shortArray[]=new short[3];
        String[] strArray=new String[3];
        System.out.println(intArray.getClass());
        System.out.println(intArray.getClass().getSuperclass());
        System.out.println(byteArray.getClass());
        System.out.println(shortArray.getClass());
        System.out.println(strArray.getClass());

    }

}
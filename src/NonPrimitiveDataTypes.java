public class NonPrimitiveDataTypes {
    public static void main(String[] args) {
        String str ="test";
        System.out.println("String = " + str);
        String str1 = new String("test");
        System.out.println("Another string: " +str1);
        int arr[];
        arr = new int[2];
        arr[0] = 10;
        arr[1] = 15;
        //arr[2] = 6;
        System.out.println(arr);
        System.out.println(arr[1]);

    }
}

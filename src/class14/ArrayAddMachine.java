package class14;

public class ArrayAddMachine {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 45, 50};
        addArrayElementsMachine(arr1);
        int[] arr2 = {10, 20, 30, 25, 30};
        addArrayElementsMachine(arr2);
    }
    static void addArrayElementsMachine(int[]arr){
        int sum=0;
        for (int number:arr){
            sum+=number;
        }
        System.out.println(sum);
    }
}

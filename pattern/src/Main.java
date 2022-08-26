import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        int val = 0, size = sc.nextInt();
        for(int i = 0; i < size; i++) {
            int colSize = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>(colSize);
            for(int j = 0; j < colSize; j++) {
                list.add(val);
                val++;
            }
            arr.add(list);
        }

        for(ArrayList<Integer> list : arr) {
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
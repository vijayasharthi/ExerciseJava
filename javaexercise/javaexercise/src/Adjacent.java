import java.util.*;
public class Adjacent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        ArrayList<Integer> tep = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i += 2) {
            tep.add(i, arr[i + 1]);
            tep.add(i + 1, arr[i]);
        }
        System.out.println(tep.toString());
    }
}

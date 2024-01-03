



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> inputList = new ArrayList<>();

        // Input
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter size: ");
            int n = in.nextInt();
            ArrayList<Integer> sublist = new ArrayList<>();
            System.out.println("Enter elements: ");
            while (n-- > 0) {
                sublist.add(in.nextInt());
            }
            inputList.add(sublist);
        }

        // Filtering duplicates
        ArrayList<ArrayList<Integer>> filteredList = filterDuplicates(inputList);

        // Output
        System.out.println("Output:");
        System.out.println(filteredList);
    }

    private static ArrayList<ArrayList<Integer>> filterDuplicates(ArrayList<ArrayList<Integer>> inputList) {
        HashSet<ArrayList<Integer>> set = new HashSet<>(inputList);
        return new ArrayList<>(set);
    }
}

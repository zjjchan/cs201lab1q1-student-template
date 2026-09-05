import java.util.*;

public class NumbersArray {
    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,1,5};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input)));       
        
        System.out.println();

        input = new Integer[] {1,2,3,4,1,2,5,3};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input))); 
    }

    // Write your methods here
    
    public static int findMax(Integer[] input) {
        int max = 0;
        for (int n : input) {
            if (n > max) {
                max = n;
            }
        }

        return max;
    }

    public static Integer[] findDuplicates(Integer[] input) {
        HashMap<Integer, Integer> count = new HashMap<>();
        ArrayList<Integer> dupes = new ArrayList<>();

        for (int n : input) {
            count.merge(n, 1, (oldVal, newVal) -> oldVal + 1);
        }

        for (Integer i : count.keySet()) {
            if (count.get(i) > 1) {
                dupes.add(i);
            }
        }

        Integer[] dupesArr = dupes.toArray(new Integer[0]);
        return dupesArr;
    }

    public static Integer[] findUnique(Integer[] input) {
         HashMap<Integer, Integer> count = new HashMap<>();
        ArrayList<Integer> uniques = new ArrayList<>();

        for (int n : input) {
            count.merge(n, 1, (oldVal, newVal) -> oldVal + 1);
        }

        for (Integer i : count.keySet()) {
            if (count.get(i) == 1) {
                uniques.add(i);
            }
        }

        Integer[] uniquesArr = uniques.toArray(new Integer[0]);
        return  uniquesArr;
    }
}


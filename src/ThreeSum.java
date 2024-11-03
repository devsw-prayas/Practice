import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        LinkedHashSet<List<Integer>> sets = new LinkedHashSet<>();
        ArrayList<Integer> set;
        List<List<Integer>> tuples = new ArrayList<>();
        int x;
        for (int i : nums) {
            x = i;
            for (int j : nums) {
                x = i;
                if (x != j) x += j;
                else break;
                for (int k : nums) {
                    if (k == -x) {
                        set = new ArrayList<>();
                        set.add(i);
                        set.add(j);
                        set.add(k);
                        Collections.sort(set);
                        sets.add(set);
                    }
                }
            }
        }
        for(List<Integer> integers : sets) {
            tuples.add(new ArrayList<>(integers));
        }
        return tuples;
    }

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        System.out.println(threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}

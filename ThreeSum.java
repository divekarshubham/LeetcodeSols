import java.util.*;

class ThreeSum {
    public static List<List<Integer>> naivethreeSum(int[] nums) {
        int n = nums.length-1;
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        Set<List<Integer>> set = new LinkedHashSet<>(); 
        for (int i = 0; i <= n-2; i++) {
            for (int j = i+1; j <= n-1; j++) {
                for (int k = j+1; k <= n; k++) {
                    if((nums[i]+nums[j]+nums[k]) == 0)
                    {
                      List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(nums[i],nums[j],nums[k]));
                        Collections.sort(l2);
                      set.add(l2);
                    }
                }
            }
        }
        l.addAll(set); 
        for (List<Integer> l1 : l) {
            for (Integer nn : l1) {
                System.out.print(nn + " ");
            }

            System.out.println();
        }
        return l;
    }

    public static void main(String[] args) {
        naivethreeSum(new int[] { -1, 0, 1, 2, -1, -4 });
    }
}
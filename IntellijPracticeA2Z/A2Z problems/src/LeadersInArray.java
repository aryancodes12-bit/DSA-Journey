import java.util.*;
public class LeadersInArray {
    public List<Integer> leaders(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        int n = nums.length; int max=Integer.MIN_VALUE;
        for (int i = n-1; i >= 0; i--) {
            if (nums[i] >max) {
                l.add(nums[i]);
                max=nums[i];
            }
        }
        Collections.reverse(l);
        return l;
        }

    public static void main(String[] args) {
        int []nums={1, 2, 5, 3, 1, 2};
        LeadersInArray l=new LeadersInArray();
        System.out.println(l.leaders(nums));
    }
    }


package Leetcode.Arrays;
import java.util.*;
public class FourSum {
    //Brute Force
    public List<List<Integer>> fourSum(int[] nums, int target) {
int n=nums.length;
Set<List<Integer>> m=new HashSet<>();
/*for(int i=0;i<n;i++){
    for(int j =i+1;j<n;j++){
        for(int k=j+1;k<n;k++){
            for(int z=k+1;z<n;z++){
                if(nums[i]+nums[j]+nums[k]+nums[z]==target){
m.add(Arrays.asList(nums[i],nums[j],nums[k],nums[z]));
                }
            }
        }
    }

}
return new ArrayList<>(m);

 */ //Better
        /*
        import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n-2;j++){
                 HashSet<Integer> seen = new HashSet<>();
for(int k=j+1;k<=n-1;k++){
    long fourth=(long)target-nums[i]-nums[j]-nums[k];
   if (seen.contains((int) fourth)) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], (int) fourth);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                    seen.add(nums[k]);
}
            }

        } return new ArrayList<>(set);
}
}

         */
       //Optimal
        /*
        import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        List<List<Integer>> result = new ArrayList<>();
        if(nums==null || nums.length<4){
            return result;
        }
        Arrays.sort(nums);
        for(int i=0;i<n;i++){

            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<n-2;j++){ int left=j+1; int right=n-1;
            if(j>i+1 && nums[j]==nums[j-1]){
                continue;
            }

            while (left<right) {
            long sum = (long)nums[i] + nums[j] + nums[right] + nums[left];
                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                    left++;
                    right--;

                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
                while (left < right && nums[right] == nums[right + 1]) {
                    right--;
                }


            }
    else if (sum>target) {
                   right--;
                }
                else{
                    left++;
                }
            }
        }

    }  return(long) result;
}
}
         */
    }
}

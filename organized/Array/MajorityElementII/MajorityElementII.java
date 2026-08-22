import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
         List<Integer> l=new ArrayList<>();
        int n=nums.length;
        int el1=0; int cnt1=0; int cnt2=0; int el2=0;
        for(int i=0;i<n;i++){
            
             if(nums[i]==el1){
                cnt1++;
            }
            else if(nums[i]==el2){
                cnt2++;
            }
           else if(cnt2==0 && nums[i]!=el1){
                el2=nums[i];
                cnt2=1;
            }
           else if(cnt1==0&& nums[i]!=el2){
                el1=nums[i];
                cnt1=1;
            }
          
            else{
                cnt1--;
                cnt2--;
            }
        }
        int cnt3=0; int cnt4=0;
        for(int i=0;i<n;i++){
            if(el1==nums[i]){
                cnt3++;
            }
            else if(el2==nums[i]){
                cnt4++;
            }
        }
if(cnt3>n/3){
    l.add(el1);
    
}
if(cnt4>n/3&& el2!=el1){
    l.add(el2);
}


        
       
        return l;
    }
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length; int n=nums2.length;
       int i=0; int j=0;
       int n1=(m+n);
       int ind2= n1/2;
       int ind1=(n1/2)-1;
       int cnt=0;
       int el1=-1; int el2=-1;
       while(i<m && j<n){
        if(nums1[i]<nums2[j]){
            if(cnt==ind1){
                el1=nums1[i];
            }
            if(cnt==ind2){
                el2=nums1[i];
            }
            cnt++; i++;
        }
        else{
            if(cnt==ind1){
                el1=nums2[j];
            }
            if(cnt==ind2){
                el2=nums2[j];
            }
            cnt++; j++;
        }
       }
       while(i<m){
        if(cnt==ind1){
                el1=nums1[i];
            }
            if(cnt==ind2){
                el2=nums1[i];
            }
            cnt++; i++;
       }
        while(j<n){
            if(cnt==ind1){
                el1=nums2[j];
            }
            if(cnt==ind2){
                el2=nums2[j];
            }
            cnt++; j++;
        }
        if(n1%2==1){
            return el2;
        }
        else{
            return (double)(el1+el2)/2.0;
        }
    }
}
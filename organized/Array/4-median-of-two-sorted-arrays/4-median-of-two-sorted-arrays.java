class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length; int n=nums2.length;
       int[] arr = new int[m + n];
        for(int i=0;i<m;i++){
           arr[i] = nums1[i];
        }
        for(int j=0;j<n;j++){
 arr[m + j] = nums2[j];
        }
           Arrays.sort(arr);
              int length = arr.length;
        if(arr.length % 2==0){
            int mid1 = length / 2 - 1;
            int mid2 = length / 2;
            return (double)(arr[mid1]+(arr[mid2]))/2.0;
        }
        else{
            int mid = length / 2;

            return arr[mid];
        }
        
    }
}
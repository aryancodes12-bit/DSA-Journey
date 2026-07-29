import java.util.ArrayList;

import java.util.TreeSet;

public class UnionSet {
    public ArrayList<Integer> unionArray(int[] nums1, int[] nums2) {
        TreeSet<Integer> t=new TreeSet<>();
for (int i =0;i<nums1.length;i++){
t.add(nums1[i]);
}
    for (int j =0;j< nums2.length;j++){
        t.add(nums2[j]);
}
        ArrayList<Integer> a=new ArrayList<>(t);
    return a;
    }

    public static void main(String[] args) {
        UnionSet u=new UnionSet();
        int []nums1={1, 2, 3, 4, 5};
        int [] nums2 ={1, 2, 7};
        System.out.println(u.unionArray(nums1,nums2));
    }
}

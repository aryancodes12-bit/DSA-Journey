class Solution {
    public static List<Integer> generateRow(int row){
        long ans=1;
        List<Integer> l=new ArrayList<>();
        l.add(1);
        for(int c=1;c<row;c++){
ans=ans*(row-c)/c;
l.add((int)ans);
        }
        return l;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(generateRow(i));
        }
        return ans;
    }
}
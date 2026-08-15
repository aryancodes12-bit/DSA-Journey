package Leetcode.Arrays;

public class BuyAndSellStock {
    public int stockBuySell(int[] arr, int n) {
 int minPrice=arr[0];
 int maxProfit=0;
 for (int i=1;i< n ;i++){
     if(arr[i]<minPrice){
         minPrice=arr[i];
     }
     int profit=arr[i]-minPrice;
     if(profit>maxProfit){
         maxProfit=profit;
     }
 }
 return maxProfit;
    }
}

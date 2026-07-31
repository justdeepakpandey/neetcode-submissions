class Solution {
    public int maxProfit(int[] prices) {
        int max=Integer.MIN_VALUE;
      
        for(int i=0;i<prices.length-1;i++){
              int profit=0;
            for(int j=i+1;j<prices.length;j++){
                profit=prices[j]-prices[i];
                  max=Math.max(profit,max);
            }
          
        }
        if(max<0){
            return 0;
        }

    return max;
    }
}

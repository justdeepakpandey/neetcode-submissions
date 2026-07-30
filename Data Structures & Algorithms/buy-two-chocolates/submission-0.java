class Solution {
    public int buyChoco(int[] prices, int money) {
        int sum=0;
        Arrays.sort(prices);
        for(int i=0;i<=1;i++){
            sum+=prices[i];
        }
            if(sum>money){
                return money;
            }
        
        return money-sum;
    }
}
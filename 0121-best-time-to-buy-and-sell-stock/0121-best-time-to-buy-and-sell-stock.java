class Solution {
    public int maxProfit(int[] prices) {
        // int maxprofit=0;
        // for(int i=0;i<prices.length-1;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         if(prices[i]<prices[j] && maxprofit<(prices[j]-prices[i])){
        //             maxprofit=prices[j]-prices[i];                    
        //         }
                
        //     }
            
        // }
        // return maxprofit;
        int min=prices[0];
        int profit=0;
        int n =prices.length;
        for(int i=1;i<n;i++){
            int cost=prices[i]-min;
            profit=Math.max(profit,cost);
            min=Math.min(min,prices[i]);
        }
        return profit;
        
    }
    
    
}
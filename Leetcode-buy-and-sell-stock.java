class Solution {
    public int maxProfit(int[] prices) {
        int maxcur=0;
        int maxsofar=0;
        for(int i=1;i<prices.length;i++)
        {
            maxcur=maxcur+prices[i]-prices[i-1];
            maxcur=Math.max(0,maxcur);
            maxsofar=Math.max(maxcur,maxsofar);
        }
        return maxsofar;    
    }
}

public class Profit {
    public int maxProfit(int[] prices) {
        int a= 0;
        int b=0;
        int c=0;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i]<prices[i+1]) {
                prices[i]=a;
            }
            else if(prices[i]>prices[i+1]) {
                prices[i+1]=a;
            }
        }
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i]==a) {
                b=i; 
            }
        }
        for (int i = b ; i < prices.length-1; i++) {
            if (prices[i]>prices[i+1]) {
                prices[i]=c;
            }
            else if(prices[i]<prices[i+1]) {
                prices[i+1]=c;
            }

        }
        return(c-a);
    }
}

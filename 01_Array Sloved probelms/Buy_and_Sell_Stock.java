public class Buy_and_Sell_Stock {

    public static void Stocks(int price[]) {
        
        int buyprice = Integer.MAX_VALUE;
        int profit;
        int c = 0;

        for (int i = 0; i < price.length; i++) {
            if (buyprice > price[i]) {
                buyprice = price[i];
            }
            profit =  price[i] - buyprice;

            if (profit > c) {
                c = profit;
            }
        }
        System.out.println("Max price is: " + c);
    }


    public static void main(String[] args) {
        int price[] = {7,6,4,3,1};
        Stocks(price);
    }
}
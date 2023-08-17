package Interview;

public class Main {
    public static void main(String[] args) {
        //int[] amazon_stock_value = {100, 107, 105, 108, 111, 106, 109};
        int[] amazon_stock_value = {100, 105, 103, 120, 111, 106, 129};
        int maxProfit = 0;
        int diff = 0;
        int count = 1;

        for(int i = 1; i < amazon_stock_value.length; i++){
            int value = amazon_stock_value[i];
            for (int e : amazon_stock_value){
                diff = e - value;
                if(diff > maxProfit){
                    maxProfit = diff;
                }
                count++;
            }
        }

        System.out.println(maxProfit);
    }
}

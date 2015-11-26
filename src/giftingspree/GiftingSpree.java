package giftingspree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GiftingSpree {
    /**
     * Given a budget and a list of item prices, determine the maximum number of
     * items that can be purchased. Prices that are smaller than or equal to 0
     * represent invalid items and should be ignored.
     * 
     * @param budget
     *            >= 0
     * @param priceList
     *            where entries less than or equal to 0 should be igmored
     * @return the maximum number of items that can be purchased
     */
    public static int getMaximumItems(double budget, List<Double> priceList) {
        // making a positive sorted list
        List<Double> positiveSortedList = new ArrayList<Double>();
        for (int i = 0; i < priceList.size(); i++) {
            if (priceList.get(i) > 0) {
                positiveSortedList.add(priceList.get(i));
            }
        }
        Collections.sort(positiveSortedList);

        int i = 0;
        int numOfGifts = 0;
        while (budget > 0 && i < positiveSortedList.size()) {
            if (positiveSortedList.get(i) <= budget) {
                budget -= positiveSortedList.get(i);
                numOfGifts++;
            }
            i++;
        }

        return numOfGifts;
    }
}
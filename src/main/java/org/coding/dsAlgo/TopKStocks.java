package org.coding.dsAlgo;

import java.util.ArrayList;
import java.util.List;

public class TopKStocks {

    List<Integer> stockIds;
    List<Integer> stockPrices;

    int size;

    TopKStocks() {
        stockIds = new ArrayList<>();
        stockPrices = new ArrayList<>();
        size = 0;
    }

    public void addStocks(int stockId, int stockPrice) {
        if(size==0) {
            stockIds.add(stockId);
            stockPrices.add(stockPrice);
        } else {
            int idx = stockIds.get(stockId);
            if(idx >=0) {
                int index = fidStockPosition(stockPrices, stockPrice);
                stockPrices.remove(idx);
                stockIds.remove(idx);
                if (index < 0)
                    index = -index - 1;

                stockIds.add(index, stockId);
                stockPrices.add(index, stockPrice);

            } else {
                int index = fidStockPosition(stockPrices, stockPrice);
                if (index < 0)
                    index = -index - 1;

                stockIds.add(index, stockId);
                stockPrices.add(index, stockPrice);
            }
        }
        size++;
    }

    public int fidStockPosition(List<Integer> stockPrices, int key) {
        int size =  stockPrices.size();
        int low = 0, high = size - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            if (mid == key){
                return mid;
            } else if (mid > key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -low -1;
    }

    public List<List<Integer>> topKStocks(int k) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < k; i++){
            List<Integer> topK = new ArrayList<>();
            topK.add(stockIds.get(i));
            topK.add(stockPrices.get(i));
            result.add(topK);
        }
        return result;
    }

    public static void main(String[] args) {

        TopKStocks leaderboard = new TopKStocks ();
        leaderboard.addStocks(1,73);   // leaderboard = [[1,73]];
        leaderboard.addStocks(2,56);   // leaderboard = [[1,73],[2,56]];
        leaderboard.addStocks(3,39);   // leaderboard = [[1,73],[2,56],[3,39]];
        leaderboard.addStocks(4,51);   // leaderboard = [[1,73],[2,56],[3,39],[4,51]];
        leaderboard.addStocks(5,4);    // leaderboard = [[1,73],[2,56],[3,39],[4,51],[5,4]];
        leaderboard.topKStocks(1);           // returns 73;
        leaderboard.addStocks(2,51);   // leaderboard = [[2,51],[3,39],[4,51],[5,4]];
        leaderboard.topKStocks(3);           // returns 141 = 51 + 51 + 39;
    }
}


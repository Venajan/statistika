package ru.netology.stats;

import java.util.Arrays;

public class StatsService {

    public int sumSales(long[] sales) {

        long sumAllMonth = Arrays.stream(sales).sum();

        return (int) sumAllMonth;

    }

    public double averSales(long[] sales) {

        double averSum = 0;
        double sumAllMonth = sumSales(sales);
        averSum = sumAllMonth / sales.length;

        return averSum;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int underAverSales(long[] sales) {
        int underAverMonth = 0;
        double averSum = averSales(sales);

        for (long i : sales) {
            if (i < averSum) {
                underAverMonth++;
            }
        }
        return underAverMonth;
    }

    public int overAverSales(long[] sales) {
        int overAverMonth = 0;
        double averSum = averSales(sales);

        for (long i : sales) {
            if (i > averSum) {
                overAverMonth++;
            }
        }
        return overAverMonth;
    }

}

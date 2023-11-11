package com.spring;

import java.util.HashMap;
import java.util.Map;

public class GoldRateInfo {
    private Map<Integer,Double> rateInfo = new HashMap<>();

    public GoldRateInfo(Map<Integer, Double> rateInfo) {
        this.rateInfo = rateInfo;
    }

    public  GoldRateInfo(){
        super();
    }
    public Map<Integer, Double> getRateInfo() {
        return rateInfo;
    }

    public void setRateInfo(Map<Integer, Double> rateInfo) {
        this.rateInfo = rateInfo;
    }

    public double calculateGoldRate(int goldCarat,double grams){
            double price = rateInfo.get(goldCarat)*grams;
                return price;
    }
}

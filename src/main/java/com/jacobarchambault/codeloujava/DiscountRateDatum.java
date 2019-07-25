package com.jacobarchambault.codeloujava;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import java.util.Date;

public class DiscountRateDatum {
    @CsvBindByName(column = "Date")
    @CsvDate
    private Date date;

    @CsvBindByName(column = "Discount Rate")
    private double discountRate;

    public DiscountRateDatum(Date date, double discountRate) {
        this.date = date;
        this.discountRate = discountRate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

}

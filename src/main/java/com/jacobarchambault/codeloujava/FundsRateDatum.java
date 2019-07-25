package com.jacobarchambault.codeloujava;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import java.util.Date;

public class FundsRateDatum {
    @CsvBindByName(column = "Date")
    @CsvDate
    private Date date;

    @CsvBindByName(column = "Federal Funds Rate")
    private double fundsRate;

    public FundsRateDatum(Date date, double fundsRate) {
        this.date = date;
        this.fundsRate = fundsRate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getFundsRate() {
        return fundsRate;
    }

    public void setFundsRate(double fundsRate) {
        this.fundsRate = fundsRate;
    }
}

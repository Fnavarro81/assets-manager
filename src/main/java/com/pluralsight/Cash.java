package com.pluralsight;

import java.math.BigDecimal;

public class Cash extends Asset{
    public Cash(String description, BigDecimal amount) {
        super(description, "N/A", amount);
    }

    @Override
    public BigDecimal getValue() {
        return getOriginalCost();
    }
}

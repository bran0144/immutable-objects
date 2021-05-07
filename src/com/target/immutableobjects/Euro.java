package com.target.immutableobjects;

import java.math.BigDecimal;

public class Euro extends Money {
    private String iso2country;

    public Euro(BigDecimal amount, Currency currency, String iso2country) {
        super(amount, currency);
        this.iso2country = iso2country;
    }
    @Override
    public boolean equals(Object other) {
        return other != null && other.getClass() == this.getClass() && this.equals((Euro)other);
    }
    private boolean equals(Euro other) {
        return super.equals(other) && this.iso2country.equals(other.iso2country);
    }
    @Override
    public int hashCode() {
        return super.hashCode() * 31 + this.iso2country.hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + " (" + this.iso2country + ")";
    }
}

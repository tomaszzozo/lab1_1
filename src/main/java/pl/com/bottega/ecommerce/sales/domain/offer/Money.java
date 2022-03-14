package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Money {
    private BigDecimal amount;
    private String currency;

    public Money(BigDecimal amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (amount == null ? 0 : amount.hashCode());
        return prime * result + (currency == null ? 0 : currency.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Money other = (Money) obj;
        if (amount == null && other.amount != null) {
            return false;
        } else if (!amount.equals(other.amount)) {
            return false;
        } else if (currency == null && other.currency != null) {
            return false;
        } else return currency.equals(other.currency);
    }
}

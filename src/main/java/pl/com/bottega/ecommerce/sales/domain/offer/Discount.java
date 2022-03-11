package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Discount {
    private String discountCause;
    private Money discount;

    public Discount(String discountCause, Money discount) {
        this.discount = discount;
        this.discountCause = discountCause;
    }

    public Money getDiscount() {
        return discount;
    }

    public String getDiscountCause() {
        return discountCause;
    }
}

package pl.com.bottega.ecommerce.sales.domain.offer;

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (discount == null ? 0 : discount.hashCode());
        return prime * result + (discountCause == null ? 0 : discountCause.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Discount other = (Discount) obj;
        if (discountCause == null && other.discountCause != null) {
            return false;
        } else if (!discountCause.equals(other.discountCause)) {
            return false;
        } else if (discount == null && other.discount != null) {
            return false;
        } else return discount.equals(other.discount);
    }
}

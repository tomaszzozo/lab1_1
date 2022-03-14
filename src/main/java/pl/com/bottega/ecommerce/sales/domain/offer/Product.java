package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.Date;

public class Product {
    private String productId;
    private Money productPrice;
    private String productName;
    private Date productSnapshotDate;
    private String productType;

    public Product(String productId, Money productPrice, String productName, Date productSnapshotDate, String productType) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productName = productName;
        this.productSnapshotDate = productSnapshotDate;
        this.productType = productType;
    }

    public String getProductType() {
        return productType;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductId() {
        return productId;
    }

    public Date getProductSnapshotDate() {
        return productSnapshotDate;
    }

    public Money getProductPrice() {
        return productPrice;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (productId == null ? 0 : productId.hashCode());
        result = prime * result + (productPrice == null ? 0 : productPrice.hashCode());
        result = prime * result + (productName == null ? 0 : productName.hashCode());
        return prime * result + (productType == null ? 0 : productType.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product other = (Product) obj;
        if (productId == null && other.productId != null) {
            return false;
        }  else if (!productId.equals(other.productId)) {
            return false;
        } else if (productName == null && other.productName != null) {
            return false;
        } else if (!productName.equals(other.productName)) {
            return false;
        } else if (productPrice == null && other.productPrice != null) {
            return false;
        } else if (!productPrice.equals(other.productPrice)) {
            return false;
        } else if (productType == null && other.productType != null) {
            return false;
        } else return productType.equals(other.productType);
    }
}

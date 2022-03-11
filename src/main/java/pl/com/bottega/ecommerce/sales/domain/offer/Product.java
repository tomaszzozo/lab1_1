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
}

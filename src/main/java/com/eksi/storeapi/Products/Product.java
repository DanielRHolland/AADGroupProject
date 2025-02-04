
package com.eksi.storeapi.Products;

import com.eksi.storeapi.Warning.Warning;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Products")
public class Product {
    @Id
    @Column(name = "product_id")
    private String id;
    private String name;
    private int quantity;
    @Column(name = "imageURL")
    private String imageUrl;
    @Column(name = "location_name")
    private String locationName;
    @Column(name = "expiry_date")
    private Long expiryDate;
    @Column(name = "cost_price")
    private Double costPrice;
    private String description;

    public Product() {}

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public Long getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Long expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Product(final String id) {
        this.id = id;
    }
}

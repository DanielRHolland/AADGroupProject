
package com.eksi.storeapi.datatypes;
//todo add setters, remove default values
public class ProductInformation {
 private String id;
 private String name = "default name";
 private String imageUrl = "https://someurl.something.some.com/someimage.jpg";
 private String locationName = "Stores";
// private List<Warning> warnings;
 private Long expiryDate = new Long(1609459200);// 01/01/2021 UTC 12:00am
 private Double costPrice = new Double(0.0);
 private String description = "Product description"; 

 public String getId(){return id;}
 public String getLocationName(){return locationName;}
// public List<Warning> getWarnings(){return warnings;}
 public Long getExpiryDate(){return expiryDate;}
 public Double getCostPrice(){return costPrice;}
 public String getDescription(){return description;}

 public ProductInformation(final String id) {
    this.id = id;
 }

}

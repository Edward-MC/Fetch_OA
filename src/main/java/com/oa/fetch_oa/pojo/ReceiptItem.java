package com.oa.fetch_oa.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Pattern;


public class ReceiptItem {

    @Pattern(regexp = "^[\\w\\s\\-]+$", message = "The receipt is invalid.")
    @JsonProperty("shortDescription")
    private String shortDescription;

    @Pattern(regexp = "^\\d+\\.\\d{2}$", message = "The receipt is invalid.")
    @JsonProperty("price")
    private String price;

    public ReceiptItem(String shortDescription, String price) {
        this.shortDescription = shortDescription;
        this.price = price;
    }

    public ReceiptItem() {
    }

    @Override
    public String toString() {
        return "ReceiptItem{" +
                "shortDescription='" + shortDescription + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getPrice() {
        return price;
    }
}

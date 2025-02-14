package com.oa.fetch_oa.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.util.List;


public class Receipt {

    @Pattern(regexp = "^[\\w\\s\\-&]+$", message = "The receipt is invalid.")
    @JsonProperty("retailer")
    private String retailer;

    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "The receipt is invalid.")
    @JsonProperty("purchaseDate")
    private String purchaseDate;

    @Pattern(regexp = "^(?:[01]\\d|2[0-3]):[0-5]\\d$", message = "The receipt is invalid.")
    @JsonProperty("purchaseTime")
    private String purchaseTime;  // 24 hour time

    @Valid
    @NotNull(message = "The receipt is invalid.")
    @NotEmpty(message = "The receipt is invalid.")
    @JsonProperty("items")
    private List<ReceiptItem> items;

    @Pattern(regexp = "^\\d+\\.\\d{2}$", message = "The receipt is invalid.")
    @JsonProperty("total")
    private String total;

    public Receipt(String retailer, String purchaseDate, String purchaseTime, List<ReceiptItem> items, String total) {
        this.retailer = retailer;
        this.purchaseDate = purchaseDate;
        this.purchaseTime = purchaseTime;
        this.items = items;
        this.total = total;
    }

    public Receipt() {
    }


    @Override
    public String toString() {
        return "Receipt{" +
                "retailer='" + retailer + '\'' +
                ", purchaseDate='" + purchaseDate + '\'' +
                ", purchaseTime='" + purchaseTime + '\'' +
                ", items=" + items.toString() +
                ", total='" + total + '\'' +
                '}';
    }

    public String getRetailer() {
        return retailer;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public String getPurchaseTime() {
        return purchaseTime;
    }

    public List<ReceiptItem> getItems() {
        return items;
    }

    public String getTotal() {
        return total;
    }
}

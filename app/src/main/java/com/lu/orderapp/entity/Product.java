package com.lu.orderapp.entity;

import java.io.Serializable;

/**
 * Created by lu on 10/15/17.
 */

public class Product implements Serializable {
    private static final long serialVersionUID = 8841865474501846960L;
    private String productId;       //商品编号
    private String productName;     //商品名称
    private String specification;   //规格型号
    private String supplier;        //供应商
    private double price;           //单价
    private String unit;            //单位
    private String category;        //分类
    private String subcategory;     //子类
    private double inventory;       //库存量

    public Product(){}
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public double getInventory() {
        return inventory;
    }

    public void setInventory(double inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", specification='" + specification + '\'' +
                ", supplier='" + supplier + '\'' +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                ", category='" + category + '\'' +
                ", subcategory='" + subcategory + '\'' +
                ", inventory=" + inventory +
                '}';
    }
}

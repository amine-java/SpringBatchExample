package com.mbh.products.modele;

public class Product {

  private String id;
  private String name;
  private String type;
  private double price;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Product [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + "]";
  }



}

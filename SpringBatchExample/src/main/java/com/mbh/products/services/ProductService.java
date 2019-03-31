package com.mbh.products.services;

import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

/**
 * ProductService: Service class
 * 
 * @author amineboufatah
 *
 */
public class ProductService implements InitializingBean {

  /** Product's types map **/
  private Map<String, String> productTypes;

  public String getProductType(String key) {
    return productTypes.get(key);
  }

  @PostConstruct
  public void init() {
    System.out.println("PostConstruct Called ");
  }

  public void afterPropertiesSet() throws Exception {
    Assert.notNull(productTypes, "The map must be provided");
  }

  public Map<String, String> getProductTypes() {
    return productTypes;
  }

  public void setProductTypes(Map<String, String> productTypes) {
    this.productTypes = productTypes;
  }

}

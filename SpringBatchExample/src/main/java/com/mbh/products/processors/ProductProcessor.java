package com.mbh.products.processors;

import org.springframework.batch.item.ItemProcessor;
import com.mbh.products.modele.Product;
import com.mbh.products.services.ProductService;

/**
 * ProductProcessor
 * 
 * @author amineboufatah
 *
 */
public class ProductProcessor implements ItemProcessor<Product, Product> {

  /** Product Service **/
  private ProductService productService;

  private static final String OTHER_TYPE = "Other";

  public Product process(Product item) throws Exception {
    String type = productService.getProductType(item.getType());
    item.setType(type != null ? type : OTHER_TYPE);
    return item;
  }

  public ProductService getProductService() {
    return productService;
  }

  public void setProductService(ProductService productService) {
    this.productService = productService;
  }

}

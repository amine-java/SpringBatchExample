package com.mbh.products.writer;

import org.springframework.batch.item.file.transform.LineAggregator;
import com.mbh.products.modele.Product;

/**
 * ProductLineAggregator: This class constructs the line to be printed.
 * 
 * @author amineboufatah
 *
 */
public class ProductLineAggregator implements LineAggregator<Product> {

  public String aggregate(Product item) {
    return String.join(";", item.getType(), item.getName(), String.valueOf(item.getPrice()));
  }

}

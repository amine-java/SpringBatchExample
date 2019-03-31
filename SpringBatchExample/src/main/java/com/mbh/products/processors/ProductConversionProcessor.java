/**
 * 
 */
package com.mbh.products.processors;

import org.springframework.batch.item.ItemProcessor;
import com.mbh.currency.services.ConvertCurrencyService;
import com.mbh.products.modele.Product;

/**
 * @author amineboufatah
 *
 */
public class ProductConversionProcessor implements ItemProcessor<Product, Product> {

  private ConvertCurrencyService converter;

  public Product process(Product item) throws Exception {
    double convertedAmount = converter.convert(item.getPrice());
    item.setPrice(convertedAmount);
    return item;
  }

  public ConvertCurrencyService getConverter() {
    return converter;
  }

  public void setConverter(ConvertCurrencyService converter) {
    this.converter = converter;
  }


}

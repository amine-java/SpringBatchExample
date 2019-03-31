/**
 * 
 */
package com.mbh.products.reader.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;
import com.mbh.products.modele.Product;

/**
 * @author amineboufatah
 *
 */
public class ProductConversionFieldSetMapper implements FieldSetMapper<Product> {

  public Product mapFieldSet(FieldSet fieldSet) throws BindException {
    Product product = new Product();
    product.setType(fieldSet.readString(0));
    product.setName(fieldSet.readString(1));
    product.setPrice(fieldSet.readDouble(2));
    return product;
  }

}

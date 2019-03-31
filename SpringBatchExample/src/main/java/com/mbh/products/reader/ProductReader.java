/**
 * 
 */
package com.mbh.products.reader;

import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineCallbackHandler;
import com.mbh.products.modele.Product;

/**
 * ProductReader
 * 
 * @author amineboufatah
 *
 */
public class ProductReader extends FlatFileItemReader<Product> {

  public ProductReader() {
    LineCallbackHandler lineCallbackHandler = new LineCallbackHandler() {

      public void handleLine(String line) {
        System.out.println("Line: " + line + " has been skipped");
      }

    };
    super.setSkippedLinesCallback(lineCallbackHandler);
  }
}

package com.mbh.products.writer;

import java.io.IOException;
import java.io.Writer;
import org.springframework.batch.item.file.FlatFileFooterCallback;
import org.springframework.batch.item.file.FlatFileHeaderCallback;
import org.springframework.batch.item.file.FlatFileItemWriter;
import com.mbh.products.modele.Product;

/**
 * ProductWriter: This class overrides the FlatFileItemWriter's footer and header
 * 
 * @author amineboufatah
 *
 */
public class ProductWriter extends FlatFileItemWriter<Product> {

  /** The Header **/
  private static final String HEADER = "==== BEGIN PRODUCTS ====";

  /** The Footer **/
  private static final String FOOTER = "==== END PRODUCTS ====";

  public ProductWriter() {
    super.setHeaderCallback(getProductHeader());
    // super.setFooterCallback(getProductFooter());
  }

  /**
   * Method that appends the footer
   * 
   * @return FlatFileFooterCallback
   */
  private FlatFileFooterCallback getProductFooter() {
    FlatFileFooterCallback footer = new FlatFileFooterCallback() {
      public void writeFooter(Writer writer) throws IOException {
        writer.write(FOOTER);
      }
    };
    return footer;
  }

  /**
   * Method that appends the header
   * 
   * @return FlatFileHeaderCallback
   */
  private FlatFileHeaderCallback getProductHeader() {
    FlatFileHeaderCallback header = new FlatFileHeaderCallback() {
      public void writeHeader(Writer writer) throws IOException {
        writer.write(HEADER);
      }
    };
    return header;
  }



}

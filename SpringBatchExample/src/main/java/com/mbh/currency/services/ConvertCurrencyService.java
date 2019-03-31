package com.mbh.currency.services;

/**
 * ConvertCurrencyService: Service interface allowing to convert from a currency to another
 * 
 * @author amineboufatah
 *
 */
public interface ConvertCurrencyService {

  /**
   * Method that converts an amount to another defined currency. Example:
   * ConvertUSDollarsToEuros.convert(18.0) returns 23.0
   * 
   * @param amount
   * @return the amount converted
   */
  public double convert(double amount);

}

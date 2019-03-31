package com.mbh.currency.services;

/**
 * DollarsToEurosConverter
 * 
 * @author amineboufatah
 *
 */
public class DollarsToEurosConverter implements ConvertCurrencyService {

  private static final double RATE = 1.3;

  public double convert(double amount) {
    return amount * RATE;
  }

}

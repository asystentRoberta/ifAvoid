package pl.com.bohdziewicz.CalculatorWithFactory.factory;

import pl.com.bohdziewicz.CalculatorWithFactory.factory.Operation;

public class Addition implements Operation {

  @Override
  public int apply(int a, int b) {

    return a + b;
  }
}

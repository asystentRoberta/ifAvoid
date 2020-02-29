package pl.com.bohdziewicz.CalculatorWithFactory.ruleEngine;

public interface Rule {

  boolean evaluete(Expression expression);

  Result getResult();
}

package pl.com.bohdziewicz.CalculatorWithFactory;

public interface Rule {

  boolean evaluete(Expression expression);

  Result getResult();
}

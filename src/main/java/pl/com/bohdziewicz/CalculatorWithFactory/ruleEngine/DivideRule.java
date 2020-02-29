package pl.com.bohdziewicz.CalculatorWithFactory.ruleEngine;

import pl.com.bohdziewicz.CalculatorWithFactory.enums.Operator;

public class DivideRule implements Rule {

  private int result;

  @Override
  public boolean evaluete(Expression expression) {

    boolean evalResult = false;
    if (expression.getOperator() == Operator.DIVIDE) {
      if (expression.getY() == 0)
        throw new IllegalArgumentException("Argument 'divisor' can't be zero.");
      this.result = expression.getX() / expression.getY();
      evalResult = true;
    }
    return evalResult;
  }

  @Override
  public Result getResult() {

    return new Result(result);
  }
}

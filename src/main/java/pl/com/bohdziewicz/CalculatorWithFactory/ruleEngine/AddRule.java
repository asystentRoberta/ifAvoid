package pl.com.bohdziewicz.CalculatorWithFactory.ruleEngine;

import pl.com.bohdziewicz.CalculatorWithFactory.enums.Operator;

public class AddRule implements Rule {

  private int result;

  @Override
  public boolean evaluete(Expression expression) {

    boolean evalResult = false;

    if (expression.getOperator() == Operator.ADD) {
      this.result = expression.getX() + expression.getY();
      evalResult = true;
    }

    return evalResult;
  }

  @Override
  public Result getResult() {

    return new Result(result);
  }
}

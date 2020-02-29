package pl.com.bohdziewicz.CalculatorWithFactory.ruleEngine;

import pl.com.bohdziewicz.CalculatorWithFactory.enums.Operator;

public class Expression {

  private Integer x;
  private Integer y;
  private Operator operator;

  public Expression(Integer x, Integer y, Operator operator) {
    this.x = x;
    this.y = y;
    this.operator = operator;
  }

  Operator getOperator() {

    return operator;
  }

  Integer getX() {

    return x;
  }

  Integer getY() {

    return y;
  }
}

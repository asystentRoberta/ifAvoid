package pl.com.bohdziewicz.CalculatorWithFactory;

class Expression {

  private Integer x;
  private Integer y;
  private Operator operator;

  Expression(Integer x, Integer y, Operator operator) {
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

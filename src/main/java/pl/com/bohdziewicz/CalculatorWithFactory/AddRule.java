package pl.com.bohdziewicz.CalculatorWithFactory;

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

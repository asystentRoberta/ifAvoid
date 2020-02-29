package pl.com.bohdziewicz.CalculatorWithFactory;

class Calculator {

  int calulateUsingFactory(int a, int b, String operator) {
    Operation targetOperation =
        OperatorFactory.getOperation(operator)
            .orElseThrow(() -> new IllegalArgumentException("Invalid " + "Operator"));
    return targetOperation.apply(a, b);
  }

  int calculate(int a, int b, Operator operator) {
    return operator.apply(a, b);
  }
}

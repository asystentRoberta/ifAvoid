package pl.com.bohdziewicz.CalculatorWithFactory;

import pl.com.bohdziewicz.CalculatorWithFactory.commapndPattern.Command;
import pl.com.bohdziewicz.CalculatorWithFactory.enums.Operator;
import pl.com.bohdziewicz.CalculatorWithFactory.factory.Operation;
import pl.com.bohdziewicz.CalculatorWithFactory.factory.OperatorFactory;

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

  int calculateWithCommand(Command command){
    return command.execute();
  }
}

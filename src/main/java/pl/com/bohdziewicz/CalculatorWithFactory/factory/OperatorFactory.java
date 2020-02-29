package pl.com.bohdziewicz.CalculatorWithFactory.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OperatorFactory {

  private static Map<String, Operation> operationMap = new HashMap<>();

  static {
    operationMap.put("add", new Addition());
    operationMap.put("substract", new Substraction());
    // and so on...
  }

  public static Optional<Operation> getOperation(String operator) {
    return Optional.ofNullable(operationMap.get(operator));
  }
}

package pl.com.bohdziewicz.CalculatorWithFactory;

import java.util.ArrayList;
import java.util.List;

class RuleEngine {

  private static List<Rule> rules = new ArrayList<>();

  static {
    rules.add(new AddRule());
    rules.add(new DivideRule());
  }

  Result process(Expression expression) {
    Rule rule =
        rules.stream()
            .filter(rule1 -> rule1.evaluete(expression))
            .findFirst()
            .orElseThrow(
                () -> new IllegalArgumentException("Expression does not matches any Rule"));
    return rule.getResult();
  }
}

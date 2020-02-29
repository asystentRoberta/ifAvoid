package pl.com.bohdziewicz.CalculatorWithFactory;

public class Main {

  public static void main(String[] args) {
    System.out.println(
        "This is a project for educational purposes. \nI have to repeat some \"KnowHow\".");

    Calculator calculator = new Calculator();

    System.out.println(
        "I wonder how many there are two add two\n... It' so hard to solve - let's use java, computers"
            + " and more...");
    System.out.println("\n\nUsing factory:");
    System.out.println(calculator.calulateUsingFactory(2, 2, "add"));
    System.out.println("And using Enum...");
    System.out.println(calculator.calculate(2, 2, Operator.ADD));
    System.out.println("And using command...");
    System.out.println(calculator.calculateWithCommand(new AddCommand(2, 2)));

    System.out.println("Not quite clear to me");
    Expression expression = new Expression(2,2, Operator.ADD);
    RuleEngine ruleEngine = new RuleEngine();
    Result result = ruleEngine.process(expression);
    System.out.println(result.getValue());
  }
}

package pl.com.bohdziewicz.CalculatorWithFactory;

public class Main {

  public static void main(String[] args) {
    System.out.println(
        "This is a project for educational purposes. \nI have to repeat some \"KnowHow\".");

    Calculator calculator = new Calculator();

    System.out.println(
        "I wonder how many there are two add two\n... It' so hard to solve - let's use java, computers"
            + " and more...");
    System.out.println(calculator.calulateUsingFactory(2, 2, "add"));
  }
}

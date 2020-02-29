package pl.com.bohdziewicz.CalculatorWithFactory;

public class AddCommand implements Command {

  private int a;
  private int b;

  AddCommand(int a, int b) {
    this.a = a;
    this.b = b;
  }

  @Override
  public Integer execute() {
    return a + b;
  }
}

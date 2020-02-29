package pl.com.bohdziewicz.CalculatorWithFactory;

public enum Operator {
  ADD {
    @Override
    public int apply(int a, int b) {
      return a + b;
    }
  },

  DIVIDE {
    @Override
    public int apply(int a, int b) {
      if (b != 0) {
        return a / b;
      } else {
        return 0;
      }
    }
  };

  public abstract int apply(int a, int b);
}

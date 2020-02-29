### This is a project for educational purposes.

Many times I have lot of "ifs" in project. On  [Baeldung's blog](https://www.baeldung.com/) I found fine article about avoiding "ifs".

You can read it [here.](https://www.baeldung.com/java-replace-if-statements) 

Check in this project how you can solve "if problem" in "calculator" case.

Consider this:
```java
public int calculate(int a, int b, String operator) {
    int result = Integer.MIN_VALUE;
 
    if ("add".equals(operator)) {
        result = a + b;
    } else if ("multiply".equals(operator)) {
        result = a * b;
    } else if ("divide".equals(operator)) {
        result = a / b;
    } else if ("subtract".equals(operator)) {
        result = a - b;
    }
    return result;
}
```

or this (using _switch_):

```java
public int calculateUsingSwitch(int a, int b, String operator) {
    switch (operator) {
    case "add":
        result = a + b;
        break;
    // other cases    
    }
    return result;
}
```

It is not the *best practice of programming* . Look at my project on how to solve this.

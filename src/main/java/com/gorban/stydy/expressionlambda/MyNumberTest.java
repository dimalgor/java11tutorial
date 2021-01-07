package com.gorban.stydy.expressionlambda;

public class MyNumberTest {
    public void testMyNumber(){
        MyNumber myNumber; // declare an interface reference

        // Here, the lambda expression is simply a constant expression.
        // When it is assigned to myNum, a class instance is
        // constructed in which the lamda expression implements
        // the geValue() method in MyNumber.
        myNumber = () -> 123.45;

        // Call getValue(), which is provided by the previously assigned
        // lambda expression.
        System.out.println("A fixed value: " + myNumber.getValue());

        // Here, a more complex expression is used.
        myNumber = () -> Math.random() * 100;

        //These call the lambda expression is the previous line.
        System.out.println("A random value: " + myNumber.getValue());
        System.out.println("Another random value: " + myNumber.getValue());

        // A lambda expression must be compatible with the method
        // defined by the functional interface. Therefore, this won't work:
        // myNym = () -> "123.03"; // Error:
    }

    public void testLambda2(){
        // a lambda expression which tests if a number is even.
        NumericTest isEven = (n) -> (n % 2) == 0;

        if (isEven.test(10)) System.out.println("10 is even");
        if (!isEven.test(9)) System.out.println("9 is not even");

        NumericTest isNonNeg = (n) -> n >= 0;

        if (isNonNeg.test(1)) System.out.println("1 is not negative");
        if (!isNonNeg.test(-1)) System.out.println("- 1 is negative");
    }
}

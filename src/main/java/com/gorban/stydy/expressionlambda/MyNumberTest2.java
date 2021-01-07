package com.gorban.stydy.expressionlambda;

public class MyNumberTest2 {
    public void test(){
        // lambda expression which specifies if d is a factor of n
        NumericTest2 isFactor = (n, d) -> n % d == 0;

        if (isFactor.test(10, 2)) System.out.println("2 is factor of 10");
        if (!isFactor.test(10,3)) System.out.println("3 is not a factor of 10");
    }
}

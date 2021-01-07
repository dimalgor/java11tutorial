package com.gorban.study.lambda.block;

public class BlockLambdaDemo {

    public void test(){
        NumericFunc numericFunc = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++){
                result *= i;
            }

            return result;
        };

        System.out.println("The factorial of 3 is: " + numericFunc.func(3));
        System.out.println("The factorial of 5 is: " + numericFunc.func(5));
    }

}

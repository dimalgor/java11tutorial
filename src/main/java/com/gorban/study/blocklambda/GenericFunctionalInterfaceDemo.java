package com.gorban.study.blocklambda;

public class GenericFunctionalInterfaceDemo {

    public void test(){
        SomeFunc<String> reverse = (str) -> {
            String result = "";

            for (int i = str.length() - 1; i >= 0; i--){
                result += str.charAt(i);
            }

            return result;
        };

        System.out.println("Reversed string of 'Lambda' is: '" + reverse.func("Lambda"));
        System.out.println("Reversed string of 'Expression' is: '" + reverse.func("Expression"));

        SomeFunc <Integer> factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++){
                result *= i;
            }

            return result;
        };

        System.out.println("Factorial of 3 is: " + factorial.func(3));
        System.out.println("Factorial of 5 is: " + factorial.func(5));
    }
}

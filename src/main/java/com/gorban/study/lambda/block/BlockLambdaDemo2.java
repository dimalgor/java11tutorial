package com.gorban.study.lambda.block;

public class BlockLambdaDemo2 {
    public void test(){
        StringFunc reverse = (str) -> {
            String result = "";

            for (int i = str.length() -1; i >= 0; i--){
                result += str.charAt(i);
            }

            return result;
        };

        System.out.println("Reversed string of 'Lambda' is: '" + reverse.func("Lambda"));
        System.out.println("Reversed string of 'Expression' is: '" + reverse.func("Expression"));
    }
}

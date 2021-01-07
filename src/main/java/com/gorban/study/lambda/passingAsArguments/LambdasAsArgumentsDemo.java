package com.gorban.study.lambda.passingAsArguments;

import com.gorban.study.lambda.block.StringFunc;

public class LambdasAsArgumentsDemo {
    // This method has a functional interface as the type of
    // its first parameter. Thus, it can be passed a reference to
    // any instance of that interface, including the instance created
    // by lambda expression.
    // The second parameter specifies the string to operate on.
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public void test(){
        String inString = "Lambdas add power to Java";
        String outStr;

        System.out.println("Here is an input string: '" + inString + "'");

        //Here is a simple expression lambda that uppercases a string
        // is passed to stringOp().
        outStr = stringOp((str) -> str.toUpperCase(), inString);
        System.out.println("The string is uppercased: '" + outStr + "'");

        // This passes a block lambda that removes spaces.
        outStr = stringOp((str) -> {
            String result = "";
                int i;

                for (i = 0; i < str.length(); i++){
                    if (str.charAt(i) != ' '){
                        result += str.charAt(i);
                    }
                }
            return result;
        }, inString);

        System.out.println("The string with spaces removed: " + outStr);

        // Of course, it is also possible to pass a StringFunc instance
        // created by and earleer lambda expression. Fore example,
        // after this declaration executes, reverse ferers to an
        // instance of StringFunc.
        StringFunc reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--){
                result += str.charAt(i);
            }
            return result;
        };

        // Now, reverse can be passed as the first parameter to stringOp()
        // since it refers to a StringFunc object.
        System.out.println("The string reversed: " + stringOp(reverse, inString));
    }
}

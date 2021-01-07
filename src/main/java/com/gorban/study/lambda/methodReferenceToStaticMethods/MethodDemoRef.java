package com.gorban.study.lambda.methodReferenceToStaticMethods;

import com.gorban.study.lambda.block.StringFunc;

public class MethodDemoRef {

    // This method has a functional interface as the type of
    // it's first parameter. Thus, it can be passed any instance
    // of that interface, including a method reference.
    static String stingOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public void test(){
        String inStr = "Lambdas add power to Java";
        String outStr;

        // Here, a method reference to strReverse is passed to stringOp().
        outStr = stingOp(MyStringOps::strReverse, inStr);

        System.out.println("Original string: " + inStr);
        System.out.println("String reserved: " + outStr);
    }
}

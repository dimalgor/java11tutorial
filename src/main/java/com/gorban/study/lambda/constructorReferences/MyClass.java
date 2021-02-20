package com.gorban.study.lambda.constructorReferences;

public class MyClass {
    private final int val;

    // This constructor takes an argument.
    public MyClass(int v) {
        val = v;
    }

    // This is default constructor.
    public MyClass(){
        val = 0;
    }

    // ...

    int getVal(){
        return val;
    }


}

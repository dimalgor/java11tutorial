package com.gorban.study.lambda.constructorReferencesGeneric;

public class MyClass <T> {
    private T val;

    // A constructor that takes an argument.
    public MyClass(T t){
        val = t;
    }

    // default constructor
    public MyClass(){}

    public T getVal() {
        return val;
    }
}

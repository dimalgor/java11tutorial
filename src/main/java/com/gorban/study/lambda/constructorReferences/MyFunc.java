package com.gorban.study.lambda.constructorReferences;

// MyFunc is a functional interface whose method returns
// a MyClass reference.
public interface MyFunc {
    MyClass func(int n);
}

package com.gorban.study.lambda.methodReferenceWithGenerics;

// Demonstrate a method reference to a generic method
// declared inside a non'generic class.

// A functional interface that operates on an array
// and a value, and returns as int result.
public interface MyFunc<T> {
    int func(T[] vals, T v);
}

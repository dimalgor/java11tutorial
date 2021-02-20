package com.gorban.study.lambda.constructorReferencesGeneric;

public interface MyFunc <T> {
    MyClass<T> func(T val);
}

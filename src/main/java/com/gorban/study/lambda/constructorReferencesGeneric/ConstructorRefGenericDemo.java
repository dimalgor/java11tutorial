package com.gorban.study.lambda.constructorReferencesGeneric;

public class ConstructorRefGenericDemo {
    public void test(){
        // Create a reference to the MyClass<T> constructor.
        MyFunc<Integer> myClassCons = T -> new MyClass<Integer>(T);

        // Create a reference to MyClass<T> via that constructor reference.
        MyClass<Integer> mc = myClassCons.func(100);

        // Use the instance of MyClass<T> just created.
        System.out.println("val in mc is " + mc.getVal());

    }
}

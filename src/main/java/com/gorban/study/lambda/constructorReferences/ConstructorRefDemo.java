package com.gorban.study.lambda.constructorReferences;

public class ConstructorRefDemo {
    public void test(){
        // Create a reference to the MyClass constructor.
        // Because func() in MyFunc takes an argiment, new
        // refers to the parameterized constructor in MyClass,
        // not the default constructor.
        MyFunc myClassCons = MyClass::new;

        // Create an instance of MyClass via that constructor reference.
        MyClass mc = myClassCons.func(100);

        // Use the instance of MyClass just created.
        System.out.println("mal in mc is " + mc.getVal());
    }
}

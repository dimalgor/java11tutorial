package com.gorban.stydy;

import com.gorban.study.lambda.methodReferenceToInstanceMethods.InstanceMethWithObjectRefDemo;
import com.gorban.study.lambda.methodReferenceToStaticMethods.MethodDemoRef;
import com.gorban.study.lambda.methodReferenceWithGenerics.GenericMethodRefDemo;

public class Main {
    public static void main(String args[]){
        // expression lambda
//        new MyNumberTest().testMyNumber();
//        new MyNumberTest().testLambda2();
//        new MyNumberTest2().test();

        // block lambda
//        new BlockLambdaDemo().test();
//        new BlockLambdaDemo2().test();

        // generic functional interface
//        new GenericFunctionalInterfaceDemo().test();

        // Lambda as argument
//        new LambdasAsArgumentsDemo().test();

        // Lambda exception
        /*try {
            new LambdaExceptionDemo().test();
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }*/

    // Lambda Expressions and Variable Capture
//        new VarCapture().test();

//    Method References to static methods
//        new MethodDemoRef().test();

        // Method reference to instance methods
//        new InstanceMethWithObjectRefDemo().test();

        // Method reference with generic
        new GenericMethodRefDemo().test();



    }
}

package com.gorban;

import com.gorban.study.lambda.constructorReferencesGeneric.ConstructorRefGenericDemo;
import com.gorban.study.streamapi.SimpleStreamForDebug;

public class Main {
    public static void main(String[] args){
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
//        new GenericMethodRefDemo().test();
//        new UseMethodRef().test();

        // Constructor Reference
//        new ConstructorRefDemo().test();

        // Constructor Reference Generic
//        new ConstructorRefGenericDemo().test();

        // Streams API
        SimpleStreamForDebug.checkStreamOfString();

    }
}

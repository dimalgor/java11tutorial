package com.gorban.stydy;

import com.gorban.study.blocklambda.BlockLambdaDemo;
import com.gorban.study.blocklambda.BlockLambdaDemo2;
import com.gorban.study.blocklambda.GenericFunctionalInterfaceDemo;
import com.gorban.study.blocklambda.LambdasAsArgumentsDemo;
import com.gorban.stydy.expressionlambda.MyNumberTest;
import com.gorban.stydy.expressionlambda.MyNumberTest2;

public class Main {
    public static void main(String args[]){
        // expression lambda
        /*new MyNumberTest().testMyNumber();
        new MyNumberTest().testLambda2();
        new MyNumberTest2().test();*/

        // block lambda
//        new BlockLambdaDemo().test();
//        new BlockLambdaDemo2().test();

        // generic functional interface
//        new GenericFunctionalInterfaceDemo().test();

        // Lambda as argument
        new LambdasAsArgumentsDemo().test();

    }
}

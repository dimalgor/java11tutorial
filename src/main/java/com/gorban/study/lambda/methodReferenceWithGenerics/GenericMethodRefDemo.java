package com.gorban.study.lambda.methodReferenceWithGenerics;

public class GenericMethodRefDemo {

    // This method has the MyFunc functional interface as the
    // type of it's first parameter. The other two parameters
    // receive an array and a value, both of type T.
    static <T> int myOp(MyFunc<T> f, T[] vals, T v){
        return f.func(vals, v);
    }

    public void test(){
        Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        String[] strs = {"One", "Two", "Three", "Two" };
        int count;

        count = myOp(MyArrayOps::<Integer>contMatching, vals, 4);
        System.out.println("vals contains " + count + " 4s");

        count = myOp(MyArrayOps::<String>contMatching, strs, "Two");
        System.out.println("strs contains " + count + "Twos");
    }
}

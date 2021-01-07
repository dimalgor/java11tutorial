package com.gorban.study.lambda.exceptions;

// Throw an Exception from lambda expression.

public interface DoubleNumericArrayFunc {
    double func(double[] n) throws EmptyArrayException;
}

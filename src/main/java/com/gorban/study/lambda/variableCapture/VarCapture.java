package com.gorban.study.lambda.variableCapture;

public class VarCapture {
    public void test(){
        // A local variable that can be captured.
        int num = 10;

        MyFunc lambda = (n) -> {
            // This use of num is OK. It does not modify num.

            // However, the following is illegal because it attempts
            // to modify the value of num.
//             num++;

            return num + n;
        };

        // The following line would also cause an error, because
        // it would remove the effectively final status from num.
//         num = 9;
    }
}

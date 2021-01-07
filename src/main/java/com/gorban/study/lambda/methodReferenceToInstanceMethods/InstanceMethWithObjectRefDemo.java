package com.gorban.study.lambda.methodReferenceToInstanceMethods;

public class InstanceMethWithObjectRefDemo {

    // A method that returns the number of occurrences
    // of an object for which some criteria, as specified by
    // the MyFunc parameter, is true.
    static <T> int counter (T[] vals, MyFunc<T> f, T v){
        int count = 0;

        for (int i=0; i < vals.length; i++){
            if(f.func(vals[i], v)) {
                count++;
            }
        }

        return count;
    }

    public void test(){
        int count;

        // Create an array of HighTemp objects.
        HighTemp[] weekDaysHighs = { new HighTemp(89), new HighTemp(82),
                                    new HighTemp(90), new HighTemp(89),
                                    new HighTemp(82), new HighTemp(91),
                                    new HighTemp(84), new HighTemp(83) };

        // Use counter () with arrays of class HighTemp.
        /// Notice that a reference to the instance method
        // sameTemp() is passed as second argument.
        count = counter(weekDaysHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println(count + " days had a high of 89");

        // Now, create and use another array of HighTem objects.
        HighTemp[] weekDayHigh2 = { new HighTemp(32), new HighTemp(12),
                                    new HighTemp(24), new HighTemp(19),
                                    new HighTemp(18), new HighTemp(12),
                                    new HighTemp(-1), new HighTemp(13) };

        count = counter(weekDayHigh2, HighTemp::sameTemp, new HighTemp(12));
        System.out.println(count + " days had a high of 12");

        // Now, use lessTanTemp() to find days when temperature was less
        // than a specified value.
        count = counter(weekDaysHighs, HighTemp::lessThanTemp, new HighTemp(89));
        System.out.println(count + " days had a high less than 89");

        count = counter(weekDayHigh2, HighTemp::lessThanTemp, new HighTemp(19) );
        System.out.println(count + " days had a high of less that 19");
    }
}
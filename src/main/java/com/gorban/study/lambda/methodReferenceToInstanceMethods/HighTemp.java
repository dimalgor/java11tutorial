package com.gorban.study.lambda.methodReferenceToInstanceMethods;

// A class that stores the temperature high for a day.
public class HighTemp {
    private final int hTemp;

    HighTemp(int hTemp){
        this.hTemp = hTemp;
    }

    // Return true if the invoking HighTemp object has the same
    // temperature as ht2.
    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    // Return true if the invoking HighTemp object has a temperature
    // that is less than th2.
    boolean lessThanTemp(HighTemp ht2){
        return hTemp < ht2.hTemp;
    }
}

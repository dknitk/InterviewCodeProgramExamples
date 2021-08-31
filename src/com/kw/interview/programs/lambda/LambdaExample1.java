package com.kw.interview.programs.lambda;

import java.util.Comparator;

/**
 * This class helps to contain various version of lambda function implementation.
 */
public class LambdaExample1 {

    public static void main(String[] args) {
        System.out.println("*** Lambda Function Example****");

        // Ashyn way
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.compareTo(t1);
            }
        };
        int comparison = stringComparator.compare("Hello", "World");
        System.out.println("*** comparison ****" + comparison);
        // Lambda Function way
        Comparator<String> stringComparatorLambda =
                (String o1, String o2) -> { return o1.compareTo(o2);};

        int comparisonLambda = stringComparatorLambda.compare("Hello", "World");
        System.out.println("*** comparisonLambda****" + comparisonLambda);

        // Lambda Function shortcut way
        Comparator<String> stringComparatorLambdaSrt =
                (o1, o2) -> o1.compareTo(o2);

        int comparisonLambdaSrt = stringComparatorLambdaSrt.compare("Hello", "World");
        System.out.println("*** comparisonLambdaSrt****" + comparisonLambdaSrt);

    }
}

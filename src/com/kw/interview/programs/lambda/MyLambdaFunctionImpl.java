package com.kw.interview.programs.lambda;

public class MyLambdaFunctionImpl {

    public static void main(String[] args){
        System.out.println("Lambda Function Example");
        MyLambdaFunction myLambdaFunction = () -> System.out.println("Lambda Function Example Impl");
        myLambdaFunction.apply();
    }
}

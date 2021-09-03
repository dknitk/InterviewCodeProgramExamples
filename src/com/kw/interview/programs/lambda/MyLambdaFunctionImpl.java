package com.kw.interview.programs.lambda;

public class MyLambdaFunctionImpl {

    public static void main(String[] args){
        System.out.println("Lambda Function Example");
        // MyLambdaFunction myLambdaFunction = () -> System.out.println("Lambda Function Example Impl");
        // MyLambdaFunction myLambdaFunction = text -> System.out.println(text);
        // MyLambdaFunction myLambdaFunction = (text1, text2) -> System.out.println(text1 + "" + text2);
        MyLambdaFunction myLambdaFunction = (text1, text2) -> {
            System.out.println(text1 + "" + text2);
            return text1 + " " + text2;
        };

        myLambdaFunction.apply("Hello Lambda Function,"," How are you?");
        System.out.println(myLambdaFunction.apply("Dharmendra","Sahu"));
    }
}

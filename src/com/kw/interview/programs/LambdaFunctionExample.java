public class LambdaFunctionExample {

    public static void main(String[] args) {

        GeneralFunction genericFunction = (x, y) -> {
            return x + y;

        };
        System.out.println("Sum::" + genericFunction.function(10,30));

        genericFunction = (x, y) -> x - y;
        System.out.println("Substraction::" + genericFunction.function(10,30));

        genericFunction = (x, y) -> x * y;
        System.out.println("Multiply::" + genericFunction.function(10,30));

        genericFunction = (x, y) -> x / y;
        System.out.println("Division::"+ genericFunction.function(10,30));

        genericFunction = (x, y) -> x % y;
        System.out.println("Modulo::"+ genericFunction.function(10,30));

        genericFunction = (x, y) -> (x*2)+(y*2);
        System.out.println("Double The Value and Add::"+ genericFunction.function(10,30));


        // Call Default and Static function from the interface
        genericFunction.display();
        genericFunction.message();
        genericFunction.toString();
        // Static Method
        GeneralFunction.messageString();
    }

}

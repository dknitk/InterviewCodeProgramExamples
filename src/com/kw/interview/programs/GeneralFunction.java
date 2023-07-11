
@FunctionalInterface
public interface GeneralFunction {
    long function(long a, long b);

    default void display(){

    }

    default void message(){
        System.out.println("Hello World!!!");
    }
    static void messageString(){
        System.out.println("Message as a string!!!");
    }
}

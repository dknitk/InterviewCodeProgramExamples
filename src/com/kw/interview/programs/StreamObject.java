import java.util.Arrays;
import java.util.stream.Stream;

public class StreamObject {

    public static void main(String[] args) {
        System.out.println("Stream Object Example");

        //Stream.empty();
        //Stream.of();
        Stream.ofNullable("");
        String[] names = {"Rajesh", "Durgesh", "Mohit", "Kumar"};

        Stream streamNames = Stream.of(names);
//        streamNames.forEach(e -> {
//            System.out.println(e);
//        });

        Arrays.stream(names).forEach(System.out::println);

        Arrays.stream(names).forEach(e -> System.out.println(e));

        // Stream.builder().build();

        // filter(Predicate)
        // map(Function)

        System.out.println(" MIN " +
                Arrays.stream(new int[]{100,33,22,44,12,13,56,32,22})
                        .min()
                        .getAsInt()
        );

        System.out.println(" MAX " +
                Arrays.stream(new int[]{100,33,22,44,12,13,56,32,22})
                        .max()
                        .getAsInt()
        );

    }
}

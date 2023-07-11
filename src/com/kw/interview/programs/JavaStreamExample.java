import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamExample {

    public static void main(String[] args) {
        System.out.println("My Stream Example!!");

        // Iterate Person Mock Data
        //getMockPerson().forEach(System.out::println);
        // Call Old Style Java
        System.out.println("Old Style Java::");
        oldStyleIteration();
        System.out.println("New Stream API :::");

        newStyleIteration();

        streams();
    }

    private static void oldStyleIteration(){

        int limit = 10;
        int counter = 0;
        List<Person> youngPersons = new ArrayList<>();
        for(Person person : getMockPerson()){
            if(person.getAge() <= 23){
                youngPersons.add(person);
                counter++;
                if(counter == limit){
                    break;
                }
            }

        }
        // Print List
        youngPersons.forEach(System.out::println);
    }

    private static void newStyleIteration(){
        List<Person> youngPersons = getMockPerson().stream().filter(person -> person.getAge()<=23).
                limit(10).collect(Collectors.toList());
        youngPersons.forEach(System.out::println);

    }

    private static void streams(){
        List<String> names = List.of("Amigoscode", "Alex", "Zera");

        Stream<String> stream = names.stream();

        stream.forEach(System.out::println);

        Stream<String> nameStream = Stream.of("Rajesh", "Kumar", "Pradeep");

        long count = nameStream.limit(3).map(str -> str + " ")
                .count();
        System.out.println("Count ::"+ count);

        //nameStream.forEach(System.out::println);

        String[] nameArray = {"A","B","C"};
        Arrays.stream(nameArray);


        IntStream.of(1,2,3,4,5,6,7,8,9,10).skip(3).forEach(System.out::print);

        System.out.println();
        Arrays.stream(new int[]{2,3,4,5}).map(x -> x*x).average().ifPresent(System.out::println);

        int[] intValue = {2,3,4,5,6};
        Arrays.stream(intValue).map(x -> x*x).average().ifPresent(System.out::println);

        List<String> nameList = Arrays.asList("Ram","Mphan","Gopal","Krishna","Zerus");

        nameList.stream()
                .map(x -> x.toLowerCase())
                .filter(x -> x.startsWith("z"))
                .forEach(System.out::println);

        nameList.stream()
                .map(x -> x + " Dash")
                .forEach(System.out::println);

    }


    private static List<Person> getMockPerson(){

        List<Person> persons = new ArrayList<>();
        Person person1 = new Person();
        person1.setId(1);
        person1.setName("Dharmendra");
        person1.setAge(37);
        persons.add(person1);

        Person person2 = new Person();
        person2.setId(2);
        person2.setName("Dharmendra_2");
        person2.setAge(23);
        persons.add(person2);

        Person person3 = new Person();
        person3.setId(3);
        person3.setName("Dharmendra_3");
        person3.setAge(34);
        persons.add(person3);

        Person person4 = new Person();
        person4.setId(4);
        person4.setName("Dharmendra_4");
        person4.setAge(12);
        persons.add(person4);

        Person person5 = new Person();
        person5.setId(5);
        person5.setName("Dharmendra_5");
        person5.setAge(32);
        persons.add(person5);

        return persons;
    }

}

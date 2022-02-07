import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.StringCharacterIterator;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class MainClass {

    public static void main(String[] args) throws IOException {
        Function<String, Integer> f = (s) -> {
            return s.length();
        };

        Predicate<String> p = s ->{
          return s.contains("t");
        };

        Supplier<Double> s = () ->{
            return Math.random();
        };

        Consumer<String> c = (cs) ->{
            System.out.println(cs);
        };

        BinaryOperator<String> bi = (s1,s2) -> {
           return new StringBuilder(s1).append(s2).toString();

        };




       List<String> strList =  Arrays.asList("test2", "balalalal", "dummies text");
       strList.stream().filter(p).forEach(c);

      /*  Path path = Files.writeString(Files.createFile(Path.of("test.txt")), "This was posted on JD");
        String svalue = Files.readString(Path.of("test.txt"));
        System.out.println(svalue);*/

        System.out.println(strList instanceof List);
    }

}

package company;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNegate extends Throwable{
    public static void main(String[] args) throws IOException {


        List<Character> list = Arrays.asList('y', 'o', 'g', 'e', 's', 'h');

        Predicate<Character> isEven = l -> l.equals('o');

        Predicate<Character> isOdd = isEven.negate();


        List<File> files = Files.list(Paths.get("/Users/ykumbhare"))
                .map(Path::toFile)
                .collect(Collectors.toList());

        files.forEach(System.out::println);


        for (Path path : Files.newDirectoryStream(Paths.get("/Users/ykumbhare"),
                path -> path.toFile().isFile())) {

            path = path.normalize();

            System.out.println(path.getFileName());
            List<Character> evenNumbers = list.stream()
                    .filter(isEven)
                    .collect(Collectors.toList());

            List<Character> oddNumbers = list.stream()
                    .filter(isOdd)
                    .collect(Collectors.toList());

           // System.out.println(evenNumbers);
           // System.out.println(oddNumbers);
        }
    }
}


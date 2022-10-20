package inlämningsuppgift2;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOUtil {

    public List<Person> readFromPath(Path path) {

        List<Person> list = new ArrayList<>();
        String firstRow = "";
        String secondRow = "";

        try(Scanner scanner = new Scanner(path)){

            while (scanner.hasNextLine()){
                firstRow = scanner.nextLine();
                secondRow = scanner.nextLine();

                String[] firstArray = firstRow.split(",");
                String[] secondArray = secondRow.split("-");

                Person person = new Person(
                        firstArray[0].trim(),
                        firstArray[1].trim(),
                        secondArray[0].trim(),
                        secondArray[1].trim(),
                        secondArray[2].trim());
                list.add(person);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return list;
    }
}

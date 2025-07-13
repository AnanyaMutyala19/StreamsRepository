import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringsInDescendingorder {
    public static void main(String[] args) {
        List<String> fruits=List.of("apple","banana","cherry","date");
       List<String> sortedorder=fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedorder);

    }
}

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,20,8,14,9,7);
        List<Integer> evenNums=nums.stream().filter(num->num%2==0).collect(Collectors.toList());
        System.out.println(evenNums);
        System.out.println(nums);
    }
}

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxElement {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,20,8,14,9,7);
        int max=nums.stream().distinct().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(max);
        System.out.println(nums);
    }
}

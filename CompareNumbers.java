import java.util.Arrays;
import java.util.Comparator;

public class CompareNumbers {

    private static Integer[] VALUES = { 5, 2, 1, 9, 50, 56 };

    public static void main(String[] args) {
        Arrays.sort(VALUES, new Comparator<Integer>() {

            public int compare(Integer lhs, Integer rhs) {
                String v1 = lhs.toString();
                String v2 = rhs.toString();
                int r = (v1 + v2).compareTo(v2 + v1) * -1;
                System.out.println("V1:"+v1+" V2:"+v2+" COMPARE"+r);
                return r;
            }
        });

        String result = "";
        for (Integer integer : VALUES) {
            result += integer.toString();
        }

        System.out.println("RESULT - "+result);
    }   
}    
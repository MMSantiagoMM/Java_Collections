import java.util.*;


public class Main2 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6,6565,34,32,432));

        numbers.sort(Integer::compareTo);
        System.out.println(numbers.reversed());

        Map<String,Integer> pwd = new HashMap<>(Map.of(
                "A",100021,"B",32123,"C",231321
        ));

        List<Map.Entry<String,Integer>> pwdMax = new ArrayList<>(pwd.entrySet());

        pwdMax.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));









    }

}

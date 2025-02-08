
import java.util.HashMap;
import java.util.TreeSet;

public class leetcode_2349 {

    private HashMap<Integer, Integer> indexToNumber;

    private HashMap<Integer, TreeSet<Integer>> numberToIndices;

    public leetcode_2349() {
        indexToNumber = new HashMap<>();
        numberToIndices = new HashMap<>();
    }

    public void change(int index, int number) {

        if (indexToNumber.containsKey(index)) {
            int oldNumber = indexToNumber.get(index);

            numberToIndices.get(oldNumber).remove(index);

            if (numberToIndices.get(oldNumber).isEmpty()) {
                numberToIndices.remove(oldNumber);
            }
        }

        indexToNumber.put(index, number);

        numberToIndices.putIfAbsent(number, new TreeSet<>());
        numberToIndices.get(number).add(index);
    }

    public int find(int number) {
        if (!numberToIndices.containsKey(number) || numberToIndices.get(number).isEmpty()) {
            return -1;
        }
        return numberToIndices.get(number).first();
    }

    public static void main(String[] args) {
        leetcode_2349 nc = new leetcode_2349();

        nc.change(1, 5);
        nc.change(2, 10);
        nc.change(2, 5);
        nc.change(3, 5);

        System.out.println(nc.find(5));
        nc.change(1, 10);
        System.out.println(nc.find(5));
    }
}

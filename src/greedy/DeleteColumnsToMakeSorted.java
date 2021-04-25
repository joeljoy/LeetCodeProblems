package greedy;

import java.util.HashSet;
import java.util.Set;

public class DeleteColumnsToMakeSorted {

    public int minDeletionSize(String[] strs) {
        Set<Integer> resultSet = new HashSet<>();
        String prevString = strs[0];
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                if (strs[i].charAt(j) < prevString.charAt(j)) {
                    resultSet.add(j);
                }
            }
            prevString = strs[i];
        }
        return resultSet.size();
    }

    public static void main(String[] args) {
        String[] strings1 = {"cba", "daf", "ghi"};
        String[] strings2 = {"a", "b"};
        String[] strings3 = {"zyx", "wvu", "tsr"};
        DeleteColumnsToMakeSorted sorted = new DeleteColumnsToMakeSorted();
        System.out.println(sorted.minDeletionSize(strings1));
        System.out.println(sorted.minDeletionSize(strings2));
        System.out.println(sorted.minDeletionSize(strings3));
    }
}

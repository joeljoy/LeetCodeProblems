package greedy;

import java.util.HashMap;
import java.util.Map;

public class LemonadeChange {

    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> wallet = new HashMap<>();
        wallet.put(5, 0);
        wallet.put(10, 0);
        wallet.put(20, 0);

        for (int bill : bills) {
            Integer currentChange = wallet.get(bill);
            switch (bill) {
                case 5: {
                    wallet.put(5, currentChange + 1);
                    break;
                }
                case 10: {
                    Integer change5 = wallet.get(5);
                    if (change5 > 0) {
                        wallet.put(10, currentChange + 1);
                        wallet.put(5, change5 - 1);
                    } else {
                        return false;
                    }
                    break;
                }
                case 20: {
                    Integer change10 = wallet.get(10);
                    Integer change5 = wallet.get(5);
                    if (change10 > 0) {
                        if (change5 > 0) {
                            wallet.put(20, currentChange + 1);
                            wallet.put(10, change10 - 1);
                            wallet.put(5, change5 - 1);
                        } else {
                            return false;
                        }
                    } else if (change5 > 2) {
                        wallet.put(20, currentChange + 1);
                        wallet.put(5, change5 - 3);
                    } else {
                        return false;
                    }
                    break;
                }
                default: {
                    throw new IllegalStateException("Unknown bill");
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {5, 5, 5, 10, 20};
        int[] b = {5, 5, 10};
        int[] c = {10, 10};
        int[] d = {5, 5, 10, 10, 20};

        LemonadeChange change = new LemonadeChange();
        System.out.println(change.lemonadeChange(a));
        System.out.println(change.lemonadeChange(b));
        System.out.println(change.lemonadeChange(c));
        System.out.println(change.lemonadeChange(d));
    }
}

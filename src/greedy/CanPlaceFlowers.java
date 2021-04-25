package greedy;

public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0, count = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
            i++;
        }
        return count >= n;
    }

    public static void main(String[] args) {
        int[] fb1 = {1, 0, 0, 0, 1};
        int[] fb2 = {1, 0, 0, 0, 1};
        int[] fb3 = {1, 0, 0, 0, 0, 1};
        CanPlaceFlowers flowers = new CanPlaceFlowers();
        System.out.println(flowers.canPlaceFlowers(fb1, 1));
        System.out.println(flowers.canPlaceFlowers(fb2, 2));
        System.out.println(flowers.canPlaceFlowers(fb3, 2));
    }
}

package greedy;

import java.util.Arrays;

public class AssignCookies {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gIndex = 0;
        int sIndex = 0;
        int result = 0;

        while (gIndex < g.length && sIndex < s.length) {
            if (g[gIndex] <= s[sIndex]) {
                gIndex++;
                sIndex++;
                result++;
            } else {
                sIndex++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        AssignCookies cookies = new AssignCookies();
        int[] g1 = {1,2,3};
        int[] s1 = {1,1};
        int[] g2 = {1,2};
        int[] s2 = {1,2,3};
        System.out.println(cookies.findContentChildren(g1,s1));
        System.out.println(cookies.findContentChildren(g2,s2));
    }
}

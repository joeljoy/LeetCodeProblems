package searching;

public class BadVersion {

    private int badVersion = 4;

    public void setBadVersion(int badVersion) {
        this.badVersion = badVersion;
    }

    public boolean isBadVersion(int version) {
        return version == badVersion;
    }

    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid) && !isBadVersion(mid - 1)) {
                return mid;
            } else if (!isBadVersion(mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BadVersion version = new BadVersion();
        version.setBadVersion(4);
        System.out.println(version.firstBadVersion(5));
        version.setBadVersion(1);
        System.out.println(version.firstBadVersion(1));
    }
}

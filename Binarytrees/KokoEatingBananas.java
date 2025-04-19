package Binarytrees;

public class KokoEatingBananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = getMax(piles);
        int result = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canFinish(piles, h, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    private static int getMax(int[] piles) {
        int max = piles[0];
        for (int pile : piles) {
            if (pile > max) {
                max = pile;
            }
        }
        return max;
    }

    private static boolean canFinish(int[] piles, int h, int k) {
        int time = 0;
        for (int pile : piles) {
            time += (pile + k - 1) / k; // ceiling division
        }
        return time <= h;
    }

    public static void main(String[] args) {
        int[] piles = {30, 11, 23, 4, 20};
        int h = 6;
        int result = minEatingSpeed(piles, h);
        System.out.println("Minimum eating speed: " + result);
    }
}

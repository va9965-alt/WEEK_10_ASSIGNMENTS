import java.util.Arrays;

class QUESTION3 {
    static String[] rotateRoster(String[] names, long k) {
        int n = names.length;
        int shift = (int) (k % n);
        reverse(names, 0, n - 1);
        reverse(names, 0, shift - 1);
        reverse(names, shift, n - 1);
        return names;
    }

    private static void reverse(String[] names, int left, int right) {
        while (left < right) {
            String temp = names[left];
            names[left] = names[right];
            names[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        String[] names = {"A", "B", "C", "D", "E"};
        long k = args.length > 0 ? Long.parseLong(args[0]) : 2;
        System.out.println(Arrays.toString(rotateRoster(names, k)));
    }
}

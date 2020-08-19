public class linearsearch {

    public static int linearsearch(int[] a, int x) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;

            }

        }
        return -1;

    }

    public static void main(String args[]) {
        int[] a = new int[]{5, 6, 8, 13, 14};
        int x = 10;
        int index = linearsearch(a, x);
        if (index == -1)
            System.out.println("No such number found");
        else
            System.out.println("Found at" + index);

    }
}
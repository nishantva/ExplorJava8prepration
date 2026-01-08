public class DuplicateFinder {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,1,4,6,6};
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int index = Math.abs(arr[i]);

            if (arr[index] < 0) {
                System.out.println(index);
            } else {
                arr[index] = -arr[index];
            }
        }
    }
}

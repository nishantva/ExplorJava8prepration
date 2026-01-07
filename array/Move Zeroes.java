public class MoveZeroesSimple {

    public static void moveZeroes(int[] nums) {
        int j = 0; // position for next non-zero

        // Move all non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // Fill remaining positions with zeros
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};//1,3,12,0,0
        moveZeroes(nums);

        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}

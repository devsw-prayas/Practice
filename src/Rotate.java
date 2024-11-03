public class Rotate {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is the target
            if (nums[mid] == target) {
                return mid;
            }

            // Determine which half is sorted
            if (nums[left] <= nums[mid]) {  // Left side is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;  // Target is in the left sorted portion
                } else {
                    left = mid + 1;   // Target is in the right unsorted portion
                }
            } else {  // Right side is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;   // Target is in the right sorted portion
                } else {
                    right = mid - 1;  // Target is in the left unsorted portion
                }
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        Rotate rotate = new Rotate();
        System.out.println(rotate.search(new int[]{4,5,6,7,0,1,2}, 0));
    }
}

package LeetCode;

public class RotatedSortArray_33 {
    public static void main(String[] args) {
        int arr[] ={4,5,6,7,0,1,2};
        System.out.println(search(arr,0));

    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (start+end)/2;

        while (start <= end) {
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[start] <= nums[end]) {
                if (nums[start] <= target && target <= nums[mid]) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[end])
                {       start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
            return -1;
        }
}

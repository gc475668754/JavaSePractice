package gc.algorithm;

import java.util.Arrays;
import java.util.Random;

public class RandomQuickSort {
    public static void main(String[] args) {
        int[] arr = {0,3,43,-3,4,1,-4,2,4,5,3,2,4,1,-4,50};
        RandomQuickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void RandomQuickSort(int[] nums) {
        sort(nums, 0, nums.length - 1);
    }

    public static void sort(int[] nums, int start, int end) {
        if (start >= end)
            return;
        int randomIdx = new Random().nextInt(end-start)+start;
        int temp = nums[randomIdx];
        nums[randomIdx] = nums[start];
        nums[start] = temp;

        int base = nums[start];
        int i = start;
        int j = end;
        while (i < j) { //不可有等号
            while (j > i && nums[j] >= base) //必须从右边（基数的对面）开始
                j--;
            while (i < j && nums[i] <= base)
                i++;
            swap(nums, i, j);
        }
        swap(nums, start, i);
        sort(nums, start, i-1);
        sort(nums, i + 1, end);

    }

    static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
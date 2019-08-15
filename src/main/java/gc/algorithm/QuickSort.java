package gc.algorithm;

public class QuickSort {
    public static void main(String[] args) {

    }
    public static void quickSort(int[] nums){
        sort(nums,0,nums.length-1);
    }

    public static void sort(int[] nums, int start, int end){
        if(start>=end)
            return ;
        int base = nums[start];
        int i = start;
        int j = end;
        while(i<j){ //不可有等号
            while(j>i && nums[j]>=base)
                j--;
            while(i<j && nums[i]<=base)
                i++;
            swap(nums,i,j);
        }
        swap(nums,start,i);
        sort(nums,start,i);
        sort(nums,i+1,end);

    }
    static void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
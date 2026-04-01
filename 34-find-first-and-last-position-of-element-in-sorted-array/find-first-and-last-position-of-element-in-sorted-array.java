class Solution {
    public int[] searchRange(int[] nums, int target) {
       int first = findstart(nums,target);
       int last = findLast(nums,target);
       return new int[]{first, last};
    }
    public static int findstart(int[] nums,int target){
        int start =0, end = nums.length -1,ans =-1;
        while(start<= end){
            int mid = start+(end-start)/2;
            if(nums[mid]== target){
                ans = mid;
                end = mid-1;
            }else if(nums[mid]< target){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }

        return ans;
    }
    public static int findLast(int[] nums,int target){
        int start = 0, end = nums.length-1, ans=  -1;
        while(start<= end){
            int mid = start+(end-start)/2;
            if(nums[mid]== target){
                ans = mid;
                start = mid+1;
            }else if(nums[mid]< target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }

}
import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) 
    {
        int [] results = new int[2];    
        int l = 0, r = nums.length - 1;
        
        for(int i = 0; i < nums.length; i++)
        {
            if (nums[l] + nums[r] == target)
            {
                results[0] = l;
                results[1] = r;
            }
            else if(target > nums[l] + nums[r])
            {
                r--;
            }else{
                l++;
            }
        }
        return results;
    }
}

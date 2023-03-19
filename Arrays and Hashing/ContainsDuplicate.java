import java.util.HashSet;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) 
    {
       HashSet<Integer> set = new HashSet<>();
       for(int num : nums)
       {
           if(set.contains(num))
            {
               return true;
            }
            else{
                set.add(num);
            }
       }
       
    return false;}
}
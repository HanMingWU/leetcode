/**
 * leetcode 第一题
 * 两数之和
 */

public class twoSum {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int nums[] = {3,3};
        int target =6;
        int[] twoSum=solution.twoSum(nums,target);
        for (int i:twoSum)
        {
            System.out.println(i);
        }
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
            int f1=0;
            int f2=0;
            for (int i=0;i<nums.length;i++)
            {
                for (int j=i+1;j<nums.length;j++)
                {
                    if (target==nums[i]+nums[j])
                    {
                        f1=i;
                        f2=j;
                        break;
                    }
                }
            }

            int[] num=new int[2];
            num[0]=f1;
            num[1]=f2;
            return num;

    }
}
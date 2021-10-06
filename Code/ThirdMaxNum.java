/**
 * @ClassName:	ThirdNum
 * @Description:	给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
 * @author:	Sirius
 * @date:	2021年10月6日 下午7:28:04
 * @Copyright:
 */
package leetcode.sirius.oct;

import java.util.Arrays;

public class ThirdMaxNum {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 6, 2, 2, 3, 1 };//输入数组

		Solution solve = new Solution();

		System.out.println(solve.thirdMax(arr));
	}

}

class Solution {
	public int thirdMax(int[] nums) {
		Arrays.sort(nums);//先排序
		int flag = 1;
		int Max = nums[nums.length - 1];//初始化为最大值
		for (int i = nums.length - 1; i >= 1; i--) {//从后往前遍历
			if (nums[i] > nums[i - 1]) {
				flag++;
			}
			if (flag == 3) {//遇到第三大的数结束循环
				Max = nums[i - 1];
				break;
			}
		}
		return Max;//若没有第三大的数，则返回Max初始化时候得到的最大值
	}
}

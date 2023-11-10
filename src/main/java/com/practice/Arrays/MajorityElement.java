package com.practice.Arrays;

/**
 * @author salman.iraqui
 *
 */

/*
 * https://leetcode.com/problems/majority-element/description/
 */

public class MajorityElement {
	public int majorityElement(int[] nums) {
        int count = 0, throne = 0;
        for(int num : nums) {
            if(count == 0){
                throne = num;
                count++;
            } else if(throne == num)
                count++;
            else 
                count--;
        }
        int freq = 0;
        for(int i=0; i<nums.length;i++) { 
            if(nums[i] == throne)
                freq++;
        }
        if(freq > nums.length/2)
            return throne;
        return -1;
    }
}

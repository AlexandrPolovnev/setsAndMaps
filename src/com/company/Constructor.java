package com.company;

import java.util.List;

public class Constructor {
    List<Integer> nums;

    public Constructor(List<Integer> nums){
        this.nums = nums;
    }

    public List<Integer> getNums(){
        return nums;
    }

    public void setNums(List<Integer> nums) {
        this.nums = nums;
    }
}

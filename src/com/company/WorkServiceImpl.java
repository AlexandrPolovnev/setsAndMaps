package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class WorkServiceImpl implements WorkService{

    public void oddNumbers(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i)%2 != 0) {
                System.out.print(nums.get(i) + " - нечетное число ");
            }
        }
        System.out.println();
    }

    public void evenNumbers(List<Integer> nums) {
        List<Integer> nums1 = new ArrayList<>(new HashSet<>(nums));
        Collections.sort(nums1);
        for (int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i)%2 == 0) {
                System.out.print(nums1.get(i) + " - четное число ");
            }
        }
        System.out.println();
    }

    public void uniqueWords(List<String> words){
        List<String> uniqueWords = new ArrayList<>(new HashSet<>(words));
        System.out.println(uniqueWords);
    }

    public void doubleWords(List<String> words){
        List<String> uniqueWords1 = new ArrayList<>(new HashSet<>(words));
        System.out.println(words.size()-uniqueWords1.size());
    }
}

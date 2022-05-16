package com.company;

import java.util.List;


public class Main {

    public static void main(String[] args) {
        WorkServiceImpl workService = new WorkServiceImpl();

        List<Integer> nums = (List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = (List.of("Zenit", "Zenit", "Spartak", "CSKA","CSKA","Dinamo","Dinamo"));

        workService.oddNumbers(nums);
        workService.evenNumbers(nums);
        workService.uniqueWords(words);
        workService.doubleWords(words);
    }


}

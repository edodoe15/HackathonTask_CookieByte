package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> codeList1 = Arrays.asList("apple", "apple", "banana", "anything", "banana");
        List<String> shoppingCart1 = Arrays.asList("orange", "apple", "apple", "banana", "orange", "banana");
        int output1 = Foo.isBuyerWinner(codeList1, shoppingCart1);
        System.out.println("Output 1: " + output1);

        List<String> codeList2 = Arrays.asList("apple", "apple", "banana", "anything", "banana");
        List<String> shoppingCart2 = Arrays.asList("banana", "orange", "banana", "apple", "apple");
        int output2 = Foo.isBuyerWinner(codeList2, shoppingCart2);
        System.out.println("Output 2: " + output2);

        List<String> codeList3 = Arrays.asList("apple", "apple", "banana", "anything", "banana");
        List<String> shoppingCart3 = Arrays.asList("banana", "apple", "banana", "orange", "banana");
        int output3 = Foo.isBuyerWinner(codeList3, shoppingCart3);
        System.out.println("Output 3: " + output3);
    }
}
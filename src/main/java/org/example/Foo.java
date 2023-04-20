package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Foo {
    public static int isBuyerWinner(List<String>codeList, List<String> shoppingCart) {

        List<List<String>> codeList2 = new ArrayList<>();
        for (String word : codeList) {
            List<String> codeList3 = Arrays.asList(word.split(" "));
            codeList2.add(codeList3);
        }

        int i = 0;
        int j = 0;

        while (i < codeList2.size() && j + codeList2.get(i).size() <= shoppingCart.size()) {
            boolean valid = true;
            for (int k = 0; k < codeList2.get(i).size(); k++) {
                if (!codeList2.get(i).get(k).equals("anything") && !codeList2.get(i).get(k).equals(shoppingCart.get(j + k))) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                j += codeList2.get(i).size();
                i++;
            } else {
                j++;
            }
        }

        if (i == codeList2.size())
            return 1;
        else
            return 0;
    }
}


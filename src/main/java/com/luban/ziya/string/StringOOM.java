package com.luban.ziya.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By ziya
 * 2020/7/29
 *
 * -Xms1m -Xmx1m
 */
public class StringOOM {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        while (true) {
            list.add("jskldfjsdlkjsdgklsjgksdlgjdsklgjalgjka");
        }
    }
}

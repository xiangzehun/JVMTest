package com.luban.ziya.string;

/**
 * Created By ziya
 * 2020/7/27
 *
 */
public class TestString_HashCode {

    public static void main(String[] args) {
        char c3 = (char) 3;
        char c4 = (char) 4;
        String[] strs = {  c3 + "" + c4, "a" };
        for(String s: strs) {
            System.out.printf("\"%s\": %d\n", s, s.hashCode());
        }
    }
}

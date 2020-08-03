package com.luban.ziya.string;

/**
 * Created By ziya
 * 2020/7/27
 *
 *
 */
public class TestString_4 {

    public static void main(String[] args) {

    }

    public static void test1() {
        String s1 = new String("hizifu");

        System.out.println(s1.hashCode());

        String s2 = new String("hi");

        System.out.println(s2.hashCode());
    }

    public static void test2() {
        String s1 = "h" + "i";

        System.out.println(s1.hashCode());

        String s2 = new String("hi");

        System.out.println(s2.hashCode());
    }
}

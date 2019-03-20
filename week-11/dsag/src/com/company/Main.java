package com.company;

import java.util.*;

public class Main extends AbstractClass{

    public static void methodTwo(int i) {
        i++;
    }

    public static void main(String[] args) {
        int x = 1;
        methodTwo(x);
        System.out.println(x);

        Object o = true ? new Double(1) : new Float(1);
        System.out.println(o.getClass());
        Object o2 = true ? "s" : new Character('a');
        System.out.println(o2.getClass());
        Object o3 = true ? new Float(1) : new Integer(1);
        System.out.println(o3.getClass());
        Object o4 = true ? 'a' : new Float(1);
        System.out.println(o4.getClass());

        Integer a = 1000, b = 1000;
        System.out.println(a == b);

        Integer c = 128, d = 128;
        System.out.println(c == d);

        String s = "s";
        String s2 = "s";
        System.out.println(s == s2);


        List<Integer> safr = new ArrayList<>();
        safr.add(2);

        HashMap<String, List<Integer>> map = new HashMap<>();
        map.put("asf", safr);


        Bar bar = new Bar();

//        try{
//            Scanner input = new Scanner(System.in);
//            int next = input.nextInt();
//
////            Float n = next/0;
//            Float n2 = 1.0F/0;
//        }
//        catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        foo2(new int[10][10][10][10]);

    }

    @Override
    public int[][][][][][][][][][][][] foo(int[] arg) {
        return new int[0][][][][][][][][][][][];
    }

    public static int[][][][] foo2(int[][][][] arg) {
        arg[3][3][3][3] = 3;
                    System.out.println(arg[3][3][3][3]);
                    System.out.println(arg[4][4][4][4]);
        return new int[0][][][];
    }
}

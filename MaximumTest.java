package com.DayOne;

public class MaximumTest <T extends Comparable<T>> {
    T x,y,z;
    public MaximumTest(){

    }
    public MaximumTest(T x, T y, T z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public T maximum(){
        return maximum(x,y,z);
    }

    private T maximum(T x, T y, T z) {
        T max = x;
        if(y.compareTo(max)>0)
            max=y;
        if (z.compareTo(max)>0)
            max=z;

        return max;
    }

    public static String testMaximum(String str1, String str2, String str3){
        String max = str1;
        if (str2.compareTo(max)>0)
            max=str2;
        if (str3.compareTo(max)>0)
            max=str3;

        return max;
    }

    public static void main(String[] args) {
        System.out.println(new MaximumTest(1,60,40).maximum());
        System.out.println(new MaximumTest().testMaximum("apple","lemon","peach"));
    }
}

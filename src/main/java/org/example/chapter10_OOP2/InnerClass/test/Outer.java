package org.example.chapter10_OOP2.InnerClass.test;

public class Outer {
    private int a = 10;

    public int get(){
        return a;
    }
    class Inner{
        Outer outer = new Outer();
        private int a = 20;
        public void show(){
            int a = 30;
            System.out.println(outer.a);
            System.out.println(get());
            System.out.println(this.a);
            System.out.println(a);
        }
    }

}

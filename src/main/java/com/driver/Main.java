package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        //'name' has private access in 'com.driver.RWOnly'
        //obj.name("Rahul");
        //System.out.println(obj.name);

        obj.setName("Rahul");
        System.out.println(obj.getName());
    }
  
}
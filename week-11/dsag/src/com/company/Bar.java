package com.company;

public class Bar extends Foo {

  String name;

  @Override
  public void doSomething() {
    System.out.println("yolo");
    name = "sadg";
    Zoom zoom = new Zoom(this);
    System.out.println(zoom.toString());
    System.out.println(zoom.name);
  }
}

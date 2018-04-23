package com.practice.java.design_patterns.LSP;

public class Main {
  static void userIt(Rectangle rectangle) {
    int width = rectangle.getWidth();
    rectangle.setHeight(10);
    System.out.println("Expected area of " + (width * 10)
            + " , got " + rectangle.getArea());
  }

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(2, 3);
    userIt(rectangle);
    Square square = new Square();
    square.setWidth(5);
    userIt(square);
  }
}

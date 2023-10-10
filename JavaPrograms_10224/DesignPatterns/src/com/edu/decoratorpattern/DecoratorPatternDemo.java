package com.edu.decoratorpattern;

public class DecoratorPatternDemo {
   public static void main(String[] args) {

      Shape circle = new Circle();	//Normal circle
      Shape redCircle = new RedShapeDecorator(new Circle());	//New circle with red border
      Shape redRectangle = new RedShapeDecorator(new Rectangle());	//New Rectangle with red border
  
      System.out.println("Circle with normal border");
      circle.draw();

      System.out.println("\nCircle of red border");
      redCircle.draw();

      System.out.println("\nRectangle of red border");
      redRectangle.draw();
   }
}

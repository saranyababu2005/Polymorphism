package main.java.polymorphism;

public class Area {
    public void area(int length,int breadth)
    {
        System.out.println("Area of rectangle is "+length*breadth);
    }
    public void area(int side)
    {
        System.out.println("Area of square is "+side*side);
    }
}

package org.example;

public class Circle extends Shape
{
    public double r;

    @Override
    public String nameYourself()
    {
        return "Circle";
    }

    @Override
    public double area()
    {
        return Math.PI * r * r;
    }

    @Override
    public double perimeter()
    {
        return 2 * Math.PI * r;
    }
}

package org.example;

public class Hexagon extends Shape
{
    public double a;

    @Override
    public String nameYourself()
    {
        return "Hexagon";
    }

    @Override
    public double area()
    {
        return a * a * Math.sqrt(3) / 4 * 6;
    }

    @Override
    public double perimeter()
    {
        return 6 * a;
    }
}

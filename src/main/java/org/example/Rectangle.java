package org.example;

public class Rectangle extends Tetragon
{
    public double a;
    public double b;

    @Override
    public String nameYourself()
    {
        return "Rectangle";
    }

    @Override
    public double area()
    {
        return a * b;
    }

    @Override
    public double perimeter()
    {
        return a + a + b + b;
    }
}

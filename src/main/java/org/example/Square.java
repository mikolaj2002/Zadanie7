package org.example;

public class Square extends Tetragon
{
    public double a;

    @Override
    public String nameYourself()
    {
        return "Square";
    }

    @Override
    public double area()
    {
        return a * a;
    }

    @Override
    public double perimeter()
    {
        return 4 * a;
    }
}

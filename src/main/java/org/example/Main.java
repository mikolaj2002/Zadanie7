package org.example;

import java.util.ArrayList;

public class Main
{
    public static void main(final String[] args)
    {
        ArrayList<Shape> shapes = new ArrayList<>();

        Hexagon h = new Hexagon();
        h.a = 5;

        Square s = new Square();
        s.a = 4;

        Rectangle r = new Rectangle();
        r.a = 2;
        r.b = 3;

        Circle c = new Circle();
        c.r = 1;

        shapes.add(h);
        shapes.add(s);
        shapes.add(r);
        shapes.add(c);

        for (Shape shape : shapes)
        {
            System.out.println(shape.nameYourself() + ", area: "
                    + shape.area() + ", perimeter: " + shape.perimeter());
        }
    }

}

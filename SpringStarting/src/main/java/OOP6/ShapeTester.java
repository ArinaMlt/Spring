package OOP6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.*;

public class ShapeTester {

    public static final String LINE = "------------------------------";
    public static void main(String[]args){

        /**
         * Spring code
         */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        triangle ABC1 =context.getBean("ABC",triangle.class);
        triangle EFK1 =context.getBean("EFK",triangle.class);
        triangle ABD1 =context.getBean("ABD",triangle.class);


        System.out.println(LINE);

        System.out.printf("Треугольник ABC: %n%s\n", ABC1.toString());
        System.out.printf("ABC равен ABD: %b\n",ABC1.equals(ABD1));
        System.out.printf("ABC равен EFK: %b\n",ABC1.equals(EFK1));
        System.out.printf("Площадь АВС: %f\n",ABC1.getArea());
        System.out.printf("Периметр АВС: %f\n",ABC1.getPerimetr());

        System.out.println(LINE);

        /**
         * here is old code
         */
        StdDraw.setXscale(-3,3);
        StdDraw.setYscale(-3,3);

        point2d A = new point2d(3, 0);
        point2d B = new point2d(0, 0);
        point2d C = new point2d(0, 3);
        point2d D = new point2d(1, 1);

        triangle ABC = new triangle(A, B, C);
        triangle EFK = new triangle (ABC);
        triangle ABD = new triangle(A, B, D);

        System.out.printf("Треугольник ABC: %n%s\n", ABC.toString());
        System.out.printf("ABC равен ABD: %b\n",ABC.equals(ABD));
        System.out.printf("ABC равен EFK: %b\n",ABC.equals(EFK));
        System.out.printf("Площадь АВС: %f\n",ABC.getArea());
        System.out.printf("Периметр АВС: %f\n",ABC.getPerimetr());

        ABC.setBackgroundColor(Color.pink);
        ABC.setColor(Color.black);

        ABC.turn(45);
        ABC.move (-1, -2);

        ABC.draw();

        StdDraw.setPenRadius(0.03);


        ABC.getCenter().draw();

    }
}

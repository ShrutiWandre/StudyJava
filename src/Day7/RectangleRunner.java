package Day7;


public class RectangleRunner {

    public static void main(String[] args) {

        RectangleDemo rectangleDemo = new RectangleDemo(5,6);

        /*int rectArea = rectangleDemo.rectangleArea();
        System.out.println("Area of Rectangle --> " + rectArea);

        int rectPerimeter = rectangleDemo.rectanglePerimeter();
        System.out.println("Perimeter of Rectangle --> " + rectPerimeter); */

        System.out.println(rectangleDemo);

        rectangleDemo.setLength(12);
        rectangleDemo.setWidth(15);
        System.out.println(rectangleDemo);

    }

}

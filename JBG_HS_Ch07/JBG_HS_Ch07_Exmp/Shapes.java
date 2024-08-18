/**
 * File: Shapes.java
 * 
 * Purpose: A simple class hierarchy.
 * 
 */
/*
 * Purpose: A class for two-dimensional objects.
 */
class TwoDShape {
    double width;
    double height;

    /*
     * Purpose: Display dimensions.
     */
    public void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    } // method showDim
} // class TwoDShape

/*
 * Purpose: A subclass of TwoDShape for triangles.
 */
class Triangle extends TwoDShape {
    String style;

    /*
     * Purpose: Provide area of the shape.
     */
    public double area() {
        return width * height / 2;
    } // method area

    /*
     * Purpose: Display the style of the shape.
     */
    public void showStyle() {
        System.out.println("Triangle is " + style);
    } // method showStyle
} // class Triangle

/*
 * Purpose: Demonstrate the inheritance.
 */
class Shapes {
    public static void main(String[] args) {
        var t1 = new Triangle();
        var t2 = new Triangle();

        t1.width = 4.0;
        t1.height = 4.0;
        t1.style = "filled";

        t2.width = 8.0;
        t2.height = 12.0;
        t2.style = "outlined";

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
    }  // main(String[])
}  // class Shapes
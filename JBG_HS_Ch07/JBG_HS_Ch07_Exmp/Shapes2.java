/**
 * File: Shapes2.java
 * 
 * Purpose: Use accessor methods to set and get private members.
 * 
 */
/*
 * Purpose: A class for two-dimensional objects.
 */
class TwoDShape {
    private double width;  // Now private
    private double height;  // Now private

    // Accessor methods for width and height.
    /*
     * Purpose: return width
     */
    public double getWidth() {
        return width;
    } // method getWidth
    
    /*
     * Purpose: return height
     */
    public double getHeight() {
        return height;
    } // method getHeight

    /*
     * Purpose: set width
     */
    public void setWidth(double width) {
        this.width = width;
    } // method setWidth

    /*
     * Purpose: set height
     */
    public void setHeight(double height) {
        this.height = height;
    } // method setHeight

    /*
     * Purpose: Display dimensions
     */
    public void showDim() {
        System.out.println("Width and Height are " + width + " and " + height);
    } // method showDim
} // class TwoDShape

/*
 * Purpose: A subclass of TwoDShape for triangles
 */
class Triangle extends TwoDShape {
    String style;

    /*
     * Purpose: Calculate and return area of the shape.
     */
    public double area() {
        return getWidth() * getHeight() / 2;
    } // method area

    /*
     * Purpose: Display the style of the shape
     */
    public void showStyle() {
        System.out.println("Triagnle is " + style);
    } // method showStyle
} // class Triangle

/*
 * Purpose: 
 */
class Shapes2 {
    public static void main(String[] args) {
        var t1 = new Triangle();
        var t2 = new Triangle();

        t1.setWidth(4.0);
        t1.setHeight(4.0);
        t1.style = "filled";

        t2.setWidth(8.0);
        t2.setHeight(12.0);
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
}  // class Shapes2
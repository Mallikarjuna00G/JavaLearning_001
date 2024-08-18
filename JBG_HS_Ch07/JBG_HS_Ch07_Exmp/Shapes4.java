/**
 * File: Shapes4.java
 * 
 * Purpose: Add constructor to TwoDShape.
 * 
 */
/*
 * Purpose: A class for two-dimensional objects.
 */
class TwoDShape {
    private double width;  // Now private
    private double height;  // Now private

    /*
     * Purpose: 
     */
    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    } // Constructor 

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
    private String style;

    /*
     * Purpose: 
     */
    public Triangle(String style, double width, double height) {
        super(width, height);
        this.style = style;
    } // Constructor 
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
class Shapes4 {
    public static void main(String[] args) {
        var t1 = new Triangle("filled", 4.0, 4.0);
        var t2 = new Triangle("outlined", 8.0, 12.0);

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
}  // class Shapes4
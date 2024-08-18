/**
 * File: Shapes7.java
 * @author Mallikarjuna00G
 * Purpose: An important place where subclass references are 
 * assigned to superclass variables is when constructors are 
 * called in a class hierarchy. As you know, it is common for 
 * a class to define a constructor that takes an object of the 
 * class as a parameter. This allows the class to construct a copy 
 * of an object.
 * 
 */

/*
 * Purpose: A class for two-dimensional objects.
 */
class TwoDShape {
    private double width;  // Now private
    private double height;  // Now private

    /*
     * Purpose: A default constructor.
     */
    public TwoDShape() {
        width = height = 0.0;
    } // Constructor 

    /*
     * Purpose: Parameterized constructor.
     */
    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    } // Constructor 

    /*
     * Purpose: Constructor object with equal width and height.
     */
    public TwoDShape(double wh) {
        width = height = wh;
    } // Constructor 

    /*
     * Purpose: 
     */
    public TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
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
     * Purpose: Default constructor
     */
    public Triangle() {
        super();
        style = "none";
    } // Constructor 
    
    /*
     * Purpose: Parameterized constructor
     */
    public Triangle(String style, double width, double height) {
        super(width, height);
        this.style = style;
    } // Constructor 

    /*
     * Purpose: One argument constructor
     */
    public Triangle(double widthOrHeight) {
        super(widthOrHeight);

        style = "filled";
    } // Constructor 

    /*
     * Purpose: 
     */
    public Triangle(Triangle ob) {
        super(ob);  // Pass object to TwoDShape constructor
        style = ob.style;
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
class Shapes7 {
    public static void main(String[] args) {
        var t1 = new Triangle("outlined", 8.0, 12.0);

        // Make a copy of t1
        var t2 = new Triangle(t1);

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
}  // class Shapes7
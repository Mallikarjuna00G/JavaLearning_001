/**
 * File: Shapes5.java
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
class Shapes5 {
    public static void main(String[] args) {
        var t1 = new Triangle(); 
        var t2 = new Triangle("outlined", 8.0, 12.0);
        var t3 = new Triangle(4.0);

        t1 = t2;

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());

        System.out.println();

        System.out.println("Info for t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area is " + t3.area());
    }  // main(String[])
}  // class Shapes5
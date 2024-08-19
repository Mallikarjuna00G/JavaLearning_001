/**
 * File: DynShapes.java
 * @author Mallikarjuna00G
 * Purpose: Use dynamic method dispatch.
 * 
 */

/*
 * Purpose: 
 */
class TwoDShape {
    /*==================== START: FIELDS ====================*/
    private double width;
    private double height;
    private String name;
    /*==================== END: FIELDS ====================*/
    /*==================== START: CONSTRUCTORS ====================*/
    /*
     * Purpose: A default constructor
     */
    public TwoDShape() {
        width = height = 0.0;
        name = "none";
    } // Constructor 

    /*
     * Purpose: Parameterized constructor
     */
    public TwoDShape(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    } // Constructor 

    /*
     * Purpose: Construct object with equal width and height.
     */
    public TwoDShape(double widthHeight, String name) {
        width = height = widthHeight;
        this.name = name;
    } // Constructor 

    /*
     * Purpose: Construct an object from an object.
     */
    public TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    } // Constructor 
    /*==================== END: CONSTRUCTORS ====================*/
    /*==================== START: ACCESSOR (SET and GET) METHODS ====================*/
    /*
     * Purpose: 
     */
    public double getWidth() {
        return width;
    } // method getWidth

    /*
     * Purpose: 
     */
    public void setWidth(double width) {
        this.width = width;
    } // method setWidth

    /*
     * Purpose: 
     */
    public double getHeight() {
        return height;
    } // method getHeight

    /*
     * Purpose: 
     */
    public void setHeight(double height) {
        this.height = height;
    } // method setHeight

    /*
     * Purpose: 
     */
    public String getName() {
        return name;
    } // method getName
    /*==================== END: ACCESSOR (SET and GET) METHODS ====================*/
    /*==================== START: METHODS ====================*/
    /*
     * Purpose: Display dimensions of the shape.
     */
    public void showDim() {
        System.out.println("Width and height are: " + width + " and " + height);
    } // method showDim

    /*
     * Purpose: Calculate and provide area.
     */
    public double area() {
        System.out.println("area() must be overridden.");
        return 0.0;
    } // method area
    /*==================== END: METHODS ====================*/
} // class TwoDShape

/*
 * Purpose: A subclass of TwoDShape for triangles.
 */
class Triangle extends TwoDShape {
    /*==================== START: FIELDS ====================*/
    private String style;
    /*==================== END: FIELDS ====================*/
    /*==================== START: CONSTRUCTORS ====================*/
    /*
     * Purpose: A default constructor.
     */
    public Triangle() {
        super();
        style = "none";
    } // Constructor 

    /*
     * Purpose: Constructor for Triangle.
     */
    public Triangle(String style, double width, double height) {
        super(width, height, "triangle");
        this.style = style;
    } // Constructor 

    /*
     * Purpose: One argument constructor
     */
    public Triangle(double widthHeight) {
        super(widthHeight, "triangle");
        this.style = "filled";
    } // Constructor 

    /*
     * Purpose: Construct object from an object
     */
    public Triangle(Triangle ob) {
        super(ob);  // pass object to TwoDShape constructor
        style = ob.style;
    } // Constructor 
    /*==================== END: CONSTRUCTORS ====================*/
    /*==================== START: ACCESSOR (SET and GET) METHODS ====================*/
    
    /*==================== END: ACCESSOR (SET and GET) METHODS ====================*/
    /*==================== START: METHODS ====================*/
    /*
     * Purpose: Override area() for Triangle
     */
    public double area() {
        return getWidth() * getHeight() / 2;
    } // method area

    /*
     * Purpose: Display the style
     */
    public void showStyle() {
        System.out.println("Triangle is " + style);
    } // method showStyle
    /*==================== END: METHODS ====================*/
} // class Triangle

/*
 * Purpose: A subclass of TwoDShape for rectangles.
 */
class Rectangle extends TwoDShape {
    /*==================== START: FIELDS ====================*/
    
    /*==================== END: FIELDS ====================*/
    /*==================== START: CONSTRUCTORS ====================*/
    /*
     * Purpose: A default constructor.
     */
    public Rectangle() {
        super();
    } // Constructor 

    /*
     * Purpose: Constructor for Rectangle.
     */
    public Rectangle(double width, double height) {
        super(width, height, "rectangle");
    } // Constructor 

    /*
     * Purpose: One argument constructor. Construct a square.
     */
    public Rectangle(double widthHeight) {
        super(widthHeight, "rectangle");
    } // Constructor 

    /*
     * Purpose: Construct object from an object
     */
    public Rectangle(Rectangle ob) {
        super(ob);  // pass object to TwoDShape constructor
    } // Constructor 
    /*==================== END: CONSTRUCTORS ====================*/
    /*==================== START: ACCESSOR (SET and GET) METHODS ====================*/
    
    /*==================== END: ACCESSOR (SET and GET) METHODS ====================*/
    /*==================== START: METHODS ====================*/
    /*
     * Purpose: Is the shape square?
     */
    public boolean isSquare() {
        if(getWidth() == getHeight()) {
            return true;
        }  // if statement:
        return false; 
    } // method isSquare
    /*
     * Purpose: Override area() for Rectangle
     */
    public double area() {
        return getWidth() * getHeight() / 2;
    } // method area
    /*==================== END: METHODS ====================*/
} // class Rectangle

/*
 * Purpose: 
 */
class DynShapes {
    public static void main(String[] args) {
        TwoDShape[] shapes = new TwoDShape[5];

        shapes[0] = new Triangle("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle(7.0);
        shapes[4] = new TwoDShape(10, 20, "generic");

        for(var i = 0; i < shapes.length; i++) {
            System.out.println("Object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }  // for loop: 
    }  // main(String[])
}  // class DynShapes
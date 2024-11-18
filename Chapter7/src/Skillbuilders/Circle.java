package Skillbuilders;


/**
 * Circle class.
 */
public class Circle {
    private static final double PI = 3.14;
    private double radius;

    /**
     * Default constructor
     * pre: none
     * post: A Circle object created. Radius initialized to 1.
     */
    public Circle() {
        radius = 1; // default radius
    }

    /**S
     * Overloaded constructor that accepts a radius.
     * pre: none
     * post: A Circle object created with the specified radius.
     */
    public Circle(double newRadius) {
        radius = newRadius;
    }

    /**
     * Changes the radius of the circle.
     * pre: none
     * post: Radius has been changed.
     */
    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    /**
     * Calculates the area of the circle.
     * pre: none
     * post: The area of the circle has been returned.
     */
    public double area() {
        return PI * radius * radius;
    }

    /**
     * Returns the radius of the circle.
     * pre: none
     * post: The radius of the circle has been returned.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Calculates the circumference of the circle.
     * pre: none
     * post: The circumference of the circle has been returned.
     */
    public double circumference() {
        return 2 * PI * radius;
    }

    /**
     * Class method that displays the formula for the area of a circle.
     * pre: none
     * post: Displays the area formula.
     */
    public static void displayAreaFormula() {
        System.out.println("The formula for the area of a circle is: π * r^2");
    }

    /**
     * Overrides the equals() method to compare two Circle objects.
     * pre: none
     * post: Returns true if the radii are equal; false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // If both references point to the same object
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // If the object is null or not a Circle
        }
        Circle otherCircle = (Circle) obj;
        return Double.compare(radius, otherCircle.radius) == 0;
    }

    /**
     * Overrides the toString() method to provide a string representation of the Circle.
     * pre: none
     * post: A string describing the Circle has been returned.
     */
    @Override
    public String toString() {
        return "Circle [Radius: " + radius + ", Area: " + area() + ", Circumference: " + circumference() + "]";
    }
}
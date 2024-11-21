package Skillbuilders;

public class Circle {
    private double radius;
    private static final double PI = 3.14; // Using 'final' for constants
    
    // Default constructor
    public Circle() {
        this.radius = 1;
    }
    
    // Overloaded constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // Getter for radius
    public double getRadius() {
        return radius;
    }
    
    // Method to calculate area
    public double area() {
        return PI * radius * radius;
    }
    
    // Method to calculate circumference
    public double circumference() {
        return 2 * PI * radius;
    }
    
    // Static method to display the area formula
    public static void displayAreaFormula() {
        System.out.println("The formula for the area of a circle is: A = πr²");
    }
    
    // Equals method to compare two circles based on radius
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle other = (Circle) obj;
            return this.radius == other.radius;
        }
        return false;
    }
    
    // toString method to represent the circle as a string
    @Override
    public String toString() {
        return "Circle has radius " + radius;
    }
}


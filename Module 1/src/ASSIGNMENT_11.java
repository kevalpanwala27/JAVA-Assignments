public class ASSIGNMENT_11 {
    void calculateArea(float x) {
        System.out.println("Area of the square: " + x*x +" sq units");
    }
    void calculateArea(float x, float y) {
        System.out.println("Area of the rectangle: " + x*y + " sq units");
    }
    void calculateArea(double r) {
        double area = 3.14*r*r;
        System.out.println("Area of circle: " + area + " sq units");
    }
    public static void main(String[] args) {
        ASSIGNMENT_11 obj = new ASSIGNMENT_11();

        obj.calculateArea(6.1f);
        obj.calculateArea(10,22);
        obj.calculateArea(6.1);
    }
}

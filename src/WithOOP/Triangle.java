package task2.src.WithOOP;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public boolean isValidTriangle() {
        return (side1 + side2 > side3) && (side3 > Math.abs(side1 - side2));
    }

    public String classifyTriangle() {
        if (!isValidTriangle()) {
            return "Invalid triangle!";
        }
        if (side1 == side2 && side2 == side3) {
            return "Equilateral triangle!";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Isosceles triangle!";
        } else {
            return "Variety side triangle!";
        }
    }
}

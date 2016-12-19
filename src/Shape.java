/**
 * Created by aremo on 12/19/2016.
 */
class Shape {
    double tArea(double a, double h) {
        double triangleArea = 0.5 * a * h;
        return triangleArea;
    }

    void sCalcAndPrint(double a) {
        double squareArea = a * a;
        System.out.println(squareArea);
    }

    double tCircum(double a, double b, double c) {
        double triangleCircum = a * b * c;
        return triangleCircum;
    }

    void rCalcAndPrint(double a, double b) {
        double rectangleCircum = (2 * a) + (2 * b);
        System.out.println(rectangleCircum);
    }
    void cCalcAndPrint(double r) {
        double rectangleCircum = (Math.PI*r*r);
        System.out.println("Pole kola wynosi: " + rectangleCircum);
    }
}


/**
 * Created by aremo on 12/19/2016.
 */
public class ShapeCalculator {
    public static void main(String[] args) {
        Shape triangle = new Shape();
        double tAResult = triangle.tArea(2.5,5);
        System.out.print("Pole trojkata wynosi: ");
        System.out.println(tAResult);

        Shape square = new Shape();
        System.out.print("Pole kwadratu wynosi: ");
        square.sCalcAndPrint(2);


        Shape triangle1 = new Shape();
        double tCResult = triangle.tCircum(2.5,5,2);
        System.out.print("Obwód trojkata wynosi: ");
        System.out.println(tCResult);

        Shape rectangle = new Shape();
        System.out.print("Obwód prostokata wynosi: ");
        rectangle.rCalcAndPrint(2,3);

        Shape circle = new Shape();
        circle.cCalcAndPrint(2);


    }

}

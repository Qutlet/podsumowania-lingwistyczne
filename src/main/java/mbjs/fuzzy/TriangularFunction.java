package mbjs.fuzzy;

public class TriangularFunction implements MembershipFunction {

   // private static TriangularFunction triangularFunction = new TriangularFunction();
   // public static TriangularFunction getInstance(){return triangularFunction;}

//    public double getMembership(double a,double b, double c, double x) {
//        if (x <= a) {
//            return 0.0;
//        }
//        else if (x > a && x < b) {
//            return (x - a) / (b - a);
//        }
//        else if (x == b) {
//            return 1.0;
//        }
//        else if (x > b && x < c) {
//            return (c - x) / (c - b);
//        }
//        else return 0.0; // x >= c
//    }

    @Override
    public double getMembership(double a, double b, double c, double d, double x) {
        if (x <= a) {
            return 0.0;
        }
        else if (x > a && x < b) {
            return (x - a) / (b - a);
        }
        else if (x == b) {
            return 1.0;
        }
        else if (x > b && x < c) {
            return (c - x) / (c - b);
        }
        else return 0.0; // x >= c
    }
}

package mbjs.fuzzy;

public class TrapezoidalFunction implements MembershipFunction {

   // private static TrapezoidalFunction trapezoidalFunction = new TrapezoidalFunction();
   // public static TrapezoidalFunction getInstance(){return trapezoidalFunction;}

    @Override
    public double getMembership(double a,double b, double c, double d, double x) {
        if (x <= a) {
            return 0.0;
        }
        else if (x > a && x < b) {
            return (x - a) / (b - a);
        }
        else if (x >= b && x <= c) {
            return 1.0;
        }
        else if (x > c && x < d) {
            return (d - x) / (d - c);
        }
        else return 0.0; // x >= d
    }

    @Override
    public double cardinality(double a, double b, double c, double d) {
        return ((d-a) + (c - b)) / 2;
    }

    @Override
    public double support(double a, double b, double c, double d) {
        return d - a;
    }
}

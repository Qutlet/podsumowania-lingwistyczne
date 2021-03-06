package mbjs.fuzzy;

public class TriangularFunction implements MembershipFunction {

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

    @Override
    public double cardinality(double a, double b, double c, double d) {
        return (c - a) / 2;
    }

    @Override
    public double support(double a, double b, double c, double d) {
        return c - a;
    }
}

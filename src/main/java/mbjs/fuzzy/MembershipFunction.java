package mbjs.fuzzy;

public interface MembershipFunction {

    double getMembership(double a, double b, double c, double d, double x);
    double cardinality(double a, double b, double c, double d);
    double support(double a, double b, double c, double d);

}

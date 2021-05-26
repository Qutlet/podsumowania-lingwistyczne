package mbjs.fuzzy;

public class Qualifier {

    String name;
    MembershipFunction membershipFunction;
    double a;
    double b;
    double c;
    double d;

    public Qualifier(String name, MembershipFunction membershipFunction, double a, double b, double c, double d) {
        this.name = name;
        this.membershipFunction = membershipFunction;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double getMembership(double x){
        return membershipFunction.getMembership(a,b,c,d,x);
    }

    @Override
    public String toString() {
        return name;
    }

}

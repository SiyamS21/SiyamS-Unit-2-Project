import java.text.DecimalFormat;
public class LinearEquation {
    public static DecimalFormat d = new DecimalFormat("0.00");
    private String point1;
    private String point2;
    public double m;
    public double b;
    private String equation;
    private double dis;
    public LinearEquation(String p1, String p2) {
        point1 = p1;
        point2 = p2;
        int point1X = Integer.parseInt(p1.substring(1, p1.indexOf(",")));
        int point1Y = Integer.parseInt(p1.substring(p1.indexOf(",") + 1, p1.indexOf(")")));
        int point2X = Integer.parseInt(p2.substring(1, p2.indexOf(",")));
        int point2Y = Integer.parseInt(p2.substring(p2.indexOf(",") + 1, p2.indexOf(")")));
        double slope = ((double)point2Y - point1Y) / (point2X - point1X);
        m = slope;
        double yIntercept = point1Y - (slope * point1X);
        b = yIntercept;
        String slopeIntercept = (point2Y - point1Y) + "/" + (point2X - point1X) + "x + " + yIntercept;
        equation = slopeIntercept;
        double distance = Math.sqrt((Math.pow(((double)point2X - point1X), 2)) + (Math.pow((point2Y - point1Y), 2)));
        dis = Double.parseDouble(d.format(distance));
    }

    public String toString() {
        return "First pair: " + point1 + "\nSecond Pair: " + point2 + "\nSlope of Line: " + m + "\nY-intercept: " + b + "\nSlope intercept form: " + equation + "\nDistance between points: " + dis;
    }
}

import java.util.Scanner;
class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your first Coordinate Point: ");
        String point1 = s.nextLine();
        int point1X = Integer.parseInt(point1.substring(1, point1.indexOf(",")));
        int point1Y = Integer.parseInt(point1.substring(point1.indexOf(",") + 1, point1.indexOf(")")));
        System.out.print("Enter your second Coordinate Point: ");
        String point2 =  s.nextLine();
        int point2X = Integer.parseInt(point2.substring(1, point2.indexOf(",")));
        int point2Y = Integer.parseInt(point2.substring(point2.indexOf(",") + 1, point2.indexOf(")")));
        LinearEquation line = new LinearEquation(point1,point2);
        System.out.println(line.toString());
        System.out.print("Enter a third x-value: ");
        String thirdX = s.nextLine();
        System.out.println("Solved coordinate point is: (" + Double.parseDouble(thirdX) + "," + ((Double.parseDouble(thirdX) * (point2Y - point1Y) / (point2X - point1X)) + point1Y - ((point2Y - point1Y) / (point2X - point1X) * point1X)) + ")");
    }
}
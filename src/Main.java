public class Main {
    public static void main(String[] args) {
        Double d1 = 1023d;
        Double d2 = 1023d;

        if (Double.compare(d1, d2) == 0) {
            System.out.println("d1=d2");
        }
        else if (Double.compare(d1, d2) < 0) {
            System.out.println("d1<d2");
        }
        else {
            System.out.println("d1>d2");
        }


        Double double_d1 = 10d;
        Double double_d2 = 1023d;

        if (Double.compare(double_d1, double_d2) == 0) {
            System.out.println("d1=d2");
        }
        else if (Double.compare(double_d1, double_d2) < 0) {
            System.out.println("d1<d2");
        }
        else {
            System.out.println("d1>d2");
        }


        Double double_digit1 = 1023d;
        Double double_digit2 = 10d;

        if (Double.compare(double_digit1, double_digit2) == 0) {
            System.out.println("d1=d2");
        }
        else if (Double.compare(double_digit1, double_digit2) < 0) {
            System.out.println("d1<d2");
        }
        else {
            System.out.println("d1>d2");
        }
    }
}
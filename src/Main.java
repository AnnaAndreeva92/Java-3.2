public class Main {
    public static void main(String[] args) {
        BmiService body = new BmiService();
        double bmi = body.calculate(50, 1.62);

        System.out.println("ОР: 19, ФР: " + bmi);
    }
}

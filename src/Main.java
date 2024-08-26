public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 90;
        double heightM = 1.91;
        int bmi = service.calculate(weightKg, heightM);
        System.out.println(bmi);

        System.out.println();
        System.out.println("100, 2.05");
        System.out.println(service.calculate(100, 2.05));

        System.out.println();
        System.out.println("71, 1.77");
        System.out.println(service.calculate(71, 1.77));
    }
}
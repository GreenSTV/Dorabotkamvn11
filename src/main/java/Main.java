public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long amount;
        boolean registered;
        long bonus = service.calculate(amount = 500, registered = true);
        System.out.println(bonus);


    }
}

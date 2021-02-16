public class Main {
    public static void main(String[] args) {


        Manager m = new Manager("Менеджер");
        System.out.println(m.getBonus());
        System.out.println(m.getFixSalary());
        System.out.println(m.getIncome());
//        System.out.println(m.);
        System.out.println(m.getPosition());

        System.out.println();
        System.out.println();

        Manager q = new Manager("Менеджер1");
        System.out.println(q.getBonus());
        System.out.println(q.getFixSalary());
        System.out.println(q.getIncome());
        System.out.println(q.getPosition());

    }
}

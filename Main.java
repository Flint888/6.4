public class Main {
    public static void main(String[] args) {

        Company company = new Company();
        for (int i = 0; i < 85; i++) {
            company.hire(new Manager("Менеджер"));
        }

        for (int i = 0; i < 3; i++) {
            company.hire(new Operator("Оператор"));
        }

        for (int i = 0; i < 3; i++) {
            company.hire(new TopManager("ТопМенеджер"));
        }
    }
}

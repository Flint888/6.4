public class TopManager extends Staff implements Employee{

    public TopManager(String position, double fixSalary) {

        setPosition(position);
        setFixSalary(fixSalary);
    }

    @Override
    public double getMonthSalary() {
        setFixSalary(150_000);
        if ( ~~~~ > 10_000_000){
            setFixSalary((getFixSalary() + (getFixSalary() * 2.5)));
        }else return getFixSalary();
    }
}

public abstract class Staff implements Employee {

    private String position;
    private double fixSalary;

    public Staff(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getFixSalary() {
        return fixSalary;
    }

    public void setFixSalary(double fixSalary) {
        this.fixSalary = fixSalary;
    }

    @Override
    public String toString() {
        return "Должность = " + position + " " + getMonthSalary();
    }
}

public class Staff extends Person {

    private Student school;
    private double pay;

    public Staff(String name, String address, Student school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public Student getSchool() {
        return school;
    }

    public void setSchool(Student school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[ Person [ name=?, addres=?, school=?, pay=? ]" +
                "school=" + school +
                ", pay=" + pay +
                '}';
    }
}

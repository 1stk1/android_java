package Homework5;

public class Worker {

    String Fio;
    String workType;
    String eMail;
    String phone;
    int pay;
    int age;

    public Worker(String Fio, String workType, String eMail, String phone, int pay , int age) {
        this.Fio = Fio;
        this.workType = workType;
        this.eMail = eMail;
        this.phone = phone;
        this.pay = pay;
        this.age = age;



    }

    void printInfoWorkers(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "рабочий{" +
                "фио='" + Fio + '\'' +
                ", должность ='" + workType + '\'' +
                ", почта='" + eMail + '\'' +
                ", телефон='" + phone + '\'' +
                ", зарюплата=" + pay +
                ", возраст=" + age +
                '}';
    }
}

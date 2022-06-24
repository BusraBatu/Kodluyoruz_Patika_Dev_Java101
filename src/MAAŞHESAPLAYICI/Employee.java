package MAAŞHESAPLAYICI;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;


    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    double tax() {
        if (salary <= 1000) {
            return 0;
        } else {

            return salary * (0.03);
        }

    }

    double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;

        } else {
            return 0;
        }
    }


    double raiseSalary() {

        if (2021 - hireYear < 10) {

            return salary * 0.05;
        } else if (2021 - hireYear > 9 && 2021 - hireYear < 20) {

            return salary * 0.10;
        } else {

            return salary * 0.15;
        }

    }

    @Override
    public String toString() {
        return "Adı: " + name +
                "\n Maaşı: " + salary +
                "\n Çalışma Saati: " + workHours +
                "\n Başlangıç Yılı: " + hireYear +
                "\n Vergi:" + tax() +
                "\n Bonus: " + bonus() +
                "\n Maaş Artışı: " + raiseSalary() +
                "\n Vergi ve Bonuslar ile Birlikte Maaşlar: " + (salary + (bonus() - tax())) +
                "\n Toplam Maaş: " + ((salary - tax()) + bonus() + raiseSalary());
    }
}

package club.banyuan.weekTest;

import java.util.Objects;

public class Worker {

    private int age;
    private String name;
    private double salary;

    public Worker() {
    }

    public Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name=" + name +
                ",age=" + age +
                ", salary=" + salary +
                '}';
    }

    public void work() {
        System.out.println(name +"work");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return age == worker.age &&
                Double.compare(worker.salary, salary) == 0 &&
                Objects.equals(name, worker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, salary);
    }
}


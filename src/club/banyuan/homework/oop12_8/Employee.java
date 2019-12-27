package club.banyuan.homework.oop12_8;


class Employee  {
    private String name;
    private double wage;
    private Employee[] employees = new Employee[0];


    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void addEmployee(Employee employee) {
        Employee[] newArr = new Employee[employees.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i == 0) {
                newArr[i] = employee;
            } else if (i < employees.length) {
                newArr[i] = employees[i];
            } else {
                newArr[i] = employee;
            }
        }
        employees = newArr;
    }

    public void delEmployee(String str) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(str)) {
                employees[i] = employees[i + 1];
                employees[employees.length - 1] = null;
            }
        }
    }

    public double getEmployeeWage(String str) {
        double wage = 1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(str)) {
                wage = employees[i].getWage();
            }
        }
        return wage;
    }

    public double sumWage() {
        double total = 0;
        for (int i = 0; i < employees.length; i++) {
            double c = employees[i].getWage();
            total = total + c;
        }
        return total;
    }

}

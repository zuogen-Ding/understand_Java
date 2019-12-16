package club.banyuan.homework.oop12_8;

public class Test {
    public static void main(String[] args) {
        Employee company=new Employee();
        HourWorker hourWorker1 = new HourWorker("张三",200,10);
        HourWorker hourWorker2 = new HourWorker("李四",230,10);
        Seller seller1=new Seller("王五",5000,2000);
        Seller seller2=new Seller("赵六",200000,2000);
        Staff staff=new Staff("刘淇",205,2500);





        company.addEmployee(hourWorker1);
        company.addEmployee(hourWorker2);
        company.addEmployee(seller1);
        company.addEmployee(seller2);
        company.addEmployee(staff);



        System.out.println(company.sumWage());


        Jewellery jewellery=new Jewellery("苏巴",1000);

        company.addEmployee(jewellery);

        System.out.println(company.sumWage());



    }
}

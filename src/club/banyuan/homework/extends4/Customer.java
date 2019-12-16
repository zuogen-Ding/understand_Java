package club.banyuan.homework.extends4;


 /*B.创建Customer类。
         a. 声明三个私有对象属性:firstName、lastName和account。
         b. 声明一个公有构造器,这个构造器带有两个代表对象属性的参数(f和l)
         c. 声明两个公有存取器来访问该对象属性,方法getFirstName和getLastName返回相应的属性。
         d. 声明setAccount 方法来对account属性赋值。
         e. 声明getAccount 方法以获取account属性。*/
public class Customer extends Account {

    private String firstName;
    private String lastName;
    private String account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

     /*Customer [Smith, Jane] has a account: id is 1000, annualInterestRate is 1.23%, balance is 1140.0
     上面这句话是Customer 类里面的一个display方法  被调用时候 就输出类似语句*/
     public void display(){
         System.out.println("Customer "+"["
                 +getFirstName()+","
                 +getLastName()+"] has a account: id is"
                 +getIdCard()+", annualInterestRate is"
                 +getAnnualInterestRate()+", balance is "
                 +getBalance()+"."
         );
     }
}

### 1，Integer 

Integer integer=i;当i在-128到127之间时，直接是读取缓存里到数，不在范围时，会新建一个Integer对象；


### 2.为什么不能根据返回类型来区分重载
我们调用方法时，一般会忽略其返回值，只在意其效果，所以当直接调用时（ 方法名() ），Java无法判断应该调用哪个；

###3.写出数据库脏读，幻读，重复读的sql语句,并用自己的话总结这三个，mysql数据库的默认事务的隔离级别是什么
#####脏读：
事务A对数据进行操作，但为提交，处于待定状态,可能是commit，也肯能回滚rollback ,此时事务B来读取的数据为修改
后的数据，当事务A的操作失败回滚后，事务B读到的数据就是脏数，B脏读；

#####幻读；
主要发生在对某行数据操作时，事务A对数据操作前先读取，同时事务B对某行数据进行来修改，事务A再读取数据时，与
原来的数据不一样，就发生来幻读；

#####重复读；

#####事务隔离级别
1.read uncommitted  脏读√ 幻读√ 重复读√
2.read committed    脏读
3.pepeatable read
4.serilzabie

### 4.jdbc对事物的处理步骤
jdbc自动完成事务提交处理，通过setAutoCommit(false)来关闭自动自动提交；然后需要手动调用commit()方法来提交，
或者设置回滚rollback();

###5.如何通过反射获取和设置对象私有字段的值？



###6.你对设计模式的理解
功能实现的思路框架，一种对代码的优化


###7.分析QUEUE集合,请用两个队列模拟堆栈结构（队列是先进先出，而堆栈是先进后出）

### String
  false true
###9.为什么要实现Collection接口而不是继承呢？


### 10.二维数组的元素位置
二维数组元素的位置是连续的

###11.pongping

###13.static boolean foo(char c) {
###       System.out.print(c);
###       return true;
###   }
      
###   public static void main(String[] args) {
###       int i = 0;
###       for (foo('A'); foo('B') && (i < 2); foo('C')) {
###           i++;
###           foo('D');
###       }
###   }

ABDCBDCB

###14.finally

###15.ad 项目文件夹 mvn clean package；cd target java -jar 包名

###16.线程类的构造方法、静态块是被哪个线程调用的
#####线程类的构造方法 静态块在new对象时调用，所以哪个线程new了对象，就是哪个线程调用，在main方法里就是main的线程

###17数据库如果有千万级数据，你如何提高查询效率
#####1.查询时加上条件where
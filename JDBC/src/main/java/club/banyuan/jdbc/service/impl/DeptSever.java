package club.banyuan.jdbc.service.impl;

import club.banyuan.jdbc.service.DeptServer;
import club.banyuan.jdbc.uitl.DBUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeptSever  {
    String s = "nba";

    public void test(String s) {
        System.out.println("s:" + s);
        System.out.println("this.s:" + this.s);
        this.s = s;
        System.out.println("s:" + s);
        System.out.println("this.s:" + this.s);
    }

    public static void main(String[] args) {
        new DeptSever().test("cba");
    }
}

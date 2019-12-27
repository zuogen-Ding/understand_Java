package club.banyuan.jdbc.dao;

import club.banyuan.jdbc.pojo.Dept;

public interface DeptDao {

    //增

    void  addMas();

    //修改

    void  updateMas();

    //删

    void  delMas();

    //查

    Dept selectById();

}

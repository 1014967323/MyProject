package cn.dxjava.mapper;

import cn.dxjava.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;


@Mapper
public interface DeptMapper {

    //@Select("SELECT deptno,dname,loc FROM dept")
    public List<Dept> findAll();

    public boolean doCreate(Dept vo) ;


    //@Select("SELECT deptno,dname,loc FROM dept WHERE deptno=#{id}")
    public Dept findById(Long id) ;


}
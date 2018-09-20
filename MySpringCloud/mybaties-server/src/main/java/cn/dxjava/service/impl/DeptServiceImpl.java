package cn.dxjava.service.impl;

import java.util.List;

import javax.annotation.Resource;

import cn.dxjava.mapper.DeptMapper;
import cn.dxjava.pojo.Dept;
import cn.dxjava.service.IDeptService;
import org.springframework.stereotype.Service;


@Service
public class DeptServiceImpl implements IDeptService {
	@Resource
	private DeptMapper deptMapper ;

	@Override
	public Dept get(long id) {

		return this.deptMapper.findById(id);
	}

	@Override
	public boolean add(Dept dept) {
		return this.deptMapper.doCreate(dept);
	}

	@Override
	public List<Dept> list() {

		return this.deptMapper.findAll();
	}

}

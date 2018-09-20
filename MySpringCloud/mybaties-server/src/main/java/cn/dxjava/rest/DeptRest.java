package cn.dxjava.rest;

import javax.annotation.Resource;

import cn.dxjava.pojo.Dept;
import cn.dxjava.service.IDeptService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DeptRest {
	@Resource
	private IDeptService deptService ;
	@Value("${server.port}")
	private String serverPort;

	@RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
	public Object get(@PathVariable("id") long id) {

		return this.deptService.get(id) ;
	}

	@RequestMapping(value="/dept/add",method=RequestMethod.GET)
	public Object add(@RequestBody Dept dept) {

		return this.deptService.add(dept) ;
	}
	@RequestMapping(value="/dept/list",method=RequestMethod.GET)
	public Object list() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return this.deptService.list() ;
	}

	@RequestMapping(value="/dept/getport",method=RequestMethod.GET)
	public String getport() {

		return this.serverPort;
	}
}

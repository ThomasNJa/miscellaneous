package cn.hncu.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import cn.hncu.example.domain.ConfigDomain;
import cn.hncu.example.domain.Person;
import cn.hncu.example.service.MyService;

@RestController
public class MyContrller implements ApplicationContextAware {

	@Autowired
	private MyService service;

	private ApplicationContext context;

	public MyContrller(MyService service) {
		this.service = service;
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.context = arg0;
	}

	/**
	 * 注解自动装配及Repository
	 * 
	 * @return
	 */
	@RequestMapping("/testRepository")
	public void testRepository() {
		try {
			Person person = service.getPerson("tongwenyuan", "22");
			System.out.println(person.getName());

			List<Person> list = service.getAll();
			System.out.println(list.size());
			for (Person person1 : list) {
				System.out.println(person1.getName() + "," + person1.getAge());
			}

			List<Person> list1 = service.findByName("tongwenyuan");
			for (Person person2 : list1) {
				System.out.println(person2.getName() + "," + person2.getAge());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * SpringBoot使用XML配置
	 */
	@RequestMapping("/testGetBean")
	public void testGetBean() {
		ConfigDomain domain = (ConfigDomain) context.getBean("configDomain");
		System.out.println(domain.getName());
		System.out.println(domain.getAge());
	}

	@RequestMapping("/getView")
	public ModelAndView getView(HttpServletRequest request) {
		System.out.println(request);
		return new ModelAndView("NewFile");
	}
	
	/**
	 * MVC获取参数
	 * @param a
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/requestParam", method = RequestMethod.GET)
	public String setupForm(@RequestParam("a") String a, ModelMap model) {
		System.out.println(a);
		return "helloWorld";
	}
}

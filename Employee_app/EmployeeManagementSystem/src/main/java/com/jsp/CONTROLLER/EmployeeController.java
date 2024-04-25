
package com.jsp.CONTROLLER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.DAO.EmployeeDao;
import com.jsp.DTO.Employee;

import java.util.*;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeDao dao;
	
	@RequestMapping("/insert")
	public ModelAndView getEmployee() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee",new Employee());
		mv.setViewName("Create.jsp");
		return mv;
	}
	@RequestMapping("/save")
	public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
		dao.saveEmployee(employee);
		ModelAndView v=new ModelAndView();
		v.setViewName("index.jsp");
		return v;
		
	}
	@RequestMapping("/search")
	public ModelAndView searchEmployee() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee",new Employee());
		mv.setViewName("search.jsp");
		return mv;
	}
	
	@RequestMapping("/display")
	public ModelAndView findEmployee(@ModelAttribute Employee employee)
	{
		ModelAndView mv=new ModelAndView();
		Employee emp=dao.getEmployeeById(employee.getId());
		mv.addObject("employee",emp);
		mv.setViewName("display.jsp");
		return mv;
	}
	@RequestMapping("/delete")
	public ModelAndView deleteEmployee(@ModelAttribute Employee employee)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee",new Employee());
		mv.setViewName("delete.jsp");
		return mv;
	}
	@RequestMapping("/remove")
	public String removeEmployee(@ModelAttribute Employee employee)
	{
		dao.deleteEmployee(employee.getId());
		return "Employee Details Removed Successfully";
	}
	@RequestMapping("/displayall")
	public ModelAndView getAllEmployee()
	{
		ModelAndView mv=new ModelAndView();
		List<Employee> employees=dao.getAllEmployee();
		mv.addObject("employeelist",employees);
		mv.setViewName("displayAll.jsp");
		return mv;
	}
	@RequestMapping("/update")
	public ModelAndView updtaeEmployee()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee",new Employee());
		mv.setViewName("update.jsp");
		return mv;
		
	}
	@RequestMapping("/modify")
	public String modifyEmployeeDetails(@ModelAttribute Employee employeee)
	{
		dao.updateEmployee(employeee);
		return "EMPLOYEE DETAILS UPDATED SUCCESSFULLY";
	}



}
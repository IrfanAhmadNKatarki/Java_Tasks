package valtechWeb3;

/*
@@Author: Irfan Ahmad


*/

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.valtech.dao.Employee;
import com.valtech.dao.EmployeeDAO;

@WebServlet(urlPatterns= {"/empCtlr"})

public class EmployeeControllerServlet extends HttpServlet {
	private EmployeeDAO dao;
	@Override
	public void init() throws ServletException {
		dao=new EmployeeDAO();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String submit=req.getParameter("submit");
		//String update=req.getParameter("submit");
		try {
			if("New Employee".equals(submit)) {
				req.getRequestDispatcher("CreateEmployee.jsp").forward(req, resp);
				return;
			}
			if("save".equals(submit)) {
			Employee e=new Employee();
			e.setId(dao.getNextValidId());
			e.setName(req.getParameter("name"));
			e.setAge(Integer.parseInt(req.getParameter("age")));
			e.setGender(Integer.parseInt(req.getParameter("gender")));
			e.setSalary(Float.parseFloat(req.getParameter("salary")));
			dao.saveEmployee(e);
		}
			
			if("updateEmp".equals(submit)) {
				Employee e=new Employee();
				e.setId(Integer.parseInt(req.getParameter("id")));
				e.setName(req.getParameter("name"));
				e.setAge(Integer.parseInt(req.getParameter("age")));
				e.setGender(Integer.parseInt(req.getParameter("gender")));
				e.setSalary(Float.parseFloat(req.getParameter("salary")));
				dao.updateEmployee(e);
			}
			
			
		
		
		req.setAttribute("emps", dao.getEmployees());
		req.getRequestDispatcher("emps.jsp").forward(req, resp);
	}catch(Exception ex) {
		throw new RuntimeException(ex);
	}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//login here and forwarded to jsp page
		try {
		String empId =req.getParameter("empId");
		String submit=req.getParameter("submit");
		
		
		if(empId==null) {
			loadEmpsAndGotoEmpsPage(req, resp);
			return;
		}
		int id=Integer.parseInt(req.getParameter("empId"));
		if("delete".equals(submit)) {
			dao.deleteEmployee(id);
			loadEmpsAndGotoEmpsPage(req, resp);
			return;
		}
		if("update".equals(submit)) {
            Employee e = dao.getEmployee(id);
            req.setAttribute("e", e);
            req.getRequestDispatcher("updateEmployee.jsp").forward(req,resp);
            return;
        }
		
		
		Employee e=dao.getEmployee(id);
		req.setAttribute("e", e);
		req.getRequestDispatcher("emp.jsp").forward(req, resp);
		;
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	private void loadEmpsAndGotoEmpsPage(HttpServletRequest req, HttpServletResponse resp)
			throws Exception, ServletException, IOException {
		List<Employee> emps=dao.getEmployees();
		req.setAttribute("emps", emps);
		req.getRequestDispatcher("emps.jsp").forward(req, resp);
	}
}

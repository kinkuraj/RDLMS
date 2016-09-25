package in.co.rd.controller;

import java.util.List;

import in.co.rd.beans.Credentials;
import in.co.rd.beans.JobDetails;
import in.co.rd.beans.Result;
import in.co.rd.biz.LoginServiceBean;
import in.co.rd.biz.ManageJobBizService;
import in.co.rd.biz.ManageJobBizServiceImpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	private ApplicationContext context;

	public ApplicationContext getContext() {
		if(context == null){
			setContext(new ClassPathXmlApplicationContext(
					"config/config.xml"));
		}
		return context;
	}
	public void setContext(ApplicationContext context) {
		this.context = context;
	}
	MyController(){
		getContext();
		System.out.println("Controller wake up.");
	}
	@RequestMapping(value = "/login", method = { RequestMethod.GET,
			RequestMethod.POST })
	public ModelAndView login(@RequestParam("userName") String userName,
			@RequestParam("password") String password) {
		LoginServiceBean loginServiceBean = (LoginServiceBean) context
				.getBean("loginServiceBean");
		Credentials credentials = (Credentials) context.getBean("credentials");
		credentials.setUserName(userName);
		credentials.setPassword(password);

		Result result = loginServiceBean.login(credentials);
		if (result.getErrorCode() != null) {
			return new ModelAndView("login", "message", result.getErrorMessage());
			
		}
		return new ModelAndView("home", "message", "Welcome.");
	}

	@RequestMapping("/createEmployee")
	public ModelAndView createEmployee(
			@ModelAttribute("employee") JobDetails jobDetails) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"config.xml");
		ManageJobBizService bizService = (ManageJobBizServiceImpl) context
				.getBean("manageEmpBusinessServiceImpl");
		if (bizService.createJobDetails(jobDetails)) {

			return new ModelAndView("register", "message",
					"Job Created Successfully.");
		} else {
			return new ModelAndView("register", "message",
					"Job is not created. Try again!!");
		}

	}

	@RequestMapping(value = "/fetch", method = { RequestMethod.GET,
			RequestMethod.POST })
	public ModelAndView fetchEmployee(@RequestParam("empNo") String empNo) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"config.xml");
		ManageJobBizService bizService = (ManageJobBizServiceImpl) context
				.getBean("manageEmpBusinessServiceImpl");
		JobDetails jobDetails = bizService.fetchJobDetails(Integer
				.parseInt(empNo));
		return new ModelAndView("details", "jobDetails", jobDetails);
	}
	
	@RequestMapping(value = "/fetchJobList", method = { RequestMethod.GET,
			RequestMethod.POST })
	public ModelAndView fetchJobList() {
		ManageJobBizService bizService = (ManageJobBizServiceImpl) context
				.getBean("manageJobBizServiceImpl");
		List<JobDetails> jobList = bizService.fetchJobList();
		return new ModelAndView("jobSearchListView", "jobList", jobList);
	}
	
	

}

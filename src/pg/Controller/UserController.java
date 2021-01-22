package pg.Controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

import pg.DAO.UserDao;
import pg.Models.User;

@Controller
public class UserController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static String add_update = "/user/create";
	private static String all_user = "/user/index";
	private UserDao dao;

	public UserController() {
		super();
		dao = new UserDao();
	}
	
	@RequestMapping(value= {"/user"}, method= RequestMethod.GET)
	public String create() {
		return add_update;
	}
	
	@RequestMapping("/adduser")
	public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response)
	{
		System.out.println("I am Here.");
		User user = new User();
		user.setName(request.getParameter("name"));
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		
		String res = dao.addUser(user);
		ModelAndView mv = new ModelAndView();
		mv.setView("/user/index");
		mv.addObject("res", res);
		return mv;
	}
}

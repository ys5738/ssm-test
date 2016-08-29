package ys.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ys.dao.UserDao;
import ys.pojo.User;

@Controller
public class UserController {
	@Resource
	private UserDao userService;
	@RequestMapping("/getname")
	public String getName(@RequestParam(value = "id", required = false, defaultValue = "1") int id,Model model){
		String user = this.userService.getNameById(id);
		model.addAttribute("user", user);
		return "hello";
	}
	@RequestMapping("/getuserlist")
	public String getUserList(Model model){
		List<User> users = this.userService.getUserList();
		model.addAttribute("users", users);
		return "getUserList";
	}
	@RequestMapping("/getuser")
	public String getUser(@RequestParam(value = "id", required = false, defaultValue = "1")int id,Model model){
		User user = this.userService.getUserById(id);
		model.addAttribute("user", user);
		return "user";
	}
	
	@RequestMapping("/updateuser")
	public String updateUser(@RequestParam(value = "id", required = false, defaultValue = "1")int id,Model model){
		return "updateuser";
	}
	
	@RequestMapping("/updateuserbyid")
	public String updateUserById(@RequestParam(value = "id", required = false, defaultValue = "1")int id){
		User u = this.userService.getUserById(id);
		u.setAge(122);
		this.userService.modifyUser(u);
		return "hello";
	}
}

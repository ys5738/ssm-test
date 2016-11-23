package ys.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ys.mapper.UserMapper;
import ys.pojo.User;

@Controller
public class UserController {
	@Resource
	private UserMapper userService;
	
	@RequestMapping("/getname/{id}")
	public String getName(@PathVariable(value = "id") int id,Model model){
		System.out.println("a");
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
	//	ArrayList<Integer> a = new ArrayList<>();
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
		TreeMap<String,String> t = new TreeMap<>();
		return "hello";
	}
	
}

package ys.dao;

import java.util.List;

import ys.pojo.User;

public interface UserDao {
	public String getNameById(int id);
	public String getPswById(int id);
	public int getAgeById(int id);
	public User getUserById(int id);
	public List<User> getUserList();
	public void modifyUser(User user);
	public void addUser(User user);
}

package oopHomeWork4.dataAccess.abstracts;

import java.util.List;

import oopHomeWork4.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	User getById(int userId);
	List<User> getAll();

}

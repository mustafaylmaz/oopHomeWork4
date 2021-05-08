package oopHomeWork4.business.abstracts;

import java.util.List;

import oopHomeWork4.entities.concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	List<User> getAll();
	User getById();
	void verify(User user);
	
}

package oopHomeWork4.dataAccess.concretes.InMemory;

import java.util.List;

import oopHomeWork4.dataAccess.abstracts.UserDao;
import oopHomeWork4.entities.concretes.User;

public class InMemoryUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("User added: " + user.getName());
	}

	@Override
	public void delete(User user) {
		System.out.println("User deleted: " + user.getName());
	}

	@Override
	public void update(User user) {
		System.out.println("User updated: " + user.getName());
		
	}

	@Override
	public User getById(int userId) {

		System.out.println("User was brought ");
		return null;
	}

	@Override
	public List<User> getAll() {

		System.out.println("User listed: ");
		return null;
	}

}

package oopHomeWork4.business.concretes;

import java.util.List;

import oopHomeWork4.business.abstracts.UserService;
import oopHomeWork4.dataAccess.abstracts.UserDao;

import oopHomeWork4.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {

		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void verify(User user) {
		// TODO Auto-generated method stub
		
	}

}

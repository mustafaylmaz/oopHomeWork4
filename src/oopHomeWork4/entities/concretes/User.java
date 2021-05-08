package oopHomeWork4.entities.concretes;

import lombok.*;
import oopHomeWork4.entities.abstracts.Entity;

@Getter @Setter
public class User implements Entity{

	private int id;
	private String name;
	private String lastName;
	private String eMail;
	private String password;
	private boolean isActive;
	private boolean isVerified;
	
	public User() {}
	
	public User(int id, String name, String lastName, String eMail, String password, boolean isActive,
			boolean isVerified) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = password;
		this.isActive = isActive;
		this.isVerified = isVerified;
	}
	
	
}

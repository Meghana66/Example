package com.examples.loans.service;

//package com.fis.springlearn.bean;

//import java.util.Set;

//import org.springframework.context.support.BeanDefinitionDsl.Role;


public class Users {

	
	private int id;
	
	private String username;

	//@Column(name = "us_password")
	private String password;
	private String address;

	//@ManyToMany(mappedBy = "userList", fetch = FetchType.EAGER)
	//private Set<Role> roleList;
	public Users() {
		
	}
	public Users(int id,String username,String password,String address) {
		super();
		this.id=id;
		this.username=username;
		this.password=password;
		this.address=address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
@Override
public String toString() {
	return "Users [id=" + id + ", username=" + username + ", password=" + password + ", address=" + address + "]";
}

}




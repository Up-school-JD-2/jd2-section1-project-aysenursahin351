package jd2_section1_project;

public interface UserInterface {
 
	public void UserDelete(User user);	
	public void UserDeleteById(int id);
	public void GetUsers();
	public User SearchUser(int id);
	public User SearchUserByName(String username);
	void UserAdd(User user);
}

package jd2_section1_project;


public class UserManagement implements UserInterface {
 	User[] UserAccountList = new User[20];

	public UserManagement() {
		
	}

	@Override
	public void UserDelete(User user) {
		for (int i = 0; i < UserAccountList.length; i++) {
			if (UserAccountList[i]!=null) {

			if (UserAccountList[i].id==user.id) {
				System.out.println( "Deleting user "+UserAccountList[i].name);
				UserAccountList[i].setId(0);
               return;
			}
		}}		
	}

	@Override
	public void UserDeleteById(int id) {
		for (int i = 0; i < UserAccountList.length; i++) {
			if (UserAccountList[i]!=null) {

			if (UserAccountList[i].id==id) {
				System.out.println( "Deleting user "+UserAccountList[i].name);
				UserAccountList[i].setId(0);
               return;
			}
		}}		
		
	}

	@Override
	public void GetUsers() {
		System.out.println("UserList");
		for (int i = 0; i < UserAccountList.length; i++) {
			if (UserAccountList[i]!=null) {
				if (UserAccountList[i].id!=0) {
					System.out.println(UserAccountList[i].name +" "+UserAccountList[i].id);

				}
			}
		}
		System.out.println();
	}

	@Override
	public User SearchUser(int id) {
		User findUser=new User();
		for (int i = 0; i < UserAccountList.length; i++) {
			if (UserAccountList[i]!=null) {
			if (UserAccountList[i].id==id) {
				System.out.println(UserAccountList[i].name);
				findUser=UserAccountList[i];
				return findUser;
			}
		}}
		return findUser;
	}

	@Override
	public User SearchUserByName(String username) {
		User findUser=new User();
		for (int i = 0; i < UserAccountList.length; i++) {
			if (UserAccountList[i]!=null) {
			if (UserAccountList[i].name.equals(username)) {
				System.out.println(UserAccountList[i].name);
				findUser=UserAccountList[i];
				return findUser;
			}
		}}
		return findUser;
	}

	@Override
	public void UserAdd(User user) {
       for (int i = 0; i < UserAccountList.length; i++) {
    	   if (UserAccountList[i]==null) {
    		     UserAccountList[i]=user;
				return;
			}
	   }		
	}
	
	public boolean Validation(String email,String password) {
		boolean flag=true;
		for (int i = 0; i < UserAccountList.length; i++) {
			if (UserAccountList[i]!=null) {
				if (UserAccountList[i].email.equals(email.trim())&&UserAccountList[i].password.equals(password.trim())) {
					System.out.println("User girişi sağlandı");
					return flag;
				}
			}
			
		}
		System.out.println("Şifre ve email uyumsuz.");
		return flag;
	}
}

package jd2_section1_project;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Menu {
	
public void Menu() {
	User user1 = new User(1, "Ali", "Yılmaz", "password123", "ali.yilmaz@example.com");
	User user2 = new User(2, "Ayşe", "Kara", "123456", "ayse.kara@example.com");
	User user3 = new User(3, "Mehmet", "Demir", "mehmetdemir", "mehmet.demir@example.com");
	User user4 = new User(4, "Selin", "Yıldız", "selinyildiz", "selin.yildiz@example.com");
	User user5 = new User(5, "Ahmet", "Çetin", "ahmet123", "ahmet.cetin@example.com");
	UserManagement user_management=new UserManagement();
	
	user_management.UserAdd(user1);
	user_management.UserAdd(user2);
	user_management.UserAdd(user3);
	user_management.UserAdd(user4);
	user_management.UserAdd(user5);
////////////////////////////////////
    Film film1 = new Film(1, "The Godfather", "Francis Ford Coppola", "Marlon Brando, Al Pacino, James Caan", "24 Mart 1972", "Amerikan mafya ailesinin güç mücadelesini anlatıyor.", "Dram, Suç");
    Film film2 = new Film(2, "The Shawshank Redemption", "Frank Darabont", "Tim Robbins, Morgan Freeman, Bob Gunton", "23 Eylül 1994", "Hapisanedeki mahkumların dostluğunu konu alıyor.", "Dram");
    Film film3 = new Film(3, "The Dark Knight", "Christopher Nolan", "Christian Bale, Heath Ledger, Aaron Eckhart", "18 Temmuz 2008", "Batman'in Joker ve Two-Face ile mücadelesini anlatıyor.", "Aksiyon, Suç");
    Film film4 = new Film(4, "The Lord of the Rings: The Fellowship of the Ring", "Peter Jackson", "Elijah Wood, Ian McKellen, Orlando Bloom", "19 Aralık 2001", "Orta Dünya'da geçen fantastik bir maceranın ilk bölümüdür.", "Fantastik, Macera");
    Film film5 = new Film(5, "Forrest Gump", "Robert Zemeckis", "Tom Hanks, Robin Wright, Gary Sinise", "6 Temmuz 1994", "Zeka seviyesi düşük bir adamın hayatını anlatıyor.", "Dram, Romantik");
    Film film6 = new Film(6, "Inception", "Christopher Nolan", "Leonardo DiCaprio, Joseph Gordon-Levitt, Ellen Page", "16 Temmuz 2010", "Rüya dünyasında geçen bir aksiyon gerilim filmidir.", "Aksiyon, Gerilim");
    Film film7 = new Film(7, "Pulp Fiction", "Quentin Tarantino", "John Travolta, Samuel L. Jackson, Uma Thurman", "14 Ekim 1994", "Farklı karakterlerin birbirine bağlanan hikayelerini anlatıyor.", "Suç, Dram");
    Film film8 = new Film(8, "The Matrix", "The Wachowski Brothers", "Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss", "31 Mart 1999", "Sanal gerçeklikte geçen bir aksiyon filmidir.", "Aksiyon, Bilim Kurgu");
    Film film9 = new Film(9, "Fight Club", "David Fincher", "Brad Pitt, Edward Norton, Helena Bonham Carter", "15 Ekim 1999", "Sıkıcı bir hayattan kurtulmak isteyen bir adamın hikayesini anlatır.", "Dram");
    Film film10 = new Film(10, "Goodfellas", "Martin Scorsese", "Robert De Niro, Ray Liotta, Joe Pesci", "19 Eylül 1990", "İtalyan mafyasının yükseliş ve çöküşünü anlatan bir suç filmidir.", "Suç, Dram");
    
    Film_Management filmManager=new Film_Management();
    filmManager.FilmAdd(film10);
    filmManager.FilmAdd(film9);
    filmManager.FilmAdd(film8);
    filmManager.FilmAdd(film7);
    filmManager.FilmAdd(film6);
    filmManager.FilmAdd(film5);
    filmManager.FilmAdd(film4);
    filmManager.FilmAdd(film3);
    filmManager.FilmAdd(film2);
    filmManager.FilmAdd(film1);
    String exit="";
	User user11=new User();
	Scanner scan=new Scanner(System.in);
	System.out.println("Do you want to create a user account? Y/N");
	System.out.println("Do you have an account ? press A");
	String answer=scan.nextLine();
	if(answer.equalsIgnoreCase("Y")) {
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		user11.setId(randomNumber);
		System.out.println("Enter User Name");
		String userName = Objects.requireNonNull(scan.nextLine(), "User Name cannot be null");
		user11.setName(userName);
		System.out.println("Enter User SurName");
		String userSurName = Objects.requireNonNull(scan.nextLine(), "User Name cannot be null");
		user11.setName(userSurName);
		 System.out.println("Enter Email");
		String email = Objects.requireNonNull(scan.nextLine(), "Email cannot be null");
		user11.setEmail(email);
		System.out.println("Enter Password");
		String password = Objects.requireNonNull(scan.nextLine(), "Password cannot be null");
		user11.setPassword(password);
         System.out.println("Your account has been created");
	}  
	else if (answer.equalsIgnoreCase("A")) {
		    System.out.println("Enter Email");
			String email = Objects.requireNonNull(scan.nextLine(), "Email cannot be null");
			System.out.println("Enter Password");
			String password = Objects.requireNonNull(scan.nextLine(), "Password cannot be null");
			if (user_management.Validation( email, password)) {
				System.out.println("Yo can select options.");
			}
	}
      
        
         while(!(exit.equalsIgnoreCase("E"))) {
        	  System.out.println("What do you want to do");
              System.out.println("Type the option number of the action you want to do");
              System.out.println("Option1: Search film typing filmname: ");
              System.out.println("Option2: Delete film typing filmname:");
              System.out.println("Option3: Add film to filmList :");
              System.out.println("Option4: Delete user to userList  :");
              System.out.println("Option5: Search user to userList  :");
              System.out.println(" Exit press E :");
              System.out.println("**********************************************************");
         String input=scan.nextLine();
         if (input.equals("1")) {
        	 System.out.println("Type to filmname for search.");
             String searchFilm=scan.nextLine();
             filmManager.SearchFilmByName(searchFilm);
		}
       if (input.equals("2")) {
        	 System.out.println("Type to filmname for delete.");
        	 String deleteFilm=scan.nextLine();
        	 filmManager.FilmDelete(deleteFilm);
        	 filmManager.GetFilms();

		}
          if (input.equals("3")) {
        		Random random = new Random();
        		int randomNumber = random.nextInt(100) + 1;
        	 System.out.println("Film başlığını girin:");
        	 String title = scan.nextLine();

        	 System.out.println("Yönetmenini girin:");
        	 String director = scan.nextLine();

        	 System.out.println("Oyuncu kadrosunu girin:");
        	 String cast = scan.nextLine();

        	 System.out.println("Vizyon tarihini girin:");
        	 String releaseDate = scan.nextLine();

        	 System.out.println("Filmin açıklamasını girin:");
        	 String explanation = scan.nextLine();

        	 System.out.println("Filmin türlerini girin:");
        	 String genre = scan.nextLine();

        	 Film film = new Film(randomNumber, title, director, cast, releaseDate, explanation, genre);

        	 System.out.println("Yeni film oluşturuldu: " + film.toString());
 		} 
         
      if (input.equals("4")) {
			System.out.println("Delete user .Type to user id");
			String deleteUser=scan.nextLine();
			int userID = Integer.parseInt(deleteUser);
			user_management.UserDeleteById(userID);
		}
         
 		 if (input.equals("5")) {
			System.out.println("Search user.Type to username");
			String searchUser=scan.nextLine();
			user_management.SearchUserByName(searchUser);

		}
 		else {
 			System.out.println("You must press the correct options numbers");
 		}
         
       }
         
}
	
}


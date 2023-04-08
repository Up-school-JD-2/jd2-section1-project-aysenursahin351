package jd2_section1_project;

public class Film_Management implements FilmInterface {
     Film[] FilmList = new Film[20];

	@Override
	public void FilmDelete(String deleteFilm) {
		for (int i = 0; i < FilmList.length; i++) {
			if (FilmList[i]!=null) {

			if (FilmList[i].title.equals(deleteFilm)) {
				System.out.println( "Deleting film "+FilmList[i].title);
				FilmList[i].setId(0);
               return;
			}
		}}			
	}

	@Override
	public void FilmDeleteById(int id) {
		for (int i = 0; i < FilmList.length; i++) {
			if (FilmList[i]!=null) {
			if (FilmList[i].id==id) {
				System.out.println( "Deleting film "+FilmList[i].title);
				FilmList[i].setId(0);
               return;
			}
		}}	
		
	}

	@Override
	public void GetFilms() {
		System.out.println("********FilmList************");
		for (int i = 0; i < FilmList.length; i++) {
			if (FilmList[i]!=null) {
				if (FilmList[i].id!=0) {
					System.out.println("Title:"+FilmList[i].title +"  id "+FilmList[i].id);
				}
			}
		}
		System.out.println();
	}

	@Override
	public Film SearchFilm(int id) {
		// TODO Auto-generated method stub
		Film findFilm=new Film();
		for (int i = 0; i < FilmList.length; i++) {
		 	if (FilmList[i]!=null) {
			if (FilmList[i].id==id) {
				System.out.println("Searched Title:"+FilmList[i].title);
				findFilm=FilmList[i];
				return findFilm;
			}
		}}
		return findFilm;
	}

	@Override
	public Film SearchFilmByName(String filmName) {
		Film findFilm=new Film();
		for (int i = 0; i < FilmList.length; i++) {
		 	 if (FilmList[i]!=null) {

			if (FilmList[i].title.equals(filmName.trim())) {
				System.out.println("Searched Title:"+FilmList[i].title);
				findFilm=FilmList[i];
				return findFilm;
			}
		}
	 }
		return findFilm;
		
	}

	@Override
	public void FilmAdd(Film film) {
		  for (int i = 0; i < FilmList.length; i++) {
	    	   if (FilmList[i]==null) {
	    		   FilmList[i]=film;
					return;
				}
		   }		
		
	}

	@Override
	public void FilmDelete(Film film) {
		// TODO Auto-generated method stub
		
	}


}

package jd2_section1_project;

public interface FilmInterface {
	public void FilmDelete(Film film);	
	public void FilmDeleteById(int id);
	public void GetFilms();
	public Film SearchFilm(int id);
	public Film SearchFilmByName(String filmName);
	void FilmAdd(Film film);
	void FilmDelete(String deleteFilm);
}

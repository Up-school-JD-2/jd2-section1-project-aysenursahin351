package jd2_section1_project;

public class Film {
/// filmin id'sini, filmin başlığını, yönetmenini, oyuncularını, tarihini, açıklamasını, türünü içermelidir.
	
	int id;
	String title;
	String director;
	String cast;
	String releaseDate;
	String explanation;
	String genre;
	public Film(int id, String title, String director, String cast, String releaseDate, String explanation,
			String genre) {
		super();
		this.id = id;
		this.title = title;
		this.director = director;
		this.cast = cast;
		this.releaseDate = releaseDate;
		this.explanation = explanation;
		this.genre = genre;
	}
	public Film() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getCast() {
		return cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}

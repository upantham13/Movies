package movies;
import java.util.ArrayList;
import java.util.TreeSet;

public class ListFilmArchive extends ArrayList<Movie> implements FilmArchive {

	public static void main (String[] args) {
		
		ListFilmArchive archive = new ListFilmArchive();
		Movie[] movies = Movie.getTestMovies();
		for (Movie m: movies) {
			archive.add(m);
		}
		System.out.println("Unsorted Archive of Movies:");
		for (Movie movie: archive) {
			System.out.println(movie);
		}
		
		ArrayList<Movie> list = archive.getSorted();
		System.out.println("Sorted Archive of Movies:");
		for (Movie movie: list) {
			System.out.println(movie);
		}
	}
	
	public boolean add(Movie m) {
		for (Movie element: this) {
			if(element.equals(m)) {
				return false;
			}
		}
		super.add(m);
		return true;	
	}
	
	public ArrayList<Movie> getSorted() {
		TreeSet<Movie> treeSetMovie = new TreeSet<Movie>(this);
		return new ArrayList<Movie>(treeSetMovie);
	}
}

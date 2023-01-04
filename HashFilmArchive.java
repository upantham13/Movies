package movies;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HashFilmArchive extends HashSet<Movie> implements FilmArchive{
	
	public static void main (String[] args) {
		
		HashFilmArchive hashArchive = new HashFilmArchive();
		Movie[] movies = Movie.getTestMovies();
		for (Movie m: movies) {
			hashArchive.add(m);
		}
		System.out.println("Unsorted Archive of Movies:");
		for (Movie movie: hashArchive) {
			System.out.println(movie);
		}
		
		hashArchive.getSorted();
		System.out.println("Sorted Archive of Movies:");
		for (Movie movie: hashArchive) {
			System.out.println(movie);
		}
	}
	
	@Override
	public boolean add(Movie m) {					
		return super.add(m);
	}
	
	public ArrayList<Movie> getSorted() {
		TreeSet<Movie> treeSetMovie = new TreeSet<Movie>(this);
		return new ArrayList<Movie>(treeSetMovie);
	}
}

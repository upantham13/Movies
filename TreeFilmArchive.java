package movies;
import java.util.ArrayList;
import java.util.TreeSet;

public class TreeFilmArchive extends TreeSet<Movie> implements FilmArchive{

	public static void main (String[] args) {
		
		TreeFilmArchive treeArchive = new TreeFilmArchive();
		Movie[] movies = Movie.getTestMovies();
		for (Movie m: movies) {
			treeArchive.add(m);
		}
		System.out.println("Unsorted Archive of Movies:");
		for (Movie movie: treeArchive) {
			System.out.println(movie);
		}
		
		treeArchive.getSorted();
		System.out.println("Sorted Archive of Movies:");
		for (Movie movie: treeArchive) {
			System.out.println(movie);
		}
	}
	
	@Override
	public boolean add(Movie m) {
		return super.add(m);
	}
	
	public ArrayList<Movie> getSorted() {
		return new ArrayList<Movie>(this);
	}
}

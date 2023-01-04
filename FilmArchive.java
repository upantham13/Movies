package movies;
import java.util.ArrayList;

public interface FilmArchive {

	public ArrayList<Movie> getSorted();
	
	/**
	 * If the argument m already appears (according to deep-equality) in the film archive, 
	 * this method returns false and do nothing else.
	 * if the argument does not yet appear in the archive, it is added and the method returns true.
	 * @param m
	 * @return
	 */
	public boolean add(Movie m);
		
}

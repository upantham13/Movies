package movies;
/*
 * Sources I Used for this Assignment:
 * Class Discord: Many of my peers had the same questions as I did. I used the hints from there and implemented
 * it into the code here.
 * Java Documentation: I used the java documentation links from the HW3 files to know which methods to use in this code.
 * My CS46A Homework: For some pieces I referred back to last semester's homework for some refreshers on certain pieces
 * such as the Comparable interface.
 */
public class Movie implements Comparable<Movie> {

		String title;
		int year;
		
		public Movie(String title, int year) {
			this.title = title;
			this.year = year;
		}
		
		/**
		 * This method compares a specified movie m with this movie object by
		 * comparing the title and year.
		 * Returns 0 if movies title and year are the same
		 * else returns -1 or 1 ...
		 */
		public int compareTo(Movie m) {
			if(this.getTitle().compareTo(m.getTitle()) == 0) {
				
				if (Integer.valueOf(this.getYear()).compareTo(m.getYear()) == 0) {
					return 0;
				}
				else if (Integer.valueOf(this.getYear()).compareTo(m.getYear()) == 1){
					return 1;
				}
				else {
					return -1;
				}
			}
			else {
				if (this.getTitle().compareTo(m.getTitle()) == 1) {
					return 1;
				}
				else {
					return -1;
				}
			}
		}
		
		public String getTitle() {
			return title;
		}
		
		public int getYear() {
			return year;
		}
		
		public boolean equals(Movie m) {
			return this.getTitle().equals(m.getTitle()) && Integer.valueOf(this.getYear()).equals(m.getYear());
		}
		
		public String toString() {
			return getTitle() + " (" + getYear() + ")";
		}
		
		public static Movie[] getTestMovies() {
			final Movie[] THE_MOVIES =
				{
					new Movie("Iron Man", 2007),
					new Movie("Iron Man", 2008),
					new Movie("Captain America", 2009),
					new Movie("Thor", 2009),
					new Movie("The Avengers", 2012),
					new Movie("The Avengers", 2012),
					new Movie("Avengers and the Age of Ultron", 2015),
					new Movie("Thor Ragnarok", 2017),
					new Movie("Avengers Infinity War", 2018),
					new Movie("Avengers Endgame", 2019)
				};
			return THE_MOVIES;
		}
		
		public int hashCode() {
			return title.hashCode() + year;
		}
		
}

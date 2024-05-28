package java16;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class MovieTest {
	
	public static List<Movie> movies = MovieUtil.getMovieData();
	
	public static void main(String[] args) {

		MinMax<Movie> minMaxGrossingMovie = findMinMaxGrossingMovie();

		System.out.println("Minimum grossing movie: "+ minMaxGrossingMovie.min());
		System.out.println("Maximum grossing movie: "+ minMaxGrossingMovie.max());
	}


	public static MinMax<Movie> findMinMaxGrossingMovie(){

		var grossEarningComparator = Comparator.comparing(Movie::getGrossEarning);

		return  movies.stream()
					  .collect(Collectors.teeing
							  (
					  			minBy(grossEarningComparator),
							  	maxBy(grossEarningComparator),
							  	(min, max) ->
										new MinMax<>(min.orElse(null), max.orElse(null))
							  )
					  );
	}
}

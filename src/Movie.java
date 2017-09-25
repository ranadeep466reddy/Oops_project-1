/**
 * Represents a class Movie having information about a movie having the following attributes
 * default constructor, parameterised constructor receiving movie name and mpaa rating
 * Accessors returning class variable or value and Mutator setting a variable or value
 * 
 * @author Mulucuri Ranadeep Reddy
 */
public class Movie {
	//data field  - set the access level to private
	private String movie_name;
	private String MPAA_rating;
	private int bad, ok, good, great;
	private int rating_one = 0;
	private int rating_two = 0;
	private int rating_three = 0;
	private int rating_four = 0;
	private double average = 0;
	private double var = 0;

/**
 * This is a default constructor initializing movie name and mpaa rating to null
 */
	public Movie()
	{
		movie_name = null;
		MPAA_rating = null;
	}
/**
 * This is a parametrized constructor used to provide different values to the distinct objects
 * @param movie_name
 * @param MPAA_rating
 */
	
	public Movie(String movie_name, String MPAA_rating)
	{
		this.movie_name = movie_name;
		this.MPAA_rating = MPAA_rating;
	}

/**
* This Accessor method is used to return the value of a private field
* @return this returns a string value movie_name
*/
	
	public String getMovieName()
	{
		return movie_name;
	}

/**
* This Mutator method is used to set value of a private field
* @param this receives String variable movie_name
*/

	public void setMovieName(String movie_name)
	{
		movie_name = movie_name;
	}
	
/**
* This Accessor method is used to return the value of a private field
* @return this returns a string value MPAA_rating
*/
	
	public String getMpaaRating()
	{
		return MPAA_rating;
	}

/**
* This Mutator method is used to set value of a private field
* @param this receives String variable MPAA_rating
*/
	
	public void setMpaaRating(String MPAA_rating)
	{
		MPAA_rating = MPAA_rating;
	}
	
	
/**
 * This Accessor method is used to return the value of a private field
 * @return this returns a integer value bad
 */
	
	public int getBadRating()
	{
		return bad;
	}
	
/**
 * This Mutator method is used to set value of a private field
 * @param this receives integer variable bad_rating
 */
	
	public void setBadRating(int bad_rating)
	{
		bad = bad_rating;
	}

/**
* This Accessor method is used to return the value of a private field
* @return this returns a integer value ok
*/
	
	public int getOkRating()
	{
		return ok;
	}

/**
* This Mutator method is used to set value of a private field
* @param this receives integer variable ok_rating
*/
	
	public void setOkRating(int ok_rating)
	{
		ok = ok_rating;
	}

/**
* This Accessor method is used to return the value of a private field
* @return this returns a integer value good
*/
	
	public int getGoodRating()
	{
		return good;
	}

/**
* This Mutator method is used to set value of a private field
* @param this receives integer variable good_rating
*/
	
	public void setGoodRating(int good_rating)
	{
		good = good_rating;
	}
	
/**
* This Accessor method is used to return the value of a private field
* @return this returns a integer value great
*/
	
	public int getGreatRating()
	{
		return great;
	}

/**
* This Mutator method is used to set value of a private field
* @param this receives integer variable great_rating
*/
	
	public void setGreatRating(int great_rating)
	{
		great = great_rating;
	}
	    
/**
 * This method receives integer rating given by user and increments the variable that matches the input parameter 
 * @param add_rating
 */
	
	public void addRating(int add_rating)
	{
		 
		switch (add_rating)
		{
			case 1: 
				rating_one ++;
				System.out.println("Rating one is incremented to: " +rating_one);
				break;
			case 2: 
				rating_two ++;
				System.out.println("Rating two is incremented to: " +rating_two);
				break;
			case 3: 
				rating_three ++;
				System.out.println("Rating three is incremented to: " +rating_three);
				break;
			case 4: 
				rating_four ++;
				System.out.println("Rating four is incremented to: " +rating_four);
				break;
			default: 
				System.out.println("A value other than 1,2,3,4 was entered for rating");
				break;
		}
	}
	    
/**
 * This method returns variable of type double
 * if user enters four invalid ratings average will be NaN, to avoid that display message to user and return average as zero 
 * @return average
 * <p>Bugs: 
 */
	public double getAverage()
	{
		var = (rating_one + rating_two + rating_three + rating_four);
		if(var == 0){
			System.out.println("");
			System.out.println("Please give atleast one valid rating");
			return var;
		}
		else
		{
		average = (rating_one * 1 + rating_two * 2 + rating_three * 3 + rating_four * 4)/var;
		System.out.println("");
		System.out.println("Average rating for movie is: " + average);
		return average;
		}
	}
	
/**
 * This method receives string movie name, string mpaa rating and average variable of type double and prints the arguments passed
 * @param movie_name
 * @param MPAA_rating
 * @param average
 */
	
	public void display(String movie_name, String MPAA_rating, double average)
	{
		System.out.println("");
		System.out.println("Movie name is: " + movie_name);
		System.out.println("Movie MPAA_rating is: " + MPAA_rating);
		System.out.println("Average rating for movie is: " + average);
	}

}

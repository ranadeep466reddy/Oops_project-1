/////////////////////////////////////////////////////////////////////
//Title : Java Program to display movie name, mpaa rating and average rating for the movie given by user
//Files : MovieDemo.java and Movie.java
//Semester : FALL 2016

//Author : Mulucuri Ranadeep Reddy
//Email: RXR160330@utdallas.edu
//CS Login: NA
//Lecturer's Name: Nassim Sohaee
//Course Section: MIS 6323.502-OOP-F16
////////////////////////////////////////////////////////////////////

import java.util.Scanner;
public class MovieDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rating_bad, rating_ok, rating_good, rating_great, rating_option;
		double average;
		String movie_name, mpaa;
		
		System.out.println("Enter Movie Name: ");
		Scanner sc = new Scanner(System.in);
		movie_name = sc.nextLine();
		System.out.println("Your Movie name is: " + movie_name);
		
		System.out.println("");
		
		System.out.println("Enter Movie MPAA rating eg. G,PG,PG-13,R: ");
		Scanner sc1 = new Scanner(System.in);
		mpaa = sc1.nextLine();	
		System.out.println("Your MPAA rating is: " + mpaa);
		
		
		Movie m1 = new Movie(movie_name, mpaa);
		Movie m2 = new Movie(movie_name, mpaa);
		
		System.out.println("");
		System.out.println("Enter rating for the movie first_time: 1.Bad 2.OK 3.Good 4.Great: ");
		Scanner sc2 = new Scanner(System.in);
		rating_bad  = sc2.nextInt();
		System.out.println("Your rating is: " + rating_bad);
		
		m1.addRating(rating_bad);
		
		System.out.println("");
		System.out.println("Enter rating for the movie Second_time: 1.Bad 2.OK 3.Good 4.Great: ");
		Scanner sc3 = new Scanner(System.in);
		rating_ok  = sc3.nextInt();
		System.out.println("Your rating is: " + rating_ok);
		
		m1.addRating(rating_ok);
		
		System.out.println("");
		System.out.println("Enter rating for the movie third_time: 1.Bad 2.OK 3.Good 4.Great: ");
		Scanner sc4 = new Scanner(System.in);
		rating_good  = sc4.nextInt();
		System.out.println("Your rating is: " + rating_good);
		
		m1.addRating(rating_good);
		
		System.out.println("");
		System.out.println("Enter rating for the movie fourth_time: 1.Bad 2.OK 3.Good 4.Great: ");
		Scanner sc5 = new Scanner(System.in);
		rating_great  = sc5.nextInt();
		System.out.println("Your rating is: " + rating_great);
		
		m1.addRating(rating_great);
		
		System.out.println("");
		System.out.println("Enter rating for the movie fifth_time: 1.Bad 2.OK 3.Good 4.Great: ");
		Scanner sc6 = new Scanner(System.in);
		rating_option  = sc6.nextInt();
		System.out.println("Your rating is: " + rating_option);
		
		m1.addRating(rating_option);
		
		average = m1.getAverage(); 
		m2.display(movie_name, mpaa, average);
		
		
		sc.close();
		sc1.close();
		sc2.close();
		sc3.close();
		sc4.close();
		sc5.close();
		sc6.close();
	}

}

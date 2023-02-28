package polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Movie theMovie = new Adventure("Star Wars");

        theMovie.watchMovie();
        Scanner s = new Scanner(System.in);
        System.out.println("a) action     c) comedy     Q) quit");
        String type = s.nextLine();
        if ("Qq".contains(type)) {

        } 
            System.out.println("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }


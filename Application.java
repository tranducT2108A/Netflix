package com.netflix;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Repository repository=new Repository();
        Controller controller=new Controller();
        repository.getdataGSON();
        List<Movie> movieList=repository.movieList;

        while (true) {


            System.out.println("----------------------VINA TA POOR--------------------------------");
            System.out.println("1.Sort Film (Name)\n2.Search by Name\n3.Search by category\n4.Search by Language\n5.List Film.6.Exit App");
            int ch=sc.nextInt();
            sc.nextLine();
            switch (ch){
                case 1:
                    Collections.sort(movieList, new Comparator<Movie>() {
                        @Override
                        public int compare(Movie o1, Movie o2) {
                            return o1.getTitle().compareTo(o2.getTitle());

                        }

                    });
                    printList(movieList);
                    break;
                case 2:
                    System.out.println("Enter Name Movie");
                    String name= sc.nextLine();
                    System.out.println("List"+name);
                    Controller.searchByName(movieList,name);
                    break;
                case 3:
                    System.out.println("Enter Category Movie");
                    String category= sc.nextLine();
                    System.out.println("List"+category);
                    Controller.searchByCategory(movieList,category);
                    break;
                case 4:
                    System.out.println("Enter Name Movie");
                    String language= sc.nextLine();
                    System.out.println("List"+language);
                    Controller.searchByLanguage(movieList,language);
                    break;
                case 5:

                    Controller.getAllMovieCategory(movieList);
                    break;
                case 6:
                    break;
            }
        }

    }
    public static void printList(List<Movie> movieList){
        for (Movie movie:movieList
             ) {
            System.out.println(movie);
        }
    }


}

package com.netflix;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Controller {

    public static void searchByName(List<Movie>movieList,String name){
        for (int i=0;i<movieList.size();i++){
            if (movieList.get(i).getTitle().contains(name)){
                System.out.println(movieList.get(i));
            }
        }
    }
    public static void searchByCategory(List<Movie>movieList,String category){
        for (int i=0;i<movieList.size();i++){
            if (movieList.get(i).getCategory().contains(category)){
                System.out.println(movieList.get(i));
            }
        }
    }
    public static void searchByLanguage(List<Movie>movieList,String language){
        for (int i=0;i<movieList.size();i++){
            if (movieList.get(i).getLanguage().contains(language)){
                System.out.println(movieList.get(i));
            }
        }
    }
    public static void getAllMovieCategory(List<Movie>movieList){
        Map<String,Integer>countMovie=new HashMap<>();
        for (int i=0;i< movieList.size();i++){
            String category= movieList.get(i).getCategory();
            String arrCategory[]=category.split("/");
            for (int j=0;j<arrCategory.length;j++){
                Integer count=countMovie.get(arrCategory[j]);
                if (count==null){
                    countMovie.put(arrCategory[j],1);
                }else {
                    countMovie.put(arrCategory[j],count+1);
                }
            }
        }
        for (Map.Entry<String,Integer>entry:countMovie.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}

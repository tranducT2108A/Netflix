package com.netflix;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Repository {
    public List<Movie> movieList;
    public void getdataGSON(){
        try {
            FileReader reader=new FileReader("src/netflix.json");
            Type obj=new TypeToken<List<Movie>>(){}.getType();
            movieList=new Gson().fromJson(reader,obj);
            for (Movie list:movieList) {
                System.out.println(list);
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.example.search_engine;

import java.sql.Time;
import java.sql.Timestamp;

public class SearchResult {
    private String link;
    private String link_name;
    private Timestamp time;

    public String getLink(){
        return this.link;
    }

    public void setLink(String link){
        this.link = link;
    }

    public String getLink_name(){
        return this.link_name;
    }

    public void setLink_name(String link_name){
        this.link_name = link_name;
    }

    public Timestamp getTime(){
        return this.time;
    }

    public void setTime(Timestamp time){
        this.time = time;
    }

    SearchResult(String link,String link_name,Timestamp time){
        this.link = link;
        this.link_name = link_name;
        this.time = time;
    }
}

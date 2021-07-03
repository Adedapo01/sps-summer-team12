package com.google.sps.servlets;

import java.lang.String;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Class that serves to represent an employer */
public final class Post {
    //attributes
    private String userReview;
    private boolean parking;
    private int noiseScore;
    private int spaceScore;
    private int ratingScore;
    private String locationName;
    private String category;


    public Post(String locationName, String category, boolean parking, int ratingScore, int noiseScore, int spaceScore, String userReview){
        this.locationName = locationName;
        this.category = category;
        this.parking = parking;
        this.ratingScore = ratingScore;
        this.noiseScore = noiseScore;
        this.spaceScore = spaceScore;
        this.userReview = userReview;
    }
}
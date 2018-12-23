/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientSystem;

/**
 *
 * @author Jonbr
 */
public class Ratings {
    private int rating;
    private String comments;
    
    public Ratings(int rating, String comments) {
        this.rating = rating;
        this.comments = comments;
    }

    /*Setters*/
    public void setRating(int rating) {
        this.rating = rating;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }

    /*Getters*/
    public int getRating() {
        return rating;
    }
    public String getComments() {
        return comments;
    }
    
    
    
}

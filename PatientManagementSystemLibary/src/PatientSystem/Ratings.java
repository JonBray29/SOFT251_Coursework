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
    private int ratingValue;
    private String comments;
    private Doctor doctor;

    private Ratings(int ratingValue, String comments) {
        this.ratingValue = ratingValue;
        this.comments = comments;
    }
    
    public void createRating() {
        Ratings rating = new Ratings(ratingValue, comments);
        doctor.getRatings().add(rating);
    }

    /*Setters*/
    public void setRatingValue(int ratingValue) {
        this.ratingValue = ratingValue;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    

    /*Getters*/
    public int getRatingValue() {
        return ratingValue;
    }
    public String getComments() {
        return comments;
    }
    public Doctor getDoctor() {
        return doctor;
    }
    
    
    
}

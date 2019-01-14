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

    private Ratings(int ratingValue, String comments) {
        this.ratingValue = ratingValue;
        this.comments = comments;
    }
    
    public void createRating(int ratingValue, String comments, Doctor doctor) {
        Ratings rating = new Ratings(ratingValue, comments);
        doctor.getRatings().add(rating);
    }

    public void createFeedback(Doctor doctor, String comment) {
        int value = 0;
        int i = 0;
        double average;
        for(Doctor d : UsersSingleton.getInstance().getListOfDoctors()){
            if(d == doctor) {
                for(Ratings r : d.getRatings()) {
                    value = value + r.getRatingValue();
                    i++;
                }
                average = value/i;
                String notification = "Average rating: " + Double.toString(average) + "" + comment;
                Notifications notifications = new Notifications(notification);
                d.getNotifications().add(notifications);
            }
        }
    }
    
    /*Setters*/
    public void setRatingValue(int ratingValue) {
        this.ratingValue = ratingValue;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }  

    /*Getters*/
    public int getRatingValue() {
        return ratingValue;
    }
    public String getComments() {
        return comments;
    }    
    
}

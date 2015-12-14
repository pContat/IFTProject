package ca.udes.bonc.ift_project.dataObject;

import java.util.Date;
import java.util.HashMap;

/**
 * Created by cbongiorno on 12/12/2015.
 */
public class Event {
    private String id;
    private double latitude;
    private double longitude;
    private String title;
    private Date date;
    private String authorID;
    private String authorName;
    private String category;
    private String type;
    private HashMap<String,String> listParticipant = new HashMap<String,String>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public HashMap<String, String> getListParticipant() {
        return listParticipant;
    }
    public void addParticipant (String id, String name){
        this.listParticipant.put(id,name);
    }
}

package my.utm.ip.spring_jdbc.model;

import java.util.Arrays;
import java.util.Date;

import my.utm.ip.spring_jdbc.model.DAO.EventDAO;

public class Event {
    private int id;
    private String title;
    private Date startDate;
    private Date endDate;
    private String location;
    private String organizer;
    private String description;
    private byte[] imageData;
    private String base64Image;
    private int userid;


    public Event() {
        // Default constructor
    }

    public Event(int id, String title, Date startDate, Date endDate, String location, String organizer, String description, byte[] imageData) {
        this.id = id;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.organizer = organizer;
        this.description = description;
        this.imageData = imageData;
    }
    
    // Getters and setters for all fields
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    public String getBase64Image() {
        return base64Image;
    }

    public void setBase64Image(String base64Image) {
        this.base64Image = base64Image;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
    public void fromDAO(EventDAO dao) {
        if (dao != null) {
            this.id = dao.getId();
            this.title = dao.getTitle();
            this.startDate = dao.getStartDate();
            this.endDate = dao.getEndDate();
            this.location = dao.getLocation();
            this.organizer = dao.getOrganizer();
            this.description = dao.getDescription();
            this.imageData = dao.getImageData();
            this.userid = dao.getUserid();
        } else {
            // Handle the case where dao is null (optional)
        }
    }

    public EventDAO toDAO() {
        EventDAO dao = new EventDAO();

        dao.setId(this.id);
        dao.setTitle(this.title);
        dao.setStartDate(this.startDate);
        dao.setEndDate(this.endDate);
        dao.setLocation(this.location);
        dao.setOrganizer(this.organizer);
        dao.setDescription(this.description);
        dao.setImageData(this.imageData);
        dao.setUserid(this.userid);

        return dao;
    }

    public Event(EventDAO dao) {
        this.fromDAO(dao);
    }

    @Override
    public String toString() {
    return "Event{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", startDate=" + startDate +
            ", endDate=" + endDate +
            ", location='" + location + '\'' +
            ", organizer='" + organizer + '\'' +
            ", description='" + description + '\'' +
            ", imageData=" + Arrays.toString(imageData) +'\'' +
            ", userid=" + userid +
            '}';
}

}

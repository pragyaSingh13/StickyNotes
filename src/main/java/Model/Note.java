package Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "stickynotes")
public class Note {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastEdited() {
        return lastEdited;
    }

    public void setLastEdited(Date lastEdited) {
        this.lastEdited = lastEdited;
    }

    @Id
    private String id;

    private String note;

    private Date dateCreated;

    private Date lastEdited;

    public Note(String id, String note, Date dateCreated, Date lastEdited){
         super();
         this.id = id;
         this.note = note;
         this.dateCreated = dateCreated;
         this.lastEdited =  lastEdited;

    }


}

package model;

public class Note {
    private String noteName;
    private String date;
    private String type;
    private String urgency;

    public Note(String noteName, String date, String type, String urgency, String reminder) {
        this.noteName = noteName;
        this.date = date;
        this.type = type;
        this.urgency = urgency;
    }

    public Note() {}

    public String getNoteName() {
        return noteName;
    }

    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

    public  void printNoteInfo() {
        System.out.println("----------------------------------");
        System.out.println("Note name: " + noteName);
        System.out.println("Note Date: " + date);
        System.out.println("Note Type: " + type);
        System.out.println("Note Urgency: " + urgency);
        System.out.println("----------------------------------");
    }
}

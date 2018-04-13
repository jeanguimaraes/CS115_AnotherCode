package edu.ldsbc.Assignment6;

import java.time.LocalTime;

public class CourseOffering {

    private char [] srcArray;
    private int courseNumber;
    private String courseName;
    private String instructor;
    private char section[];
    private String room;
    private LocalTime time;
    private char days[];
    private int capacity;

    public CourseOffering(char[] srcArray, int courseNumber, String courseName, String instructor, char[] section, String room, LocalTime time, char[] days, int capacity) {
        this.srcArray = srcArray;
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.instructor = instructor;
        this.section = section;
        this.room = room;
        this.time = time;
        this.days = days;
        this.capacity = capacity;
    }

    public char[] getSrcArray() {
        return srcArray;
    }

    public void setSrcArray(char[] srcArray) {
        this.srcArray = srcArray;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public char[] getSection() {
        return section;
    }

    public void setSection(char[] section) {
        this.section = section;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public char[] getDays() {
        return days;
    }

    public void setDays(char[] days) {
        this.days = days;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}




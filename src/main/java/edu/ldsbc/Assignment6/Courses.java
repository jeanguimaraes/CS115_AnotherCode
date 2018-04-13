package edu.ldsbc.Assignment6;

import java.util.ArrayList;

public class Courses {

    ArrayList<CourseOffering> list = new ArrayList<>();

    int searchByName(ArrayList<CourseOffering> list, String name)throws MyException {

        int start = 0;
        int end = list.size() - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (name == list.get(mid).getCourseName()) {
                return mid;
            }
            if (-1 == name.compareTo(list.get(mid).getCourseName())) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }


    int searchByNumber(int number, ArrayList<CourseOffering> list) throws MyException {

        int start = 0;
        int end = list.size() - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number == list.get(mid).getCourseNumber()) {
                return mid;
            }
            if (number < list.get(mid).getCourseNumber()) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        throw new MyException(-1);
    }
}


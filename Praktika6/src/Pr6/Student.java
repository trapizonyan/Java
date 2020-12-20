package Pr6;

import java.util.*;

public class Student {


    private int iDNumber;
    private int bal;


    public int compareTo(Student student) {
        if (student.iDNumber < iDNumber)
            return -1;
        else if (student.iDNumber > iDNumber)
            return 1;
        return 0;
    }

    public int compareToBall(Student student) {
        if (student.bal < bal)
            return -1;
        else if (student.bal > bal)
            return 1;
        return 0;
    }


    Student(int id) {
        this.iDNumber = id;


    }

    Student(int id, int bal) {
        this.iDNumber = id;

        this.bal = bal;
    }


    public int show_id() {
        return this.iDNumber;
    }

    public int show_bal() {
        return this.bal;
    }


}

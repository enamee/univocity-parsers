package com.univocity.parsers.labtest;

public class Garde {
    public String getGarde(double gpa) {
        if (gpa >= 3.5) {
            return "A";
        } else if (gpa >= 2.5 && gpa < 3.5) {
            return "B";
        } else if (gpa >= 1.5 && gpa < 2.5) {
            return "C";
        } else if (gpa >= 0.5 && gpa < 1.5) {
            return "D";
        } else {
            return "E";
        }
    }
}

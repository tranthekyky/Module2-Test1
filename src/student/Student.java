package student;

import java.util.Arrays;

public class Student {
    private String name;
    private int id  ; ;
    private double [] score ;
    private String gender;

    static private int count = 1;
    public Student(String name , double[] score , String gender){
        this.name = name;
        this.score = score;
        this.gender = gender;
        this.id = count++ ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double[] getScore() {
        return score;
    }

    public void setScore(double[] score) {
        this.score = score;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }
    public double getAverageStudent() {
        double sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        return sum / score.length;
    }

    @Override
    public String toString() {
        return "Student{" +
                " id = " + id +
                " name = '" + name + '\'' +
                ", score =" + Arrays.toString(score) +
                ", gender ='" + gender + '\'' +
                '}';
    }
}
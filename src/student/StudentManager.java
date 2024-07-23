package student;

import java.util.ArrayList;

public class StudentManager {
    private static Student [] listStudents ;
    private static int size ;
    public StudentManager() {
        listStudents = new Student[10];
    }
    public void addStudent(Student student) {
        listStudents[size] = student;
        size++;
    }
    public Student[] getListStudent() {
        return listStudents;
    }
    public int getSize() {
        return size;
    }
    public void editStudent(int index, Student newStudent) {
        if (checkID(index) == -1) {
            System.out.println("ID không tồn tại !");
        }else {
            for (int i = 0; i < size; i++) {
                if (listStudents[i].getId() == index) {
                    listStudents[i] = newStudent;
                    newStudent.setId(index);
                }
            }
        }

    }
    public int checkID(int id) {
        for (int i = 0; i < size; i++) {
            if (listStudents[i].getId() == id) {
                return i ;
            }
        }
        return -1;
    }
    public void deleteStudent(int index ) {
            for (int i = index - 1 ; i < size; i++) {
                listStudents[i] = listStudents[i + 1];
            }
            size--;
            for (int i = 0 ; i < size ; i++) {
                listStudents[i].setId(i + 1);
            }
    }
    public double sumScore () {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += listStudents[i].getAverageStudent() ;
        }
        return sum / size ;
    }
    public String maxAvgScore() {
        double max = 0;
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (listStudents[i].getAverageStudent() > max) {
                max = listStudents[i].getAverageStudent();
                index = i;
            }
        }
        String roundNumber = String.format("%.2f", max);
        return "Học sinh : " + listStudents[index].getName() + " - Tổng điểm : " + roundNumber ;
    }
    public Student searchID (int id) {
        return listStudents[id - 1];
    }
    public ArrayList<Student> searchName (String name) {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (listStudents[i].getName().toLowerCase().contains(name.toLowerCase())) {
                students.add(listStudents[i]);
            }
        }
        return students;
    }
    public void displayMenu() {
        System.out.println("1 - Hiển thị danh sách");
        System.out.println("2 - Thêm học sinh");
        System.out.println("3 - Xoá học sinh");
        System.out.println("4 - Sửa thông tin học sinh");
        System.out.println("5 - Tìm Kiếm học sinh theo ID");
        System.out.println("6 - Tìm kiếm học sinh theo tên");
        System.out.println("7 - Điểm trung bình sinh cao cao nhất");
        System.out.println("8 - Tổng điểm trung bình lớp");
        System.out.println("Nhấn hai số 00 để hiện thị MEMU yêu cầu");
    }


}
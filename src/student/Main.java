package student;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        Scanner number = new Scanner(System.in);
        StudentManager clazz = new StudentManager() ;
        double [] sc1 = {7,8,9} ;
        double [] sc2 = {9,10,7.5} ;
        Student st1 = new Student("Kỷ" , sc1 , "Nam") ;
        Student st2 = new Student("Hoàng" , sc2 , "Nam") ;
        clazz.addStudent(st1);
        clazz.addStudent(st2);
        System.out.println("Quản lý học sinh ");
        clazz.displayMenu();
        System.out.println("Nhập yêu cầu theo số : ");

        int choice = number.nextInt();
        do {
            switch (choice) {
                case 00 :
                    clazz.displayMenu();
                case 1:
                    for (int i = 0; i < clazz.getSize(); i++) {
                        System.out.println(clazz.getListStudent()[i]);
                    }
                    break;
                case 2:
                    System.out.println("Điền thông tin học sinh ");
                    System.out.println("Tên :");
                    String name = str.nextLine();
                    System.out.println("Giới tính");
                    String gender = str.nextLine();
                    System.out.println("3 Điểm số [ Toán , lý, Hoá ]");
                    double [] score = new double[3];
                    System.out.print("Toán : ");
                    score[0] = number.nextDouble();
                    System.out.print("Lý : ");
                    score[1] = number.nextDouble();
                    System.out.print("Hoá : ");
                    score[2] = number.nextDouble();
                    Student student = new Student(name , score, gender);
                    clazz.addStudent(student);
                    System.out.println("Thêm thành công");
                    break ;
                case 3:
                    System.out.println("Điền ID học sinh cần xoá ");
                    int id = number.nextInt();
                    clazz.deleteStudent(id);
                    System.out.println("Xoá thành công ");
                    break;
                case 4:
                    System.out.println("Nhập ID cần sửa ");
                    int id2 = number.nextInt();

                    do {
                        if (clazz.checkID(id2) != -1 ) {
                            System.out.println("Điền thông tin cần sửa");
                            System.out.println("Tên :");
                            String name2 = str.nextLine();
                            System.out.println("Giới tính");
                            String gender2 = str.nextLine();
                            System.out.println("3 Điểm số [ Toán , lý, Hoá ]");
                            double [] score2 = new double[3];
                            System.out.print("Toán : ");
                            score2[0] = number.nextDouble();
                            System.out.print("Lý : ");
                            score2[1] = number.nextDouble();
                            System.out.print("Hoá : ");
                            score2[2] = number.nextDouble();
                            Student student2 = new Student(name2 , score2, gender2);
                            clazz.editStudent(id2 , student2);
                            System.out.println("Sửa thông tin thành công");
                            break;
                        }else {
                            System.out.println("ID không tồn tại ! Vui lòng nhập lại :");
                        }
                        id2 = number.nextInt() ;
                    }while (clazz.checkID(id2) == - 1) ;
                    System.out.println("Điền thông tin cần sửa");
                    System.out.println("Tên :");
                    String name2 = str.nextLine();
                    System.out.println("Giới tính");
                    String gender2 = str.nextLine();
                    System.out.println("3 Điểm số [ Toán , lý, Hoá ]");
                    double [] score2 = new double[3];
                    System.out.print("Toán : ");
                    score2[0] = number.nextDouble();
                    System.out.print("Lý : ");
                    score2[1] = number.nextDouble();
                    System.out.print("Hoá : ");
                    score2[2] = number.nextDouble();
                    Student student2 = new Student(name2 , score2, gender2);
                    clazz.editStudent(id2 , student2);
                    System.out.println("Sửa thông tin thành công");

                    break;

                case 5 :
                    System.out.println("Nhập ID cần tìm");
                    int id3 = number.nextInt();
                    if (clazz.checkID(id3) != - 1) {
                        System.out.println(clazz.searchID(id3));;
                    }else {
                        do {
                            System.out.println("ID không tồn tại ! Vui lòng nhập lại : ");
                            id3 = number.nextInt();
                        }while (clazz.checkID(id3) == - 1) ;
                        System.out.println(clazz.searchID(id3));;
                    }
                    break;
                case 6 :
                    System.out.println("Điền kí tự tên cần tìm ");
                    String name3 = str.nextLine();
                    for (Student studentSearch : clazz.searchName(name3)) {
                        System.out.println(studentSearch);
                    }
                    break;
                case 7 :
                    System.out.println("Học sinh có điểm trung bình cao nhất là : ");
                    System.out.println(clazz.maxAvgScore()); ;
                    break;
                case 8 :
                    System.out.printf("Tổng điểm trung bình của lớp là : %.1f\n", clazz.sumScore());

                    break;
                default:
                    System.out.println("Vui lòng nhập lại số yêu cầu");

            }
            System.out.print("Nhập yêu cầu tiếp theo : ");
            choice = number.nextInt();

        }while (choice != 0);

    }



}
package homework.students;

import java.util.Scanner;

public class StudentDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) {

        boolean run = true;
        while (run) {
            System.out.println("please input " + EXIT + " for exit");
            System.out.println("please input " + ADD_STUDENT + " for add student");
            System.out.println("please input " + PRINT_ALL_STUDENTS + " for print all students");
            System.out.println("please input " + DELETE_STUDENT_BY_INDEX + " for delete student by index");
            System.out.println("please input " + PRINT_STUDENT_BY_LESSON + " for print student by lesson");
            System.out.println("please input " + PRINT_STUDENT_COUNT + " for print students count");
            System.out.println("please input " + CHANGE_STUDENT_LESSON + " for change student's lesson");

            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_ALL_STUDENTS:
                    studentStorage.print();
                    break;
                case DELETE_STUDENT_BY_INDEX:
                    deleteByIndex();
                    break;
                case PRINT_STUDENT_BY_LESSON:
                    printStudentsByLessonName();
                    break;
                case PRINT_STUDENT_COUNT:
                    System.out.println("students count: " + studentStorage.getSize());
                    break;
                case CHANGE_STUDENT_LESSON:
                    changeStudentLessonName();
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
    }

    private static void printStudentsByLessonName() {
        System.out.println("please input lesson name");
        String lessonName = scanner.nextLine();
        studentStorage.printStudentsByLessonName(lessonName);
    }

    private static void deleteByIndex() {
        studentStorage.print();
        System.out.println("please chose student index");
        int index = Integer.parseInt(scanner.nextLine());
        studentStorage.deleteByIndex(index);
    }

    private static void changeStudentLessonName() {
        studentStorage.print();
        System.out.println("please chose student index");
        int index = Integer.parseInt(scanner.nextLine());
        Student student = studentStorage.getStudentByIndex(index);
        if (student == null) {
            System.out.println("wrong Index");
            changeStudentLessonName();
        } else {
            System.out.println("please input new lesson name");
            String newLessonName = scanner.nextLine();
            if (newLessonName != null && !newLessonName.trim().equals("")) {
                student.setLesson(newLessonName.trim());
                System.out.println("lesson name changed");
            }
        }
    }

    private static void addStudent() {
        System.out.println("please input student`s name");
        String name = scanner.nextLine();
        System.out.println("please input student`s surname");
        String surname = scanner.nextLine();
        System.out.println("please input student`s age");
        String ageStr = scanner.nextLine();
        System.out.println("please input student`s phoneNumber");
        String phoneNumber = scanner.nextLine();
        System.out.println("please input student`s city");
        String city = scanner.nextLine();
        System.out.println("please input student`s lesson");
        String lesson = scanner.nextLine();

        int age = Integer.parseInt(ageStr);
        if (lesson != null) {
            lesson = lesson.trim();
        }
        Student student = new Student(name, surname, age, phoneNumber, city, lesson.trim());
        studentStorage.add(student);
        System.out.println("student created");
    }
}

package Pr6;

public class Main {
    public static void main(String[] args) {

        Sort a = new Sort();
        Student students[] = new Student[5];
        students[0] = new Student(123);
        students[1] = new Student(2);
        students[2] = new Student(234);
        students[3] = new Student(936);
        students[4] = new Student(11);
        a.sort_ins(students);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].show_id());
        }
        System.out.println("==================\n");

        Student students2[] = new Student[5];
        students2[0] = new Student(123, 5);
        students2[1] = new Student(2,2);
        students2[2] = new Student(234,4);
        students2[3] = new Student(936,3);
        students2[4] = new Student(11,1);
        a.Qsort(students2, 0, students2.length - 1);

        for (int i = 0; i < students2.length; i++) {
            System.out.println(students2[i].show_bal());
        }
        System.out.println("==================\n");


        Student students3[] = new Student[5];
        students3[0] = new Student(123);
        students3[1] = new Student(2);
        students3[2] = new Student(234);
        students3[3] = new Student(936);
        students3[4] = new Student(11);

        Student students4[] = new Student[5];
        students4[0] = new Student(1233);
        students4[1] = new Student(2444);
        students4[2] = new Student(2345);
        students4[3] = new Student(9365);
        students4[4] = new Student(1166);

        Student students5[] = new Student[students3.length + students4.length];
        for (int i = 0; i < students3.length; i++) {
            students5[i] = students3[i];
        }
        for (int i = 0; i < students4.length; i++) {
            students5[i + students3.length] = students4[i];
        }


        a.mergeSort(students5, students5.length);
        for (int i = 0; i < students5.length; i++) {
            System.out.println(students5[i].show_id());
        }
        System.out.println("==================\n");


    }
}
package Lesson_8;

public class StudentMain {
    public static void main(String[] args) {
        Student st=new Student();
        st.name="Elnur";
        st.grade=84;
        st.isgraduating=(st.grade>=50);
        System.out.println("Student details");
        System.out.println("Student name "+st.name);
        System.out.println("Student grade "+st.grade);
       st.GradeorPass(st.isgraduating);
    }
}

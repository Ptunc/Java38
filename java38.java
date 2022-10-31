package Java38;

public class java38 {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "Mat101", "MAT", 0, 0, null);
        Course fizik = new Course("Fizik", "FZK101", "FZK", 0, 0, null);
        Course kimya = new Course("Kimya", "KMY101", "KMY", 0, 0, null);

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");
    
        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "140144015", 4, mat, fizik, kimya);
        s1.addVizeExamNote(50, 20,40);
        s1.addFinalExamNote(70, 40,80);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "2211133", 4, mat, fizik, kimya);
        s2.addVizeExamNote(100,50,40);
        s1.addFinalExamNote(90, 40,20);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", "221121312", 4, mat, fizik, kimya);
        s3.addVizeExamNote(50,20,40);
        s1.addFinalExamNote(80, 60,10);
        s3.isPass();
    }
}

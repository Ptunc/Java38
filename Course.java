package Java38;

public class Course {
    String name;
    String code;
    String prefix;
    int vizeNote;
    int finalNote;
    Teacher courseTeacher;

    public Course(String name, String code, String prefix, int vizeNote, int finalNote, Teacher courseTeacher) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.vizeNote = 0;
        this.finalNote = 0;
    }

    public void addTeacher(Teacher t) {
        if(this.prefix.equals(t.branch)){
            this.courseTeacher = t;
            System.out.println("İşlem Başarılı.");
        }else{
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
        
    }
    public void printTeacher() {
        if(courseTeacher != null){
            System.out.println(this.name + " dersinin akademisyeni: " + courseTeacher.name);
        }else{
            System.out.println(this.name + " dersine akademisyen atanmamıştır.");
        }
    }
}

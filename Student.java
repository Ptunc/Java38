package Java38;

public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;

    Student(String name, String stuNo, int classes, Course mat, Course fizik, Course kimya){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAverage();
        this.isPass = false;
    }

    public void addVizeExamNote(int mat, int fizik, int kimya) {
        if(mat >= 0 && mat <= 100) this.mat.vizeNote = mat;
        if(fizik >= 0 && fizik <= 100) this.fizik.vizeNote = fizik;
        if(kimya >= 0 && kimya <= 100) this.kimya.vizeNote = kimya;
        
    }
    public void addFinalExamNote(int mat, int fizik, int kimya) {
        if(mat >= 0 && mat <= 100) this.mat.finalNote = mat;
        if(fizik >= 0 && fizik <= 100) this.fizik.finalNote = fizik;
        if(kimya >= 0 && kimya <= 100) this.kimya.finalNote = kimya;
        
    }

    public void isPass() {
        if(this.mat.vizeNote == 0 || this.fizik.vizeNote == 0 || this.kimya.vizeNote == 0){
            System.out.println("Notlar tam olarak girilmemiş.");
        }else{
            this.isPass = isCheckPass();
            printNote();
            System.out.println("ortalama: " + this.average);
            if (this.isPass){
                System.out.println("Sınfı Geçti. ");
            }else{
                System.out.println("Sınıfta kaldı.");
            }
        }        
    }
    public void calcAverage() {
        this.average = (this.fizik.vizeNote*0.2 + this.fizik.finalNote*0.8 + this.kimya.vizeNote*0.2 + this.kimya.finalNote*0.8 + this.mat.vizeNote*0.2 + this.mat.finalNote*0.8) / 3;       
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;      
    }

    public void printNote() {
        System.out.println("=======================");
        System.out.println("öğrenci : " + this.name);
        System.out.println("matematik vize ve final notu : " + this.mat.vizeNote + " , " + this.mat.finalNote);
        System.out.println("Fizik vize ve final notu : " + this.fizik.vizeNote + " , " + this.fizik.finalNote);
        System.out.println("kimya vize ve final notu : " + this.kimya.vizeNote + " , " + this.kimya.finalNote);
    }
}

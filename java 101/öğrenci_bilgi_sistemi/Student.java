package öğrenci_bilgi_sistemi;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fiz;
    Course kim;
    Course verbal1;
    Course verbal2;
    Course verbal3;

    double avarage;
    boolean isPass;

    Student(String name , String stuNo , int classes , Course mat , Course fiz , Course kim , Course verbal1 , Course verbal2 , Course verbal3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fiz = fiz;
        this.kim = kim;
        this.verbal1 = verbal1;
        this.verbal2 = verbal2;
        this.verbal3 = verbal3;
        calcAvarage();
        this.isPass = false;

    }
    public void addBulExampleNote(int mat , int fiz, int kim) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (fiz >= 0 && fiz <= 100) {
            this.fiz.note = fiz;
        }
        if (kim >= 0 && kim <= 100) {
            this.kim.note = kim;
        }
    }
    public void addVerbalNote(int verbal1 , int verbal2 , int verbal3) {
        if (verbal1 >= 0 && verbal1 <= 100) {
            this.verbal1.note = verbal1;
        }
        if (verbal2 >= 0 && verbal2 <= 100) {
            this.verbal2.note = verbal2;
        }
        if (verbal3 >= 0 && verbal3 <= 100) {
            this.verbal3.note = verbal3;
        }


    }
    public void isPass() {
        if (this.mat.note == 0 || this.fiz.note == 0 || this.kim.note == 0 || this.verbal1.note ==0 || this.verbal2.note == 0 || this.verbal3.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
    public void calcAvarage() {
        this.avarage = (((this.verbal1.note+this.verbal2.note+this.verbal3.note)/6)+((this.mat.note+this.fiz.note+this.kim.note)/6));
    }
    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fiz.note);
        System.out.println("Kimya Notu : " + this.kim.note);
        System.out.println("Matematik sözlü notu : " + this.verbal1.note);
        System.out.println("Fizik sözlü notu : " + this.verbal2.note);
        System.out.println("Kimya sözlü notu : " + this.verbal3.note);

    }
}
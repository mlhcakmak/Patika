package öğrenci_bilgi_sistemi;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note = 0;





    public Course(String name , String code , String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;

    }
    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.print("işlem başarılı");
        }
        else {
            System.out.print(t.name+" akademisyeni bu dersi vermemektedir.");
        }

    }
    public void printTeacher(){
        if (courseTeacher != null){
            System.out.print(this.name+ "dersini "+courseTeacher.name+" vermektedir.");

        }
        else
            System.out.println(this.name+" dersine akademisyen atanmamıştır.");
    }

}
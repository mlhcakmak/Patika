package öğrenci_bilgi_sistemi;

public class Main {
    public static void main(String[] args) {
        Course mat = new Course("matematik","mat101","MAT");
        Course fiz = new Course("fizik","fiz101","FİZ");
        Course kim = new Course("kimya","kim101","KİM");

        Course verbal1 = new Course("matematik","mat101","MAT");
        Course verbal2 = new Course("fizik","fiz101","FİZ");
        Course verbal3 = new Course("kimya","kim101","KİM");


        Teacher t1 = new Teacher("Mahmut hoca","90550000000","MAT");
        Teacher t2 = new Teacher("Murat hoca","90550000001","FİZ");
        Teacher t3 = new Teacher("Harun hoca","90550000002","KİM");

        mat.addTeacher(t1);
        fiz.addTeacher(t2);
        kim.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "4", 140144015, mat, fiz,kim,verbal1,verbal2,verbal3);
        s1.addBulExampleNote(50,20,40);
        s1.addVerbalNote(78,95,87);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "4", 2211133, mat, fiz, kim, verbal1 , verbal2 , verbal3);
        s2.addBulExampleNote(100,50,40);
        s2.addVerbalNote(100, 100,100);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", "4", 221121312, mat, fiz, kim, verbal1 , verbal2 , verbal3);
        s3.addBulExampleNote(50,20,40);
        s3.addVerbalNote(70,90,80);
        s3.isPass();

    }
}
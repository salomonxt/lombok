public class Main {
    public static void main(String[] args) {
        Student student = new Student("Max", 20);
        System.out.println(student.getName()); // Ausgabe: Max
        student.setAge(21);
        System.out.println(student.getAge()); // Ausgabe: 21
    }
}

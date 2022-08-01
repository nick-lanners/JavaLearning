package src;

public class Main {

    public static void main(String[] args) {
        StudentProfile nick = new StudentProfile("Nick", "Lanners", 2012, 3.9, "Music Education");
        StudentProfile emma = new StudentProfile("Emma", "Josey", 2014, 4.0, "Communication");

        nick.delayGraduation();
        System.out.println(nick.expectedYearToGraduate);
    }
}

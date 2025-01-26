public class Teacher {


    String name, gender;
    int id;

    Teacher(String n, String g, int i) {

        name = n;
        gender = g;
        id = i;
    }

    Teacher(String s, int h) {
        name = s;
        id = h;
    }

    Teacher(String t) {
        name = t;
    }


    void displayInformation() {
        System.out.println("Name = " + name);
        System.out.println("Gender = " + gender);
        System.out.println("ID = " + id);
    }
}
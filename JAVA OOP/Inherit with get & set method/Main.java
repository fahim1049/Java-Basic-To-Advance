public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher();

        t1.setName("Fahim Nur");
        t1.setAge(24);
        t1.setQualification("Bsc In SWE");


        System.out.println("Name: "+t1.getName());
        System.out.println("Age: "+t1.getAge());
        System.out.println("Qualification: "+t1.getQualification());


    }
}
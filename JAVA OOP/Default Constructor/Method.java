public class Method {
    String name,gender;
    int phone;


    Method(){
        System.out.println("Empty");
    }
    Method(String n,String g,int p){

        name = n;
        gender =  g;
        phone  = p;


    }

    void displayInformation(){
        System.out.println("Name = " +name);
        System.out.println("Gender = "+gender);
        System.out.println("Phone Number = "+phone);

        }

    }



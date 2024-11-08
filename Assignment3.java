/*
 * Assignment-3 (User Input)
 * step 1: create a class called Product
 * step 2: create a main method
 * step 3: declare variables: id, title, price, description, category
 * step 4: get user input for each variables
 * step 5: print the variables
 */

import java.util.Scanner;
public class Assignment3 {
    public static void main(String []args){
        Scanner Input = new Scanner(System.in);
        //Scanner Inputs = new Scanner (System.in);

        /*
        In this section we can use one Scaneer class if we use after print MyId input then we use
       { Input.nextline() } so that can't skeep or moving new line

        another option is Used diffrent Scanner class so that it execute with different variable
         */

        int MyId;
        String price,description,category,Title;

        System.out.print("Enter Your Id : ");
        MyId = Input.nextInt();

        Input.nextLine(); // Consume the newline character left by nextInt()
        System.out.print("Enter Your Price :");
        price = Input.nextLine();

        System.out.print("Enter Your Title: ");
        Title = Input.nextLine();

        System.out.print("Enter Your Description : ");
        description = Input.nextLine();

        System.out.print("Enter Your Category :");
        category = Input.nextLine();

        System.out.println("Your Id is: "+MyId);
        System.out.println("My Title: "+Title);
        System.out.println("Myn Phone Price: "+price);
        System.out.println("Product description is: "+description);
        System.out.println("Product Category: "+category);
    }

}

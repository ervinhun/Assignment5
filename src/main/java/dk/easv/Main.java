package dk.easv;

import dk.easv.bll.MenuSchool;
import dk.easv.bll.Person;
import dk.easv.Menu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {


        System.out.println("ID \t Name \t\t email");
        PersonController person = new PersonController();


        for (Person listing : person.getAllPersons()) {
            System.out.println(listing);
        }
        person.operation();

    }
}
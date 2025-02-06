package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Creating person Objects
        Person person1 = new Person("John Doe",30);
        Person person2 = new Person("Jane Doe",28);
        Person person3 = new Person("John Doe",30);

//Printing the details of persons
        System.out.println("Person 1: "+person1.getName()+ ",Age: "+person1.getAge());
        System.out.println("Person 2: "+person2.getName()+ ",Age: "+person2.getAge());
        System.out.println("Person 3: "+person3.getName()+ ",Age: "+person3.getAge());
        // Step 3: Compare person1 with person2 (using equals method)
        if(person1.equals(person2)){
            System.out.println("Person 1 equals Person 2");
        }else {
            System.out.println("Person 1 NOT equals Person 2");
        }
        // Step 4: Compare person1 with person3 (using equals method)
        if(person1.equals(person3)){
            System.out.println("Person 1 equals Person 3");
        }else{
            System.out.println("Person 1 NOT equals Person 3");
        }

// Step 5: Print hash codes of the persons
        System.out.println("Hash Code of person1: " +
                person1.hashCode());
        System.out.println("Hash Code of person2: " +
                person2.hashCode());
        System.out.println("Hash Code of person3: " +
                person3.hashCode());
    }
}
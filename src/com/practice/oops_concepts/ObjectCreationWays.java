package com.practice.oops_concepts;

// Java program to Illustrate Creation of Object
// Using new keyword
public class ObjectCreationWays implements Cloneable {
    String str="Hello world";
    public static void main(String[] args) {

        // As usual and most generic used we will
        // be creating object of class inside main()
        // using new keyword
        ObjectCreationWays obj = new ObjectCreationWays();
        System.out.println("Object creation using new keyword:");
        System.out.println(obj.str);


        try{
            // Creating object of main class
            // using instance method
            Class cls = Class.forName("com.practice.oops_concepts.ObjectCreationWays");
            ObjectCreationWays obj1 = (ObjectCreationWays)cls.newInstance();
            System.out.println("====================================");
            System.out.println("Object creation using new instance method:");
            System.out.println(obj1.str);

        }catch (ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        try {
            ObjectCreationWays obj2 = (ObjectCreationWays)obj.clone();
            System.out.println("====================================");
            System.out.println("Object creation using clone method:");
            System.out.println(obj2.str);
        }catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }

        //Method 4: Using deserialization
        //Whenever we serialize and then deserialize an object, JVM creates a separate object.
        // In deserialization, JVM doesn’t use any constructor to create the object.
        // To deserialize an object we need to implement the Serializable interface in the class.

        //Method 5: Using newInstance() method of the constructor class
        //This is similar to the newInstance() method of a class.
        // There is one newInstance() method in the java.lang.reflect.Constructor class which we can use to create objects.
        // It can also call the parameterized constructor, and private constructor by using this newInstance() method. Both newInstance() methods are known as reflective ways to create objects.
        // In fact newInstance() method of Class internally uses newInstance() method of Constructor class.

    }
}

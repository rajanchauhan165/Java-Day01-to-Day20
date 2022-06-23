package Day01;
/**
 Q1:
 JDK is primarily used for code execution and has prime functionality of development.
 JRE is majorly responsible for creating environment for code execution.
 JVM on other hand specifies all the implementations and responsible to provide these implementations to JRE.


 Q2:
 Java Standard Edition - This is the core Java platform, it is a specification, which contains the core libraries to develop standalone, networking, database, GUI multithreaded types of applications. In addition to the core API, the Java SE platform consists of the virtual machine,development tools, deployment technologies and other class libraries and toolkit commonly used in Java application.

 Java Enterprise Edition - The Java EE platform provides an API and runtime environment for developing and running large-scale, multi-tiered, scalable, reliable, and secure network applications.

 Java Micro Edition - It is a subset of Java SE, designed used for microdevices and embedded development like mobile phones, sensors, micro-controller, TV set-top boxes etc.

 Q4:
 Simple:- Java is easy to learn and its syntax is quite simple, clean and easy to
 understand.
 Object-Oriented:- Java is object-oriented, it supports all the OOPS
 characteristics.
 Portable and Platform Independent:- Java source code is compiled and converted into bytecode. this bytecode can run on multiple platforms.
 Secure:- JAVA has provided an implicit component inside JVM in the form of a
 “Security Manager”  to provide implicit security against malicious code. Java has
 provided very good predefined implementations for almost all well-known network
 security.
 Multithreaded:- Java supports multithreading to enhance performance. by using
 this we can execute multiple functionalities simultaneously.

 **/
//Q5:
public class Main {
    public static void main(String[] args) {
        String name = "Rajan Chauhan";
        int age = 22;
        String gender = "Male";
        String mobile = "9852346515";

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Mobile: "+mobile);
    }
}

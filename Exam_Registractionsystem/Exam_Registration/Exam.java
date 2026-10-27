package Exam_Registration;

import javax.management.relation.InvalidRelationIdException;
import java.util.Scanner;

public class Exam {

    static void validateRegistration(

        String studentId,
        String name,
        int age,
        double examMarks,
        int numberOfSubjects)

        throws InvalidRelationIdException{
        if (studentId.trim().isEmpty()){
            throw new InvalidRelationIdException("student ID cannot be empty.");

        }
        if (name.trim().isEmpty()){
            throw new InvalidRelationIdException("student Name cannot be empty");
        }
        if (age<18){
            throw new InvalidRelationIdException("age must bee at least 18.");
        }
        if (examMarks < 0 || examMarks > 100){
            throw new InvalidRelationIdException("exma marks must bee between " +
                    "0 and 100. ");
        }
        if (numberOfSubjects <  1 || numberOfSubjects > 5){
            throw new InvalidRelationIdException("Maximum allowed subject is 5.");
        }

    }

    static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("============ EXAM REGISTRACTION SYSTEM =====");

        try {
            System.out.println(" ENTER STUDENT ID :");
            String studentId  =input.nextLine();

            System.out.println(" ENTER STUDENT NAME :");
            String Name = input.nextLine();

            System.out.println(" ENTER STUDENT AGE :");
            int age = Integer.parseInt(input.nextLine());

            System.out.println(" ENTER STUDENT EXAM MARKS :");
            double examMarks =
                    Double.parseDouble(input.nextLine());

            System.out.println("ENTER NUMBER OF SUBJECT :");
            int numberOfSubjects =
                    Integer.parseInt(input.nextLine());
            validateRegistration(
                    studentId ,Name , age , examMarks , numberOfSubjects);
            System.out.println("/nRegistraction successful !");
            System.out.println("student :" + Name);
            System.out.println("Registred subject : " + numberOfSubjects);

    }catch (InvalidRelationIdException e){
            System.out.println("/nRegistraction failed !");
            System.out.println(" Error:"  + e.getMessage());

        }catch (NumberFormatException e){
            System.out.println("/nRegistraction failed !");
            System.out.println("Error: please enter valid number");
        }finally {
            System.out.println("/nRegistraction  attemp completet.");
            input.close();
        }
    }


    }



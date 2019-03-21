package dev;

public class Student {
    int id;
    String lastName, firstName, secondName;
    String birhtYear, birthMonth, birthDay;

    public String dateBirth(){
        return birthDay + "-" + birthMonth + "-" + birhtYear;
    }

    public String getFio(){
        return lastName + " " + firstName + " " + secondName;
    }

    public static void main (String[] args){
        Student firstStudent = new Student();
        Student secondStudent =new Student();
        firstStudent.id = 1;
        firstStudent.lastName = "Иванов";
        firstStudent.firstName = "Иван";
        firstStudent.secondName = "Иванович";
        firstStudent.getFio();
        firstStudent.birhtYear = "1994";
        firstStudent.birthMonth = "04";
        firstStudent.birthDay = "27";
        firstStudent.dateBirth();
        secondStudent.id = 2;
        secondStudent.lastName = "Петров";
        secondStudent.firstName = "Пётр";
        secondStudent.secondName = "";
        secondStudent.getFio();
        secondStudent.birhtYear = "1995";
        secondStudent.birthMonth = "06";
        secondStudent.birthDay = "16";
        secondStudent.dateBirth();
        System.out.println( "ФИО студента: " + firstStudent.getFio() + "\nДата рождения: " + firstStudent.dateBirth() );
        System.out.println( "ФИО студента: " + secondStudent.getFio() + "\nДата рождения: " + secondStudent.dateBirth() );
    }

}

package studentform;

import employeeportal.Gender;

public class Student {
    String studentName;
    int studentAge;
    Gender studentGender;
    String studentStream;
    int studentRollnumber;


    public Student(String studentName, int studentAge, Gender studentGender, String studentStream, int studentRollnumber) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGender = studentGender;
        this.studentStream = studentStream;
        this.studentRollnumber = studentRollnumber;
    }


    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return this.studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public Gender getStudentGender() {
        return this.studentGender;
    }

    public void setStudentGender(Gender studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentStream() {
        return this.studentStream;
    }

    public void setStudentStream(String studentStream) {
        this.studentStream = studentStream;
    }

    public int getStudentRollnumber() {
        return this.studentRollnumber;
    }

    public void setStudentRollnumber(int studentRollnumber) {
        this.studentRollnumber = studentRollnumber;
    }

    @Override
    public String toString() {
        return "{" +
            " studentName='" + getStudentName() + "'" +
            ", studentAge='" + getStudentAge() + "'" +
            ", studentGender='" + getStudentGender() + "'" +
            ", studentStream='" + getStudentStream() + "'" +
            ", studentRollnumber='" + getStudentRollnumber() + "'" +
            "}";
    }
    

    
}

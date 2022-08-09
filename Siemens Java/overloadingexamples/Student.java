package overloadingexamples;

//calculate total marks of a student 

public class Student {
    private String studentId;
    private boolean studentEnrolledInElective;
    private int[] studentMarks;
    private int studentSubjects;


    public Student(String studentId, boolean studentEnrolledInElective, int studentSubjects) {
        this.studentId = studentId;
        this.studentEnrolledInElective = studentEnrolledInElective;
        this.studentSubjects = studentSubjects;
    }

    public Student(String studentId, boolean studentEnrolledInElective, int[] studentMarks, int studentSubjects) {
        this.studentId = studentId;
        this.studentEnrolledInElective = studentEnrolledInElective;
        this.studentMarks = studentMarks;
        this.studentSubjects = studentSubjects;
    }


    public String getStudentId() {
        return this.studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public boolean isStudentEnrolledInElective() {
        return this.studentEnrolledInElective;
    }

    public boolean getStudentEnrolledInElective() {
        return this.studentEnrolledInElective;
    }

    public void setStudentEnrolledInElective(boolean studentEnrolledInElective) {
        this.studentEnrolledInElective = studentEnrolledInElective;
    }

    public int[] getStudentMarks() {
        return this.studentMarks;
    }

    public void setStudentMarks(int[] studentMarks) {
        this.studentMarks = studentMarks;
    }

    public int getStudentSubjects() {
        return this.studentSubjects;
    }

    public void setStudentSubjects(int studentSubjects) {
        this.studentSubjects = studentSubjects;
    }


    //if a student is enrolled for elective, they get a 50 marks bonus

    //for regular students,bonus marks is 10% of their total for regular subjects
    void calculateTotalMarks(){
        int total=0;
        if(this.studentEnrolledInElective){
            total += 50;
        }

        try{
            //for every integer value "score" inside this object's studentMarks array, do SOMETHING
            for(int score : this.studentMarks){
                total+=score;
        }

        //this line is reached when there is no exception
        System.out.println("The total marks for this student with ID" + this.studentId+" is "+total);

    }catch(NullPointerException ex){
        System.out.println("Cannot calculate marks as array os marks is empty!!");
    }

}



//WHEN YOU CHANGE PROGRAMMING LANGUAGE, CHANGE YOUR STYLE OF CODING!
//WHEN YOU CHANGE PRORAMMING PARADIGM, CHANGE ,YOUR APPROACH TO PROBLEM SOLVING


    //For some students, a seperate "SOCIAL WORK" marks can be added if applicable

    public static void main(String[] args) {

        Student s1 = new Student("st101", false,new int[]{40,43,44,45,47}, 5);

        Student s2 = new Student("st102", true, 4);
        s2.calculateTotalMarks();//throw an exception

        s2.setStudentMarks(new int[]{41,42,43,45});
        s2.calculateTotalMarks();//no exception this time

        
    }
    
}



class Student{
    private String studentId;
    private String studentCourse;
    

    public Student(String studentId, String studentCourse) {
        this.studentId = studentId;
        this.studentCourse = studentCourse;
    }


    public String getStudentId() {
        return this.studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentCourse() {
        return this.studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }


    

}
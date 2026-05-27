public class Students {
    int rollNo;
    String studentName;

    Students(int rollNo, String studentName) {
        this.rollNo = rollNo;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Students student = (Students) obj;

        return this.rollNo == student.rollNo;
    }
}


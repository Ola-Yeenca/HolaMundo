public class Degree {
    private final String subjectName;
    private final int subjectCode;
    private final String course;

    Degree(String subjectName, String subjectCode, String course) {
        this.subjectName = subjectName;
        this.subjectCode = Integer.parseInt(subjectCode);
        this.course = course;


        System.out.println("Constructor called successfully");
    }

    public static void main(String[] args) {
        Degree degree = new Degree("Mathematics", "0012", "Course 1");

        System.out.println("Subject Name: " + degree.subjectName);
        System.out.println("Subject code: " + degree.subjectCode);
        System.out.println("Course " + degree.course);
    }
}

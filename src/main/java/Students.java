public class Students {

    public static String[] createStudentsArray(int numberStudents){
        String []students = new String[numberStudents];

        for(int i = 0; i<numberStudents; i++){
            students[i]="Student "+(i+1);
        }

        return students;
    }

}

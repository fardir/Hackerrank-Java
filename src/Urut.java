import java.util.*;

class Sort implements Comparator{
    class Student{
        private int id;
        private String fname;
        private double cgpa;
        public Student(int id, String fname, double cgpa) {
            super();
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }
        public int getId() {
            return id;
        }
        public String getFname() {
            return fname;
        }
        public double getCgpa() {
            return cgpa;
        }
    }

    public int compare(Object o1, Object o2){
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        if (s1.getCgpa()==s2.getCgpa())
            return s1.getFname().compareTo(s2.getFname());
        else if (s1.getCgpa() < s2.getCgpa())
            return 1;
        else
            return -1;
    }
}

public class Urut{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

//            Student st = new Student(id, fname, cgpa);
//            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList, new Sort());
        for(Student st: studentList){
//            System.out.println(st.getFname());
        }
    }
}




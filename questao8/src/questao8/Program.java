package questao8;

import java.util.ArrayList;

public class Program {
	public static void main(String[] args) { 
        ArrayList<Grades> grades = new ArrayList<>();
        grades.add(new Grades(1, "CáculoII"));
        grades.add(new Grades(6, "Filosofia"));
        grades.add(new Grades(8, "MCCC"));
        grades.add(new Grades(5, "ED"));
        grades.add(new Grades(9, "POO"));

        Student student = new Student("Maria Chiquinha", "14219030", grades);
        System.out.println(student);
    }    
}

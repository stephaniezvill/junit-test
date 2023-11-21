import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double getGradeAverage() {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
    public void updateGrade(int index, int newGrade) {
        if (index >= 0 && index < grades.size()) {
            grades.set(index, newGrade);
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        public void deleteGrade(int index) {
            if (index >= 0 && index < grades.size()) {
                grades.remove(index);
            } else {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
        }
    }


}


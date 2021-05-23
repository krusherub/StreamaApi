import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //task1(2);
     //   task2();
        task3();
    }
    public static void task1(int numberPlaces){
        Abiturient sasha = new Abiturient("Brazhnik", 99);
        Abiturient vitalya = new Abiturient("Krivonosyk", 80);
        Abiturient vanya = new Abiturient("Devitskyi", 50);
        Abiturient arsen = new Abiturient("Arsen", 70);
        Abiturient vovk = new Abiturient("Vovk", 34);

        ArrayList<Abiturient> abiturients = new ArrayList<>();
        abiturients.add(sasha);
        abiturients.add(vitalya);
        abiturients.add(vanya);
        abiturients.add(arsen);
        abiturients.add(vovk);

        Comparator<Abiturient> bestAbit = (abit1, abit2) -> Integer.compare(abit1.getPoints(), abit2.getPoints());
        Predicate<Abiturient> isSuitable = (abit) -> abit.getPoints()>60;
        abiturients.stream()
                .filter(isSuitable)
                .sorted(bestAbit.reversed())
                .limit(numberPlaces)
                .forEach(System.out::println);

    }
    public static void task2(){
        Student sasha = new Student("Sasha", "Brazhnik", 1231,22);
        Student vitalya = new Student("Vitaly", "Krivonosyuk", 12321,92);
        Student ivan = new Student("Ivan", "Devitskyi", 10231,68);
        Student vlad  = new Student("Vladislav", "Bardin", 12341,62);

        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Faculty> faculties = new ArrayList<>();
        students.add(sasha);
        students.add(vitalya);
        students.add(ivan);
        students.add(vlad);

        Faculty faculty = new Faculty("FICS",students);
        faculties.add(faculty);

        Institute kpi = new Institute("KPI",faculties);

        var students1 = new ArrayList<Student>();
        kpi.getFaculties().forEach(f -> students1.addAll(f.getStudents()));

        double averageInstitute = students1.stream()
                .mapToDouble(x -> x.getAverage())
                .summaryStatistics()
                .getAverage();

        students1.stream()
                .filter(s -> s.getAverage() > averageInstitute)
                .forEach(System.out::println);
    }
    public static void task3(){
        Abiturient sasha = new Abiturient("Brazhnik", 99);
        Abiturient vitalya = new Abiturient("Krivonosyk", 80);
        Abiturient vanya = new Abiturient("Devitskyi", 50);
        Abiturient arsen = new Abiturient("Arsen", 70);
        Abiturient vovk = new Abiturient("Vovk", 34);

        ArrayList<Abiturient> abiturients = new ArrayList<>();
        abiturients.add(sasha);
        abiturients.add(vitalya);
        abiturients.add(vanya);
        abiturients.add(arsen);
        abiturients.add(vovk);

        Predicate<Abiturient> nonSuit = (abit) -> abit.getPoints()<60;
        abiturients.stream()
                .filter(nonSuit)
                .forEach(System.out::println);
    }
}

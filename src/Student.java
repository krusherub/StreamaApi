public class Student {
    private String name;
    private String surname;
    private int book;
    private double average;

    public Student(String name, String surname, int book, double average) {
        this.name = name;
        this.surname = surname;
        this.book = book;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBook() {
        return book;
    }

    public void setBook(int book) {
        this.book = book;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", book=" + book +
                ", average=" + average +
                '}';
    }
}

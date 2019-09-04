package HW4.composite;

public class SingleExercise implements Exercise{
    private int number1;
    private int number2;

    public SingleExercise(int number1,int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public void plot() {
        System.out.println("Задача: "+number1+" + "+number2+" =");
    }

    @Override
    public String getString() {
        return "Задача: "+number1+" + "+number2;
    }
}


import HW4.composite.AnnualExam;
import HW4.composite.Exercise;
import HW4.composite.SingleExercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        final int min = 0;
        final int max = 1000;


        Exercise exercise1 = new SingleExercise(rnd(min,max),rnd(min,max));
        Exercise exercise2 = new SingleExercise(rnd(min,max),rnd(min,max));
        Exercise exercise3 = new SingleExercise(rnd(min,max),rnd(min,max));
        Exercise exercise4 = new SingleExercise(rnd(min,max),rnd(min,max));
        Exercise exercise5 = new SingleExercise(rnd(min,max),rnd(min,max));

        List<Exercise> exercises = new ArrayList<>();
        exercises.add(exercise1);
        exercises.add(exercise2);
        exercises.add(exercise3);
        exercises.add(exercise4);

        Exercise annualExam = new AnnualExam(exercises);
        annualExam.plot();
        exercise5.plot();
    }
    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}




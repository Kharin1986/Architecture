package HW4.composite;

import java.util.List;

public class AnnualExam implements Exercise {
    private List<Exercise> exerciseList;

    public AnnualExam(List<Exercise> exerciseList) {
        this.exerciseList = exerciseList;
    }

    @Override
    public void plot() {
        for (Exercise exercise : exerciseList) {
            exercise.plot();
        }
    }

    @Override
    public String getString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Exercise exercise : exerciseList) {
            stringBuilder
                    .append(exercise.getString())
                    .append("\n");
        }
        return stringBuilder.toString();
    }
}

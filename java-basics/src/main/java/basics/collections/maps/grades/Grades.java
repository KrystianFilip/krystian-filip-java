package basics.collections.maps.grades;

import java.util.Arrays;

public class Grades {
    Double mathematics;
    Double physics;
    Double chemistry;
    Double foreignLanguage;
    Double biology;

    public Grades(Double mathematics, Double physics, Double chemistry, Double foreignLanguage, Double biology) {
        this.mathematics = mathematics;
        this.physics = physics;
        this.chemistry = chemistry;
        this.foreignLanguage = foreignLanguage;
        this.biology = biology;
    }

    public Double getMathematics() {
        return mathematics;
    }

    public Double getPhysics() {
        return physics;
    }

    public Double getChemistry() {
        return chemistry;
    }

    public Double getForeignLanguage() {
        return foreignLanguage;
    }

    public Double getBiology() {
        return biology;
    }
    public Double getAverage() {
        return (mathematics + physics + chemistry + foreignLanguage + biology) / 5;
    }

    @Override
    public String toString() {
        return "[" + mathematics + "/" + physics + "/" +
                chemistry + "/" + foreignLanguage + "/" + biology + "]";
    }
}

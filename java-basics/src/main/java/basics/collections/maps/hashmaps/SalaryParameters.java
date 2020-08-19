package basics.collections.maps.hashmaps;
/* This will be our VALUE object in HashMap with public constructor, attributes and toString method */
public class SalaryParameters {
    Double baseSalary;
    Double regulatedBonus;
    Double ceoBonus;
    Double functionAddSalary;

    public SalaryParameters(Double baseSalary, Double regulatedBonus, Double ceoBonus, Double functionAddSalary) {
        this.baseSalary = baseSalary;
        this.regulatedBonus = regulatedBonus;
        this.ceoBonus = ceoBonus;
        this.functionAddSalary = functionAddSalary;
    }
    public String toString() {
        return baseSalary + " + " + regulatedBonus + " + "
                + ceoBonus + " + " + functionAddSalary;
    }
}

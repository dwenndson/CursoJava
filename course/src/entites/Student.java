package course.src.entites;

public class Student {
    public String name;
    public double n1, n2, n3;

    public String finalNota () {
        double nota = n1 + n2 + n3;
        if( nota < 60) {
            nota = (nota - 60) * -1;
            return "FINAL GRADE = " .concat(String.valueOf(nota)).concat("\n").concat("FAILED").concat("\n")
            .concat("MISSING ").concat(String .valueOf(nota)).concat(" POINTS");
        }
        return "FINAL GRADE = " .concat(String.valueOf(nota)).concat("\n").concat("PASS");
    }
}

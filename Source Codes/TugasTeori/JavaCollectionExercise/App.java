package TugasTeori.JavaCollectionExercise;

public class App 
{
    public static void main(String[] args) 
    {
        Family family = new Family();
        family.addNiece("Ahmad", 1, 1);
        family.addNiece("Santi", 12, 12);
        if(!family.addNiece("Ahmad", 2, 2)) System.out.println("You add duplicate value");

        family.addUncle("Om");
        family.addUncle("Ula");
        Uncle u = family.findUncle("Om");
        u.addPresent(family.findNiece("Santi"), "doll");
        family.addNiece("Icun", 12, 12);
        // u = family.findUncle("Ula");
        u.addPresent(family.findNiece("Ahmad"), "Game Console");
        // u.addPresent(family.findNiece("Santi"), "doll");

        family.listNieces();
        family.listUncles();
        u.listPresents();
        family.findNiece("Ahmad").listPresents();
    }
}

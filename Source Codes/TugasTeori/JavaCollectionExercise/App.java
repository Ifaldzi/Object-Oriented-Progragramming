package TugasTeori.JavaCollectionExercise;

public class App 
{
    public static void main(String[] args) 
    {
        Family family = new Family();
        family.addUncle("Budi");
        family.addUncle("Nunu");
        family.addUncle("Siti");
        family.addUncle("Nunu");

        family.addNiece("Satria", 4, 5);
        family.addNiece("Windy", 1, 11);
        family.addNiece("Satria", 10, 10);
        family.addNiece("Rie", 30, 5);

        System.out.println("List of Nieces:");
        family.listNieces();
        System.out.println("List of Uncles:");
        family.listUncles();

        family.findUncle("Budi").addPresent(family.findNiece("Satria"), "Game Console");
        family.findUncle("Budi").addPresent(family.findNiece("Rie"), "Book");
        family.findUncle("Budi").addPresent(family.findNiece("Windy"), "Clothes");

        if(!family.findUncle("Nunu").addPresent(family.findNiece("Satria"), "Game Console")) System.out.println("Can't add present, You violate the family rules!");
        if(!family.findUncle("Nunu").addPresent(family.findNiece("Rie"), "Game Console")) System.out.println("Can't add present, You violate the family rules!");
        family.findUncle("Nunu").addPresent(family.findNiece("Satria"), "Camera");

        if(!family.findUncle("Siti").addPresent(family.findNiece("Windy"), "Laptop")) System.out.println("Can't add present, You violate the family rules!");

        family.findNiece("Satria").listPresents();
        family.findNiece("Rie").listPresents();
        family.findNiece("Windy").listPresents();
        family.findUncle("Budi").listPresents();
        family.findUncle("Nunu").listPresents();
        family.findUncle("Siti").listPresents();

        int totalPresent = family.findNiece("Satria").clearPresents();
        System.out.println("The list of presents is deleted, total removed = " + totalPresent);
    }
}

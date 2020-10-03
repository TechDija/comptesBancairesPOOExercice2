// question n°2

public class TesteCompte extends Compte {
    public TesteCompte(int S) {
        super(S);
    }

    public static void main(String[] args) {
        Compte compteOne = new Compte(0);
        Compte compteTwo = new Compte(0);

        compteOne.deposer(500);
        compteTwo.deposer(1000);
        compteTwo.retirer(10);
        compteOne.virerVers(75, compteTwo);
        compteOne.afficher();
        compteTwo.afficher();
    }
}

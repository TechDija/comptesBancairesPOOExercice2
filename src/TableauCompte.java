public class TableauCompte extends Compte {
    static Compte[] tableau = new Compte[10];

    public TableauCompte(int S) {
        super(S);
    }
    
    public static void main(String[] args) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = new Compte(200 + (i * 100));
        }
        int i = 0;
        for (int n = i; n < tableau.length; n++) {
            tableau[i].virerVers(20, tableau[n]);
        }
        for (i = 0; i < tableau.length; i++) {
            tableau[i].afficher();
        }
    }

}

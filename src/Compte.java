public class Compte {
    int solde = 0;

    // j'ajoute ce contructeur pour l'exercice concernant le tableaux des comptes
    public Compte (int S) {
        this.solde = S;
    }

    void deposer(int montant) {
        solde = solde + montant;
    }

    void retirer(int montant) {
        solde = solde - montant;
    }

    void virerVers(int montant, Compte destination) {
        this.retirer(montant);
        destination.deposer(montant);
        // cette méthode fait intervenir le compte "contexte" et le second compte, dit de destination.
        // elle retire un montant du premier pour faire un ajout du même montant dans le second.
    }

    void afficher() {
        System.out.println("solde: " + solde);
    }
}


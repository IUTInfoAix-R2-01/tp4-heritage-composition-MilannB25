package cycles;

public class VeloElec extends Velo {
    private static final double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
    private double facteurPuissanceMoteur;

    public VeloElec(double braquet, double diamRoue, double facteurPuissanceMoteur) {
        super(braquet, diamRoue);
        this.facteurPuissanceMoteur = facteurPuissanceMoteur;
    }
    
    public VeloElec(double braquet, double diamRoue) {
        super(braquet, diamRoue);
        this.facteurPuissanceMoteur = DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
    }

    public VeloElec() {
        this(13.0, 0.5); 
    }

	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}

	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}
	public void setDEFAUT_FACTEUR_PUISSANCE_MOTEUR(double facteurPuissanceMoteur) {
		this.DEFAUT_FACTEUR_PUISSANCE_MOTEUR = DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}

	public double getDEFAUT_FACTEUR_PUISSANCE_MOTEUR() {
		return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}

	@Override
	public String toString() {
		return "VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	@Override
	public double getPuissance(double frequenceCoupsDePedale) {
        return super.getPuissance(frequenceCoupsDePedale) * this.facteurPuissanceMoteur;
    }
	public static void main(String[] args) {
		VeloElec v1 = new VeloElec(15.5, 0.7);
		v1.setFacteurPuissanceMoteur(25.0);
		System.out.println("Puissance moteur :" + v1.getFacteurPuissanceMoteur());
		System.out.println(v1.toString());
		System.out.println("Puissance : " + v1.getPuissance(20.0));
		System.out.println(v1.getDEFAUT_FACTEUR_PUISSANCE_MOTEUR());
		
	}
}

	



package cycles;
import java.util.Random;

public class Velo {
	private static double DEFAUT_BRAQUET= 13.0;
	private double braquet;
	private double diamRoue;
	private Random genAlea;
	
    public Velo(double braquet, double diamRoue) {
        this.braquet = braquet;
        this.diamRoue = diamRoue;
        this.genAlea = new Random();
    }

    public Velo(double braquet) {
        this(braquet, 0.0); 
    }

    public Velo() {
        this(0.0, 0.0); 
    }

	
	@Override
	public String toString() {
		return "Velo [DEFAUT_BRAQUET=" + DEFAUT_BRAQUET + ", braquet=" + braquet + ", diamRoue=" + diamRoue + "]";
	}

	public double getDEFAUT_BRAQUET() {
		return DEFAUT_BRAQUET;
	}
	public void setDEFAUT_BRAQUET(double dEFAUT_BRAQUET) {
		DEFAUT_BRAQUET = dEFAUT_BRAQUET;
	}
	public Random getGenAlea() {
		return genAlea;
	}
	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}
	public double getBraquet() {
		return braquet;
	}
	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}
	public double getDiamRoue() {
		return diamRoue;
	}
	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}
	
	public double getPuissance(double frequenceCoupsDePedale) {
	     return frequenceCoupsDePedale * this.braquet * this.diamRoue * this.genAlea.nextDouble();
		}


public static void main(String[] args) {
	Velo v1 = new Velo(15.5, 0.7);
	System.out.println(v1.toString());

	Velo v2 = new Velo(10.0);
	System.out.println(v2.toString());

	Velo v3 = new Velo();
	v3.setBraquet(12.0);
	v3.setDiamRoue(0.65);
	System.out.println("Braquet : " + v3.getBraquet());
	System.out.println("Diamètre roue : " + v3.getDiamRoue());
	System.out.println(v3.toString());
	
	v3.setDEFAUT_BRAQUET(20.0);
	System.out.println(v3.toString());
	System.out.println("La puissance est de " + v3.getPuissance(90.0));
}
}

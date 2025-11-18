package week3.day2;

public class Maruthi  extends DesignVendor {//extends DesignVendor
	//companyLogo,modelName,freeServices, warrantyForEngine/GearBox
	public void companyLogo() {
		System.out.println("S");
	}
	public void modelName() {
		System.out.println("baleno");
	}
	public void freeServices() {
		System.out.println("Totaly 4 free services");
	}
	
	public static void main(String[] args) {
		Maruthi company = new Maruthi();
		company.tataTech();
		company.brakingSystem();
		company.accelatroSystem();
		company.headLamp();
		company.hornSystem();
		company.steeringSystem();
		company.companyLogo();
		company.modelName();
		company.freeServices();
		}

}

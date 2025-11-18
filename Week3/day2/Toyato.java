package week3.day2;

public class Toyato extends DesignVendor {
	//companyLogo,modelName,freeServices, warrantyForEngine/GearBox
		public void companyLogo() {
			System.out.println("T");
		}
		public void modelName() {
			System.out.println("Glanza");
		}
		public void freeServices() {
			System.out.println("Totaly 2 free services");
		}

	public static void main(String[] args) {

		Toyato company = new Toyato();
		company.fordTech();
		company.accelatroSystem();
		company.brakingSystem();
		company.headLamp();
		company.hornSystem();
		company.steeringSystem();
		company.companyLogo();
		company.modelName();
		company.freeServices();
				
	}

}

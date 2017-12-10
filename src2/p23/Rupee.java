package p23;

public class Rupee {

	public Rupee() {
		// TODO Auto-generated constructor stub
	}

	int countRepresentations(int numRupees) {
		int count = 0;
		for (int rupee20 = 0; rupee20 <= numRupees / 20; rupee20++) {
			for (int rupee10 = 0; rupee10 <= numRupees / 10; rupee10++) {
				for (int rupee5 = 0; rupee5 <= numRupees / 5; rupee5++) {
					for (int rupee2 = 0; rupee2 <= numRupees / 2; rupee2++) {
						for (int rupee1 = 0; rupee1 <= numRupees; rupee1++) {
							if (numRupees == (rupee20*20 + rupee10*10 + rupee5*5 + rupee2*2 + rupee1)) {
								count++;
								System.out.println(
										rupee20 + ", " + rupee10 + ", " + rupee5 + "," + rupee2 + "," + rupee1);
							}
						}
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		assert new Rupee().countRepresentations(12) == 15;
		System.out.println("Done");
	}

}

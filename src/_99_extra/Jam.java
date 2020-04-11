package _99_extra;

//	Write code to create strawberry jam and spread it on toast. (7)


	public class Jam { 
		public static void main(String[] args) {
			Jam jam = new Jam("Strawberry");
			jam.spreadOnToast();
		}

	      String flavor;

	       Jam(String flavor) {

	              this.flavor = flavor;
	       } 

	       void spreadOnToast() {

	              System.out.println("Spreading "+flavor+ " jam on toast");
	      }
	}



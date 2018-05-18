package EnumsMetodosAbstractos;

public enum Season {
	WINTER {
		public void getSeasonalOpeningHours() {
			System.out.println("Winter hour");
		}

		public void getName() {
			System.out.println("Winter");
		}
	},
	SPRING {
		public void getSeasonalOpeningHours() {
			System.out.println("Winter hour");
		}

		public void getName() {
			System.out.println("Spring");
		}
	},
	SUMMER {
		public void getSeasonalOpeningHours() {
			System.out.println("Winter hour");
		}

		public void getName() {
			System.out.println("Summer");
		}
	},
	FALL {
		public void getSeasonalOpeningHours() {
			System.out.println("Winter hour");
		}

		public void getName() {
			System.out.println("Fall");
		}
	};

	/* Se mandaría llamar Season.Winter.getSeasonalOpeningHours() */
	public abstract void getSeasonalOpeningHours(); /*
													 * Esta linea obliga a que se tenga que definir el metodo en cada
													 * enum
													 */

	public abstract void getName();
}

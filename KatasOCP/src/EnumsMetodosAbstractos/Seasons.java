package EnumsMetodosAbstractos;

public enum Seasons {
		WINTER{
			public String getCalificacion(){
				return "a";
			}
		}, ATUMN{
			public String getCalificacion(){
				return "b";
			}
		}, FALL{
			public String getCalificacion(){
				return "c";
			}
		};

		public abstract String getCalificacion();
}

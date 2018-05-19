package FunctionalInterface1;
@FunctionalInterface
public interface Skip extends Sprint {
/*No hay problema pues ninguno de los siguientes metodos es abstracto, son concretos*/
		public default int getHopCount(Object animal){return 10;}
		public static void skip(int speed){}
}

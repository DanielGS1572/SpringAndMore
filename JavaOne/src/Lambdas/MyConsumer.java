package Lambdas;

@FunctionalInterface
interface MyConsumer<T> {
    void accept(T t);
//1:00:00
    //Los metodos default ayudan a hacer la composición de objetos
    default MyConsumer<T> andThen(MyConsumer<T> other){
        return (T t) -> {
        		 this.accept(t);
        		 System.out.println("And then");
        		 other.accept(t);
        };
    }
}

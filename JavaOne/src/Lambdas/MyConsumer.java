package Lambdas;

@FunctionalInterface
interface MyConsumer<T> {
    void accept(T t);
//31.49
    default MyConsumer<T> andThen(MyConsumer<T> other){
        return (T t) -> {

        };
    }
}

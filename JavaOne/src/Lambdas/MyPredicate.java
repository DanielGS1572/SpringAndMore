package Lambdas;

import java.util.Objects;

public interface MyPredicate<T> {
	boolean test(T t);
	
	default MyPredicate<T> andThen(MyPredicate<T> other){
		Objects.requireNonNull(other);
		return (T t) ->{
			return this.test(t) && other.test(t);
		};
	}
	
	default MyPredicate<T> negate(){
		return t -> !this.test(t);
	}
}

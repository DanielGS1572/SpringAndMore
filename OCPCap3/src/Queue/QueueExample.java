package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
/*Queue tiene dos modalidades SINGLE ENDED QUEUE 	ó 	STACK		*/
/*Queue usa el formato FIFO (SINGLE ENDED QUEUE)				---> offer/poll/peek
 * o tambien puede ser Lifo	(STACK) 							---> push/poll/peek
 * */
/*ArrayDeque ("pronunciado deck") es una queue con doble terminación (se puede agregar al inicio y al final)
 * es más eficiente que linkedlist 
 * push() es lo que lo hace double ended, pues agrega un elemento al inicio de la cola*/
public class QueueExample {
	public static void main(String args[])
	/*Hay 6 metodos principales de los cuales 3 son homologos de los otros tres*/
	
	/*			No tira Excepciones			Tira excepciones
	 * 			------------------			----------------
	 * 			boolean offer(E e)			boolean add(E e)		Agrega un elemento al final de la lista	(false - Excepcion)(en caso de no exito al querer agregar)
	 * 			E poll()					E remove()				Elimina y devuelve el elemento (null - Excepcion)(caso de cola ya esta vacia)
	 * 			E peek()					E element()				Regresa un elemento (nulo - Excepcion)(En caso de cola vacia)
	 * 
	 * Otros metodos
	 * void push(E e)	Agrega un elemento al inicio de la cola
	 * 
	 * */
	{
		/*				FUNCIONAMIENTO DE EN FORMATO DE QUEUE	(FIFO)		*/
		Queue<Integer> queue = new ArrayDeque<>();
		System.out.println(queue.offer(10));		//		10
		System.out.println(queue.offer(4));			//		10		4
		System.out.println(queue.peek());			//		10		4
		System.out.println(queue.poll());			//		4
		System.out.println(queue.poll());		
		System.out.println(queue.poll());		
//		System.out.println(queue.remove());			/*La cola ya esta vacía, aqui truena*/
		
		
		System.out.println("\n\n");
		
		/*				FUNCIONAMIENTO DE EN FORMATO DE STACK	(LIFO)		*/
		ArrayDeque<Integer> stack = new ArrayDeque<>();		/*Ver que la referencia ya no es Queue<Integer>*/
		stack.push(10);													//			10
		stack.push(4);													//			4		10
		System.out.println(stack.peek());								//			4		10
		System.out.println(stack.poll());//regresa 4, y lo elimina		//			10			
		System.out.println(stack.poll());
		System.out.println(stack.peek());
		
	}
	

}

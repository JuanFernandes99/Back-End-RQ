<<<<<<< HEAD:ExerciciosAula/src/Stream/src/stream/ResolucaoStream.java
package Stream.src.stream;
=======
package stream_Exercicio;
>>>>>>> 5bbb4be83fd3894886cb94c96a31c0d414c7e14e:ExerciciosAula/src/stream_Exercicio/ResolucaoStream.java

import java.util.Arrays;
import java.util.List;

public class ResolucaoStream {

	public static void main(String args[]) {
		List<String> myList = Arrays.asList("a1", "a2", "b1", "b2", "c2", "c1");
		myList

				.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);

	}
}

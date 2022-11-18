package Streams;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class main_Stream_API {

	public static void main(String[] args) {

		List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1",  "2",  "3",  "9",  "9",  "6",  "5" );
		System.out.println(numerosAleatorios);
		System.out.println("-----------");
		
		numerosAleatorios.stream().forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});
		
		numerosAleatorios.stream().forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});
		
		numerosAleatorios.stream().forEach(s -> System.out.println(s));
		
		//numerosAleatorios.stream().forEach(System.out::println);
		System.out.println("-----------");
		numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
		System.out.println("-----------");		
		
		List<Integer> numList = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
		numList.stream().forEach(System.out::println);
		
	}

}

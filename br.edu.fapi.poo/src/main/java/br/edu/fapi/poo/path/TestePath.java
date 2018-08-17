package br.edu.fapi.poo.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestePath {
	public static void main(String[] args) {
		Path path = Paths.get(System.getProperty("user.dir"));
		
		System.out.printf("toString : %s%n" , path.toString());
	}
}

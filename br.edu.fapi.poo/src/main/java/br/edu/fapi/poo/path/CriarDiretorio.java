package br.edu.fapi.poo.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CriarDiretorio {
	public static void main(String[] args) {
		String diretorio = " ";
		Scanner scanner = new Scanner(System.in);

		List<String> diretorios = new ArrayList<String>();
		while (!diretorio.equalsIgnoreCase("fim")) {
			System.out.println("Digite os diretorios:");
			diretorio = scanner.next();
			diretorios.add(diretorio);
		}

		for (String dir : diretorios) {
			Path path = Paths.get(System.getProperty("user.dir")).resolve(dir);
			try {
				Files.createDirectory(path);
			}

			catch (IOException e) {
				System.out.println("Diretório não criado.");

			}
		}
	}
}

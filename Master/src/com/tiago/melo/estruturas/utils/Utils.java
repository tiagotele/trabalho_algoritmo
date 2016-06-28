package com.tiago.melo.estruturas.utils;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class Utils {

	public static boolean imprimeEstrutura = false;

	static String fileName = "log.txt";

	
	public static void criaLogDeExecucao(String conteudo) {
		try (PrintWriter out = new PrintWriter(
				new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName, true))))) {
			out.println(conteudo);
		} catch (IOException e) {
			System.err.println("Exceção ao criar arquivo.");
		}
		System.out.println("Arquivo de log criado!");
	}

	public static void apagaLogDeExecucao() {
		Path path = FileSystems.getDefault().getPath("log.txt");
		try {
			Files.deleteIfExists(path);
		} catch (NoSuchFileException x) {
			System.err.format("%s: no such" + " file or directory%n", fileName);
		} catch (DirectoryNotEmptyException x) {
			System.err.format("%s not empty%n", fileName);
		} catch (IOException x) {
			// File permission problems are caught here.
			System.err.println(x);
		}
		System.out.println("Arquivo de log apagado!");
	}
}

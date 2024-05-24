package fileWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyWriter {

		public static void main(String[] args) {

			try {
				FileWriter fileWriter = new FileWriter("./src/fileReader/fichier.txt", true); // remplace le contenu - pour écrire à la suite : true

				BufferedWriter writer = new BufferedWriter(fileWriter);

				writer.write("hola");

				writer.newLine();

				writer.write("todo bien?");
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}


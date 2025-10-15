package standartDateHours;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFileSystem {

	public static void main(String[] args) {
    Path filePath = Paths.get("/home/fs/Documents/file.txt");
    try (BufferedReader br = Files.newBufferedReader(filePath)) {
        String linha;
        while ((linha = br.readLine()) != null) {
            // Processar cada linha (ex: filtrar, transformar)
            System.out.println(linha);
        }
    } catch (IOException e) {
        System.err.println("Erro ao ler arquivo: " + e.getMessage());
    }
}
}

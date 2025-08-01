package standartDateHours;

 
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class WriteFiles {
  	
	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 
     // Define o caminho do diretório e arquivo
     Path dirPath = Paths.get("/home/fs/Documents");
     Path filePath = dirPath.resolve("file.txt");
     
     
     // horário e data no padrao brasileiro
     DateTimeFormatter tzFormatter = DateTimeFormatter.ofPattern("\t\t" + "dd MMM yyyy, hh:mm a" + "\n");
     ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
    // dateTime.format(tzFormatter)
     
     try {
         // Cria os diretórios se não existirem
         Files.createDirectories(dirPath);
         
         // Texto para escrever no arquivo
         System.out.println("digite: ");
         String conteudo = sc.nextLine();
         
             // Verifica se o arquivo já existe e gera um novo nome se necessário
        	 int n = 1;
           while (Files.exists(filePath)) {
              filePath = dirPath.resolve("file" + n + ".txt");
              //System.out.println(filePath);
              n++;
             }
           // quebra de linha entre a data e o conteudo do arquivo
           String wrapperLine = "\n";

        	 // Escreve no arquivo (cria se não existir)
           Files.write(filePath, dateTime.format(tzFormatter).getBytes(), StandardOpenOption.CREATE);
           Files.write(filePath, wrapperLine.getBytes(), StandardOpenOption.APPEND);
           Files.write(filePath, conteudo.getBytes(), StandardOpenOption.APPEND);
        
         System.out.println("\nArquivo criado com sucesso!");
     } catch (IOException e) {
         e.printStackTrace();
     }
     
     sc.close();
 }
 
}


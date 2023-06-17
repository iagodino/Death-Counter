import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) throws IOException {
		String path = "dados.txt";
		int qtA = 0;
		try {
			qtA = Manipulador.leitor(path);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Scanner ler = new Scanner(System.in);
		int n;

		System.out.printf("Informe o número de mortes:\n");
		n = ler.nextInt();

		FileWriter arq = new FileWriter(path);
		PrintWriter gravarArq = new PrintWriter(arq);

		gravarArq.printf("%d", n + qtA);

		arq.close();

		qtA = Manipulador.leitor(path);
		System.out.printf("\nAs %d mortes foram gravadas com sucesso em %s, total %d.\n", n, path, qtA);
	}

}
import java.util.Scanner;

public class TesteExcecao {
	
	public static void main(String args[]){
		try{
			
			Scanner s = new Scanner(System.in);
			System.out.print("Digite o tamanho do array: ");
			int[] meuArray = new int[s.nextInt()];
			System.out.print("Digite a posição do array que deseja acessar: ");
			int posicao = s.nextInt();
			System.out.print("Digite o valor que deseja inserir: ");
			int valor = s.nextInt();
			s.close();//fechando o scanner para ficar sem warnings
			meuArray[posicao] = valor;
			if(valor >= 1000){
				MinhaExcecao me = new MinhaExcecao("Valor inválido");
			throw me;
			}
				System.out.println("Valor da posição: "+meuArray[posicao]);
			}catch(MinhaExcecao me){
				System.out.println(me.toString());
			}catch(ArrayIndexOutOfBoundsException oe){
				oe.printStackTrace();
			}
		System.out.println("Esta linha é impressa sempre?");
	}
}

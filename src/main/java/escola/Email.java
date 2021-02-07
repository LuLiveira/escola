package escola;

//Vo ou DTO (por que não tem um identificador unico)
public class Email {

	private String endereco;
	
	public Email(String endereco) {
		if(endereco == null || !endereco.matches("/^[a-z0-9.]+@[a-z0-9]+\\.[a-z]+\\.([a-z]+)?$/i")) {
			throw new IllegalArgumentException("Email inválido.");
		}
		this.endereco = endereco;
	}
}

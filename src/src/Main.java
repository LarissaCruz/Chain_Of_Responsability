package src;

public class Main {	
	  public static void main(String[] args) {
		  Autentica autenticador = new Autenticador();
		  Autentica verificador = new Verificador();
		  Usuario usuario = new UsuarioLogin("teste@gmail.com", "123456");
		  
	
		  autenticador.setProximo(verificador);
		  autenticador.autenticar(usuario);
		 
		  
		  
		  
	  }

}	

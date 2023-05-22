package src;

public class Autenticador implements Autentica {
	
	private Autentica proximo;
	
	@Override
	public void setProximo(Autentica proximo) {
		// TODO Auto-generated method stub
		 this.proximo = proximo;
	}

	@Override
	public void autenticar(Usuario dados) {
		// TODO Auto-generated method stub
		 if (proximo != null) {
	            proximo.autenticar(dados);
	     }else {
	    	 System.out.print("teste");
	     }
		 
	}

}

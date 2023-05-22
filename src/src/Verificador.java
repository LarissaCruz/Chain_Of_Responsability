package src;

public class Verificador implements Autentica {
	private Autentica proximo;
	@Override
	public void setProximo(Autentica proximo) {
		// TODO Auto-generated method stub
		this.proximo  = proximo;
	}

	@Override
	public void autenticar(Usuario dados) {
		// TODO Auto-generated method stub
		 if (proximo != null) {
			 System.out.print("entrei");
	         proximo.autenticar(dados);
	            
	     }else {
	    	 System.out.print("Usuario Autenticado");
		 }
	}

}

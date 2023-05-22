package src;

public class UsuarioLogin  implements Usuario{
	private String email ;
	private String senha ;
	
	public UsuarioLogin(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}
	@Override
	public void getEmail() {
		// TODO Auto-generated method stub
		System.out.print(email);
	}

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		this.email = email;
	}

	@Override
	public void getSenha() {
		// TODO Auto-generated method stub
		System.out.print(senha);
	}

	@Override
	public void setSenha(String senha) {
		// TODO Auto-generated method stub
		this.senha = senha ;
	}

}

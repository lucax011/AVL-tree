package AVL_tree.Clients;

public class Cliente {
	 private String nome;
	    private String dataNascimento;
	    private String contatoTelefonico;
	    private String email;
	    private String endereco;
	    private String cpf;


	    public void Cliente(String nome, String dataNascimento, String contatoTelefonico, String email, String endereco,
	            String cpf) {
	        
	    	this.nome = nome;
	        this.dataNascimento = dataNascimento;
	        this.contatoTelefonico = contatoTelefonico;
	        this.email = email;
	        this.endereco = endereco;
	        this.cpf = cpf;
	   
	    }

	    public String getNome() {
	        return nome;
	    }

	 
	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	   
	    public String getDataNascimento() {
	        return dataNascimento;
	    }

	 
	    public void setDataNascimento(String dataNascimento) {
	        this.dataNascimento = dataNascimento;
	    }


	    public String getContatoTelefonico() {
	        return contatoTelefonico;
	    }


	    public void setContatoTelefonico(String contatoTelefonico) {
	        this.contatoTelefonico = contatoTelefonico;
	    }

	    public String getEmail() {
	        return email;
	    }

	    
	    public void setEmail(String email) {
	        this.email = email;
	    }


	    public String getEndereco() {
	        return endereco;
	    }

	    
	    public void setEndereco(String endereco) {
	        this.endereco = endereco;
	    }

	  
	    public String getCpf() {
	        return cpf;
	    }

	 
	    public void setCpf(String cpf) {
	        this.cpf = cpf;
	    }
}

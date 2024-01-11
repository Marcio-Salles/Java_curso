package colecoes;

public class Usuario {

    String nome;

    Usuario(String nome){
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        return this.nome.length();
    }

    @Override
    public boolean equals(Object obj) {
        Usuario outroUsuario = (Usuario)  obj;
        return this.nome.equals(outroUsuario);
    }
}

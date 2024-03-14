import java.util.List;
import java.util.ArrayList;
public class Usuario {
    private String nome;
    private List<Postagens>mural;
    private List<Usuario>seguidores;

    public Usuario(String nome){
        this.nome = nome;
        this.mural = new ArrayList<>();
        this.seguidores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Postagens> getMural() {
        return mural;
    }

    public List<Usuario> getSeguidores() {
        return seguidores;
    }

    public void adicionarPostagem(Postagens postagem){
        mural.add(postagem);
    }

    public void adicionarSeguidor(Usuario seguidor){
        seguidores.add(seguidor);
    }
}

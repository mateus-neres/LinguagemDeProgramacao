
import java.util.ArrayList;

import java.util.List;


public class Usuario {
    private String nome;
    private List<Usuario> seguidores;
    private List<Postagem> postagens;

    public Usuario(String nome) {
        this.nome = nome;
        this.seguidores = new ArrayList<>();
        this.postagens = new ArrayList<>();
    }

    public void novaPostagem(String texto) {
        Postagem postagem = new Postagem(texto);
        postagens.add(postagem);
    }

    public void seguirUsuario(Usuario usuario) {
        if (!seguidores.contains(usuario)) {
            seguidores.add(usuario);
        }
    }

    public List<Postagem> getMural() {
        List<Postagem> mural = new ArrayList<>();
        for (Usuario seguido : seguidores) {
            mural.addAll(seguido.getPostagens());
        }
        return mural;
    }

    public String getNome() {
        return nome;
    }

    public List<Usuario> getSeguidores() {
        return seguidores;
    }

    public List<Postagem> getPostagens() {
        return postagens;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
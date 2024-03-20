package entities;

import java.util.ArrayList;
import java.util.List;

public class RedeSocial {
    private List<Usuario> usuarios;

    public RedeSocial() {
        this.usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(String nomeUsuario) {
        if (!pesuisarUsuario(nomeUsuario)) {
            usuarios.add(new Usuario(nomeUsuario));
        } else {
            throw new IllegalArgumentException("Usuário já cadastrado!");
        }
    }

    public void postar(String nomeUsuario, String mensagem) {
        Usuario usuario = getUsuario(nomeUsuario);
        usuario.postar(mensagem);
        System.out.println("Post Realizado com sucesso no mural de " + nomeUsuario);
    }

    public void seguir(String nomeUsuario, String outroUsuario) {
        Usuario usuario = getUsuario(nomeUsuario);
        Usuario usuarioSeguido = getUsuario(outroUsuario);
        usuario.seguir(usuarioSeguido.getNome());
    }

    public String lerMural(String nomeUsuario) {
        Usuario usuario = getUsuario(nomeUsuario);
        return usuario.lerMuralCompleto(usuarios);
    }


    private boolean pesuisarUsuario(String nomeUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equals(nomeUsuario)) {
                return true;
            }
        }
        return false;
    }

    public Usuario getUsuario(String nomeUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equals(nomeUsuario)) {
                return usuario;
            }
        }
        throw new IllegalArgumentException("Usuário não encontrado");
    }

}
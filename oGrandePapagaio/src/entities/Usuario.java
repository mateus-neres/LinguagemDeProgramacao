package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class Usuario {
    private String nome;
    private List<String> mural;
    private List<String> seguindo;

    private LocalDateTime dataHora;

    public Usuario(String nome) {
        this.nome = nome;
        this.mural = new ArrayList<>();
        this.seguindo = new ArrayList<>();
        this.dataHora = LocalDateTime.now();
    }

    public void postar(String mensagem) {
        if(mensagem == null){
            throw new IllegalArgumentException("Você deve escrever uma mensagem para postar.");
        }
        mural.add(mensagem);
    }

    public void seguir(String outroUsuario) {
        seguindo.add(outroUsuario);
    }

    public String lerMuralCompleto(List<Usuario> usuarios) {
        StringBuilder sb = new StringBuilder();
        sb.append(this).append("\n\n");


        for (String outroUsuario : seguindo) {
            Usuario usuarioSeguido = getUsuario(outroUsuario, usuarios);
            if (usuarioSeguido != null) {
                sb.append(usuarioSeguido.toString()).append("\n\n"); // Anexa informações do usuário seguido
            } else {
                sb.append("Usuário Seguido ").append(outroUsuario).append(" não encontrado.\n");
            }
        }

        return sb.toString().trim();
    }


    private Usuario getUsuario(String nomeUsuario, List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            if (usuario.nome.equals(nomeUsuario)) {
                return usuario;
            }
        }
        throw new IllegalArgumentException("Usuário não encontrado");
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        String dataHoraFormatada = dataHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        return String.format("Nome: %s\nCriado em: %s\nMensagens: %s",
                nome, dataHoraFormatada, mural);
    }

}
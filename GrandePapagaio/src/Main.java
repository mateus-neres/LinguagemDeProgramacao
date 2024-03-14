import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Map<String, Usuario> usuarios = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String comando = scanner.nextLine();
            if (comando.toUpperCase().equals("SAIR")){
                break;
            }
            processarComando(comando, usuarios);
        }
        scanner.close();
    }

    private static void processarComando(String comando, Map<String,Usuario> usuarios) {
        String[] partes = comando.split(" ");

        if (partes.length < 2) {
            System.out.println("Comando Invalido, tente novamente.");
            return;
        }
        String nomeUsuario = partes[0];
        Usuario usuario = usuarios.computeIfAbsent(nomeUsuario, Usuario::new);

        switch (partes[1]){
            case "->":
                postarMensagem(usuario, comando.substring(nomeUsuario.length() + 4));
                break;
            case "Segue":
                seguirUsuario(usuario, partes[2], usuarios);
                break;
            case "mural":
                exibirMural(usuario);
        }
    }

    private static void exibirMural(Usuario usuario) {
        System.out.println("Mural de " + usuario.getNome());
        for (Postagens post : usuario.getMural()) {
            System.out.println(usuario.getNome() + " --> " + post.getMensagem() +
                    " (" + post.getDataHora() + ")");
        }
    }

    private static void seguirUsuario(Usuario seguidor, String nomeUsuarioASeguir, Map<String, Usuario> usuarios) {
        Usuario usuarioASeguir = usuarios.get(nomeUsuarioASeguir);

        if (usuarioASeguir == null) {
            System.out.println("Erro: Usuário não encontrado.");
            return;
        }

        seguidor.adicionarSeguidor(usuarioASeguir);
        System.out.println(seguidor.getNome() + " está seguindo " + usuarioASeguir.getNome());
    }

    private static void postarMensagem(Usuario usuario, String mensagem) {
        Postagens postagem = new Postagens(mensagem);
        usuario.adicionarPostagem(postagem);
        System.out.println("Postagem realizada com sucesso no mural de: " + usuario.getNome());
    }
}

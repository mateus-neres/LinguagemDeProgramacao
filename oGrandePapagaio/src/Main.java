import java.util.HashMap;
import java.util.Map;
public class Main {
    private static Map<String, Usuario> usuarios = new HashMap<>();

    public static void main(String[] args) {
        processarComando("Daniel -> Java 22 é massa");
        processarComando("Raquel -> Streams é a melhor novidade do Java");
        processarComando("mural Daniel");
        processarComando("mural Raquel");
        processarComando("Daniel segue Raquel");
        processarComando("mural Daniel");
    }

    public static void processarComando(String comando) {
        String[] partes = comando.split(" ", 3);
        String nomeUsuario = partes[0];

        if (!usuarios.containsKey(nomeUsuario)) {
            usuarios.put(nomeUsuario, new Usuario(nomeUsuario));
        }

        if (partes.length == 3 && partes[1].equals("->")) {
            postarMensagem(nomeUsuario, partes[2]);
        } else if (partes.length == 2 && partes[0].equals("mural")) {
            exibirMural(partes[1]);
        } else if (partes.length == 3 && partes[1].equals("segue")) {
            seguirUsuario(nomeUsuario, partes[2]);
        } else {
            System.out.println("Comando inválido.");
        }
    }

    public static void postarMensagem(String nomeUsuario, String mensagem) {
        Usuario usuario = usuarios.get(nomeUsuario);
        usuario.novaPostagem(mensagem);
        System.out.println("Post realizado com sucesso no mural de " + nomeUsuario);
    }

    public static void exibirMural(String nomeUsuario) {
        Usuario usuario = usuarios.get(nomeUsuario);
        System.out.println("Mural de " + nomeUsuario + ":");
        for (Postagem postagem : usuario.getMural()) {
            System.out.println(nomeUsuario + " --> " + postagem);
        }
    }

    public static void seguirUsuario(String nomeSeguidor, String nomeSeguido) {
        Usuario seguidor = usuarios.get(nomeSeguidor);
        Usuario seguido = usuarios.get(nomeSeguido);
        seguidor.seguirUsuario(seguido);
        System.out.println(nomeSeguidor + " agora segue " + nomeSeguido);
    }
}
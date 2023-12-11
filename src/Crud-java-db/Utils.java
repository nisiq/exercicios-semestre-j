import java.sql.*;
import java.util.Scanner;

public class Utils {
    static Scanner sc = new Scanner(System.in);

    public static Connection conectar() {
        // Forma de conexão com o mysql
        String CLASSE_DRIVE = "com.mysql.cj.jdbc.Driver";
        String USUARIO = "root";
        String URL_SERVIDOR = "jdbc:mysql://localhost:3306/crud_mysql_java?useSSL=false&serverTimezone=UTC";
        ;
        //useSSL =

        try {
            Class.forName(CLASSE_DRIVE);
            return DriverManager.getConnection(URL_SERVIDOR, USUARIO, ""); // Se for correta, retornar a conexao
        } catch (Exception e) {
            if (e instanceof ClassNotFoundException) {
                System.out.println("Verificar o driver de conexão"); // Se não for encontrada:
            } else {
                System.out.println("Verifique se o servidor está ativo");
            }
            System.exit(-42); // Informar erro
            return null;
        }
    }

    public static void desconectar(Connection conn) {
        if (conn != null) {
            try {
                conn.close(); // Se a conexao estiver aberta, tentamos fechar ela
            } catch (SQLException e) {
                System.out.println("Não foi possivel fechar a conexao");
                e.printStackTrace();
            }
        }
    }

    public static void listar() {
        String BUSCAR_TODOS = "SELECT * FROM produtos";

        try {
            Connection conn = conectar();
            // Alterar o tipo de resultado para permitir navegação para frente e para trás
            PreparedStatement produtos = conn.prepareStatement(BUSCAR_TODOS, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet res = produtos.executeQuery();

            // Pega o resultado e vai para o final
            res.last();
            int qtd = res.getRow(); // Numero da ultima linha, indicando quantos elementos temos
            res.beforeFirst(); // Voltar para o inicio

            if (qtd > 0) {
                System.out.println("Listando produtos...");
                System.out.println("--------------------");

                // Enquanto houver proximo produto
                while (res.next()) {
                    // getInt
                    System.out.println("ID: " + res.getInt(1));
                    System.out.println("Produto: " + res.getString(2));
                    System.out.println("Preco: " + res.getFloat(3));
                    System.out.println("Estoque: " + res.getInt(4));
                    System.out.println("--------------------");

                }

            } else {
                System.out.println("Não existem produtos cadastrados");
            }
            produtos.close();
            desconectar(conn);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Erro buscando produtos");
            System.exit(-42); //
        }
    }

    public static void inserir() {
        System.out.println("Informe o nome do produto: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.println("Informe o preco do produto: ");
        float preco = Float.parseFloat(sc.nextLine());

        System.out.println("Informe a quantidade em estoque: ");
        int estoque = sc.nextInt();

        // Inserindo no banco de dados
        String INSERIR = "INSERT INTO produtos (nome, preco, estoque) VALUES (?, ?, ?)";
        // SQL Injection

        try {
            Connection conn = conectar();
            PreparedStatement salvar = conn.prepareStatement(INSERIR); // Proteger de SQL INJECTION
            salvar.setString(1, nome);
            salvar.setFloat(2, preco);
            salvar.setInt(3, estoque);

            salvar.executeUpdate();
            salvar.close();

            desconectar(conn);

            System.out.println("O produto " + nome + " foi inserido com sucesso");

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Erro Salvando Produto");
            System.exit(-42);
        }

    }

    public static void atualizar() {
        System.out.println("Informe o código do produto: ");
        sc.nextLine(); // Consumir a quebra de linha pendente
        String input = sc.nextLine();

        if (!input.isEmpty()) {  // Verifica se a string não está vazia
            try {
                int id = Integer.parseInt(input);

                String BUSCAR_POR_ID = "SELECT * FROM produtos WHERE id=?";

                Connection conn = conectar();
                PreparedStatement produto = conn.prepareStatement(BUSCAR_POR_ID, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                produto.setInt(1, id);

                ResultSet res = produto.executeQuery();
                res.last();
                int qtd = res.getRow();
                res.beforeFirst();

                if (qtd > 0) {
                    System.out.println("Informe o nome do produto: ");
                    String nome = sc.nextLine();

                    System.out.println("Informe o preço do produto: ");
                    float preco = Float.parseFloat(sc.nextLine());

                    System.out.println("Informe a quantidade em estoque: ");
                    int estoque = sc.nextInt();

                    String ATUALIZAR = "UPDATE produtos SET nome=?, preco=?, estoque=? WHERE id=?";
                    PreparedStatement upd = conn.prepareStatement(ATUALIZAR);

                    upd.setString(1, nome);
                    upd.setFloat(2, preco);
                    upd.setInt(3, estoque);
                    upd.setInt(4, id);

                    upd.executeUpdate();
                    upd.close();
                    desconectar(conn);
                    System.out.println("O produto " + nome + " foi atualizado com sucesso");
                } else {
                    System.out.println("Não existe produto com o ID informado");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: O código do produto deve ser um número inteiro válido.");
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("Erro ao atualizar produto");
                System.exit(-42);
            }
        } else {
            System.out.println("Erro: O código do produto não pode estar vazio.");
        }
    }


    public static void deletar() {
        String DELETAR = "DELETE FROM produtos WHERE id=?";
        String BUSCAR_POR_ID = "SELECT * FROM produtos WHERE id=?";

        System.out.println("Informe o código do produto a ser deletado: ");
        sc.nextLine(); // Consumir a quebra de linha pendente
        String input = sc.nextLine();

        if (!input.isEmpty()) {
            try {
                int id = Integer.parseInt(input);

                try (Connection conn = conectar();
                     PreparedStatement produto = conn.prepareStatement(BUSCAR_POR_ID, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {

                    produto.setInt(1, id);
                    try (ResultSet res = produto.executeQuery()) {

                        res.last();
                        int qtd = res.getRow();
                        res.beforeFirst();

                        if (qtd > 0) {
                            try (PreparedStatement del = conn.prepareStatement(DELETAR)) {
                                del.setInt(1, id);
                                del.executeUpdate();
                            }
                            System.out.println("O produto foi deletado com sucesso");
                        } else {
                            System.out.println("Não existe produto com o ID informado");
                        }
                    }
                }

            } catch (NumberFormatException e) {
                System.out.println("Erro: O código do produto deve ser um número inteiro válido.");
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("Erro ao deletar produto");
                System.exit(-42);
            }
        } else {
            System.out.println("Erro: O código do produto não pode estar vazio.");
        }
    }


    public static void menu() {
        int opcao;

        do {
            System.out.println("==================Gerenciamento de Produtos===============");
            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Listar produtos.");
            System.out.println("2 - Inserir produtos.");
            System.out.println("3 - Atualizar produtos.");
            System.out.println("4 - Deletar produtos.");
            System.out.println("0 - Sair.");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    listar();
                    break;
                case 2:
                    inserir();
                    break;
                case 3:
                    atualizar();
                    break;
                case 4:
                    deletar();
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }
}
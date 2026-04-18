import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerenciadorDeArquivos {
    public static void main(String[] args) {
        ArrayList<String> listaDeTarefas = new ArrayList<>();
        int opcao = 0;

        while (opcao != 4)

        {
            String menu = "1.Adicionar Tarefa, 2.Remover Tarefa, 3.Listar as Tarefas, 4.Sair";
            String entrada = JOptionPane.showInputDialog(menu);
            if (entrada == null) {
                break;
            }
            opcao = Integer.parseInt(entrada);
            if (opcao == 1) {
                String novaTarefa = JOptionPane.showInputDialog("O que você precisa adicionar?");
                listaDeTarefas.add(novaTarefa);
                JOptionPane.showMessageDialog(null, "Tarefa Adicionada!");
            } else if (opcao == 2) {
                String removerTarefa = JOptionPane.showInputDialog("Qual o número da Tarefa que deseja Remover?");
                if (removerTarefa != null) {
                    int indiceParaRemover = Integer.parseInt(removerTarefa) - 1;

                    if (indiceParaRemover >= 0 && indiceParaRemover < listaDeTarefas.size()) {
                        String tarefaRemovida = listaDeTarefas.remove(indiceParaRemover);
                        JOptionPane.showMessageDialog(null, "Tarefa " + tarefaRemovida + " Removida");

                    } else {
                        JOptionPane.showMessageDialog(null, "Número Inválido ", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                }

            } else if (opcao == 3) {
                String listaCompleta = "Todas Minhas Tarefas:\n\n";
                for (int i = 0; i < listaDeTarefas.size(); i++)
                    listaCompleta += (i + 1) + ". " + listaDeTarefas.get(i) + "\n";
                JOptionPane.showMessageDialog(null, listaCompleta);
            }
            else if (opcao == 4) {
                JOptionPane.showMessageDialog(null, "Saindo Do Sistema..");
                
            }

        }

    }

}

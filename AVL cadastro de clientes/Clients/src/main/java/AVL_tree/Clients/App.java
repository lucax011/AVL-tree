package AVL_tree.Clients;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
    	 AVLTree tree = new AVLTree();

        
         Cliente cliente1 = new Cliente("Alice", "01/01/1990", "1234567890", "alice@example.com", "Rua A", "11111111111");
         Cliente cliente2 = new Cliente("Bob", "02/02/1985", "9876543210", "bob@example.com", "Rua B", "22222222222");
         Cliente cliente3 = new Cliente("Charlie", "03/03/1980", "5555555555", "charlie@example.com", "Rua C", "33333333333");

         tree.insert(cliente1);
         tree.insert(cliente2);
         tree.insert(cliente3);

        
         String cpfBuscado = "22222222222";
         int comparacoes = tree.searchByCpf(cpfBuscado);

         if (comparacoes > 0) {
             System.out.println("Cliente encontrado: " + cliente2.getNome());
             System.out.println("Comparacoes necessarias: " + comparacoes);
         } else {
             System.out.println("Cliente com CPF " + cpfBuscado + " nao encontrado.");
         }

     
         List<Cliente> clientesEmOrdem = tree.inOrderTraversal();

         System.out.println("\nClientes em ordem alfabetica pelo nome:");
         for (Cliente cliente : clientesEmOrdem) {
             System.out.println(cliente.getNome());
         }
    }
}

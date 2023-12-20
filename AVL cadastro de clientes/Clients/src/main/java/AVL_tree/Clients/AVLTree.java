package AVL_tree.Clients;

import java.util.ArrayList;
import java.util.List;

public class AVLTree {
	 private class Node {
	        Cliente cliente;
	        int height;
	        Node left, right;

	        public Node(Cliente cliente) {
	            this.cliente = cliente;
	            this.height = 1;
	        }
	    }

	    private Node root;

	    private int height(Node node) {
	        return (node != null) ? node.height : 0;
	    }

	    private int getBalance(Node node) {
	        return (node != null) ? height(node.left) - height(node.right) : 0;
	    }

	    private Node rotateRight(Node y) {
	        Node x = y.left;
	        Node T2 = x.right;

	        x.right = y;
	        y.left = T2;

	        y.height = Math.max(height(y.left), height(y.right)) + 1;
	        x.height = Math.max(height(x.left), height(x.right)) + 1;

	        return x;
	    }

	    private Node rotateLeft(Node x) {
	        Node y = x.right;
	        Node T2 = y.left;

	        y.left = x;
	        x.right = T2;

	        x.height = Math.max(height(x.left), height(x.right)) + 1;
	        y.height = Math.max(height(y.left), height(y.right)) + 1;

	        return y;
	    }

	    public void insert(Cliente cliente) {
	        root = insertRecursive(root, cliente);
	    }

	    private Node insertRecursive(Node node, Cliente cliente) {
	        if (node == null) {
	            return new Node(cliente);
	        }

	        if (cliente.getCpf().compareTo(node.cliente.getCpf()) < 0) {
	            node.left = insertRecursive(node.left, cliente);
	        } else if (cliente.getCpf().compareTo(node.cliente.getCpf()) > 0) {
	            node.right = insertRecursive(node.right, cliente);
	        } else {
	           
	        }

	        node.height = 1 + Math.max(height(node.left), height(node.right));

	        int balance = getBalance(node);

	        if (balance > 1) {
	            if (cliente.getCpf().compareTo(node.left.cliente.getCpf()) < 0) {
	                return rotateRight(node);
	            } else {
	                node.left = rotateLeft(node.left);
	                return rotateRight(node);
	            }
	        }

	        if (balance < -1) {
	            if (cliente.getCpf().compareTo(node.right.cliente.getCpf()) > 0) {
	                return rotateLeft(node);
	            } else {
	                node.right = rotateRight(node.right);
	                return rotateLeft(node);
	            }
	        }

	        return node;
	    }

	    public int searchByCpf(String cpf) {
	        return searchByCpfRecursive(root, cpf, 0);
	    }

	    private int searchByCpfRecursive(Node node, String cpf, int comparisons) {
	        if (node == null) {
	            return -1;
	        }

	        comparisons++;
	        int cmp = cpf.compareTo(node.cliente.getCpf());

	        if (cmp == 0) {
	            return comparisons;
	        } else if (cmp < 0) {
	            return searchByCpfRecursive(node.left, cpf, comparisons);
	        } else {
	            return searchByCpfRecursive(node.right, cpf, comparisons);
	        }
	    }

	    public List<Cliente> inOrderTraversal() {
	    	  List<Cliente> clientsList = new ArrayList<>();
	          inOrderTraversalRecursive(root, clientsList);
	          clientsList.sort((c1, c2) -> c1.getNome().compareTo(c2.getNome())); // Ordenar por nome
	          return clientsList;
	    }
	    private void inOrderTraversalRecursive(Node node, List<Cliente> clientsList) {
	        if (node == null) {
	            return;
	        }

	        inOrderTraversalRecursive(node.left, clientsList);
	        clientsList.add(node.cliente);
	        inOrderTraversalRecursive(node.right, clientsList);
	    }
}

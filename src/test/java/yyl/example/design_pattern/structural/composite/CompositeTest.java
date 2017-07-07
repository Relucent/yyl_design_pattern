package yyl.example.design_pattern.structural.composite;

import java.util.List;

public class CompositeTest {
	public static void main(String[] args) {
		Node root = new Node("root");
		List<Node> children = root.getChildren();
		children.add(new Node("node1"));
		children.add(new Node("node2"));
		children.add(new Node("node3"));
		System.out.println(root);
	}
}

package com.tree.binarysearchtree.ecommerceproductinventory;

public class ProductBST {

	private ProductNode root;

	// Insert product
	public void insert(Product product) {
		root = insertRec(root, product);
	}

	private ProductNode insertRec(ProductNode root, Product product) {
		if (root == null)
			return new ProductNode(product);

		if (product.sku < root.product.sku)
			root.left = insertRec(root.left, product);
		else if (product.sku > root.product.sku)
			root.right = insertRec(root.right, product);
		else
			System.out.println("Duplicate SKU not allowed");

		return root;
	}

	// Search product
	public Product search(int sku) {
		ProductNode node = searchRec(root, sku);
		return node == null ? null : node.product;
	}

	private ProductNode searchRec(ProductNode root, int sku) {
		if (root == null || root.product.sku == sku)
			return root;

		if (sku < root.product.sku)
			return searchRec(root.left, sku);

		return searchRec(root.right, sku);
	}

	// Update price
	public void updatePrice(int sku, double newPrice) {
		Product product = search(sku);
		if (product != null) {
			product.price = newPrice;
			System.out.println("Price updated successfully.");
		} else {
			System.out.println("Product not found.");
		}
	}

	// Display sorted products
	public void displaySorted() {
		System.out.println("\nProducts (Sorted by SKU):");
		inorder(root);
	}

	private void inorder(ProductNode root) {
		if (root != null) {
			inorder(root.left);
			System.out.println(root.product);
			inorder(root.right);
		}
	}
}

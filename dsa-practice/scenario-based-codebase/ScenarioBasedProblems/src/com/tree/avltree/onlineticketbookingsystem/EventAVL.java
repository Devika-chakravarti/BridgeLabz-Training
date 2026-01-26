package com.tree.avltree.onlineticketbookingsystem;

class EventAVL {

    int height(Event n) {
        return (n == null) ? 0 : n.height;
    }

    int getBalance(Event n) {
        return (n == null) ? 0 : height(n.left) - height(n.right);
    }

    Event rightRotate(Event y) {
        Event x = y.left;
        Event t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    Event leftRotate(Event x) {
        Event y = x.right;
        Event t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    Event insert(Event node, int time, String name) {

        if (node == null)
            return new Event(time, name);

        if (time < node.time)
            node.left = insert(node.left, time, name);
        else if (time > node.time)
            node.right = insert(node.right, time, name);
        else
            return node;

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        int balance = getBalance(node);

        if (balance > 1 && time < node.left.time)
            return rightRotate(node);

        if (balance < -1 && time > node.right.time)
            return leftRotate(node);

        if (balance > 1 && time > node.left.time) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && time < node.right.time) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    Event minValue(Event node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    Event delete(Event root, int time) {

        if (root == null)
            return root;

        if (time < root.time)
            root.left = delete(root.left, time);
        else if (time > root.time)
            root.right = delete(root.right, time);
        else {
            if (root.left == null || root.right == null) {
                root = (root.left != null) ? root.left : root.right;
            } else {
                Event temp = minValue(root.right);
                root.time = temp.time;
                root.eventName = temp.eventName;
                root.right = delete(root.right, temp.time);
            }
        }

        if (root == null)
            return root;

        root.height = Math.max(height(root.left), height(root.right)) + 1;
        int balance = getBalance(root);

        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);

        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);

        return root;
    }

    void display(Event root) {
        if (root != null) {
            display(root.left);
            System.out.println(root.time + " -> " + root.eventName);
            display(root.right);
        }
    }
}

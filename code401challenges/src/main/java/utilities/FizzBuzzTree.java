package utilities;

import tree.BinarySearchTree;

public class FizzBuzzTree extends BinarySearchTree {

    public void fizzBuzzTree(BinarySearchTree curr, ArrayList<Object> val ){
    if(curr != null){
        fizzBuzzTree2(curr.getLeftChild(), val);
    }
    if (curr.getValue() % 3 == 0 && curr.getValue() % 5 == 0){
        curr.getValue("fizzBuzz");
    }else if(curr.getValue() % 3 == 0){
        curr.getValue("fizz");
    } else {
        curr.getValue("buzz");
    }

    }

//    public ArrayList<Object> inOrderFizzBuzz(){
//        ArrayList<Object> values = new ArrayList<>();
//        if (this.root == null){
//            return values;
//        }
//        fizzBuzzTree2(this.root, values);
//
//        return values;
//    }
//
//    private void fizzBuzzTree(Node root, ArrayList<Object> values) {
//    }

//    public void fizzBuzzTree(Node curr, ArrayList<Object> val ){
//        if(curr != null){
//            fizzBuzzTree2(curr.getLeftChild(), val);
//        }
//        if (curr.getValue() % 3 == 0 && curr.getValue() % 5 == 0){
//            curr.getValue("fizzBuzz");
//        }else if(curr.getValue() % 3 == 0){
//            curr.getValue("fizz");
//        } else {
//            curr.getValue("buzz");
//        }
//
//    }
}



public class BST {
    
    
    public BST(String i){
        rootNode = new BSTNode(i); 
    }

    
    public int addNode(String i){
        int count = 0; 
        BSTNode currentNode = rootNode;
        boolean finished = false; 
        do{
            BSTNode curLeftNode = currentNode.leftNode; 
            BSTNode curRightNode = currentNode.rightNode; 
            String curStrData = currentNode.strData; 

            if(i.compareTo(curStrData) > 0){
                if(curRightNode == null){
                    currentNode.rightNode = new BSTNode(i); 
                    finished = true; 
                }
                else{ 
                    currentNode = curRightNode; 
                }
            }
            else{
                if(curLeftNode == null){
                    currentNode.leftNode = new BSTNode(i);
                    finished = true; 
                }else{
                    currentNode = curLeftNode; 
                   
                }
            }
            count++; 
        }while(!finished);
        return count; 
    }
    BSTNode rootNode; 
}



class BSTNode{

    public BSTNode(String val){
        strData = val; 
        leftNode = null; 
        rightNode = null; 

    }

    public String strData; 
    public BSTNode leftNode, rightNode; 
}

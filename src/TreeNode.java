//LeafNode class.
//
//Constructor: can create a Node with 0 - 2 children.
//
// @author Johnny Chavez
public class TreeNode <AnyType>{
    public AnyType element;
    public TreeNode R;
    public TreeNode L;


    public TreeNode (AnyType theElement, TreeNode Left, TreeNode Right){
        element = theElement;
        L = Left;
        R = Right;
    }

    public TreeNode (AnyType theElement){
        this(theElement, null,null);
    }

}

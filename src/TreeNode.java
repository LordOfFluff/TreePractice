//LeafNode class.
//
//Constructor: can create a Node with 0 - 2 children.
//@authur Johnny Chavez
public class TreeNode
{
    public int element;
    public TreeNode R;
    public TreeNode L;


    public TreeNode (int theElement, TreeNode Left, TreeNode Right){
        element = theElement;
        L = Left;
        R = Right;
    }

    public TreeNode ( theElement){
        this(theElement, null,null);
    }

}

//LeafNode class.
//
//Constructor: can create a Node with 0 - 2 children.
<<<<<<< HEAD
//@authur Johnny Chavez
public class TreeNode
{
    public int element;
=======
//
// @author Johnny Chavez
public class TreeNode <AnyType>{
    public AnyType element;
>>>>>>> 76dfec705256e74286543dc1e878e3d0eca4b1cd
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

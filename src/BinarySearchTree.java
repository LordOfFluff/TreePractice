public class BinarySearchTree <AnyType> {
    /*  BinarySearchTree class.
Constructor: can create a Node with 0 - 2 children.
@author Brandon Hernandez
     */
    private TreeNode root;

    //default constructor
    public BinarySearchTree()
    {
        root=null;
        //sets the initial root to null (0)

    }
    //overloaded constructor
    public BinarySearchTree(TreeNode r)
    {
        r=root;
        //sets the initial root to the users input

    }

    public void insert(TreeNode parent,AnyType input)
    {
        if (parent==null)
           parent.element=input;
        else if (parent.element)
            parent.L=input;


    }


















}

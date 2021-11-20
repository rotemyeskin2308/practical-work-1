package practicalwork1;

/**
*
* AVLTree
*
* An implementation of a� AVL Tree with
* distinct integer keys and info.
*
*/

public class AVLTree {
	public static final AVLNode EXTERNAL_NODE = null;
	//Class variables
	private AVLNode root;
	private AVLNode min;
	private AVLNode max;
	private int size;
	
	public AVLTree() {
		this.root= null;
		this.min= null;
		this.max= null;
		this.size=0;
	}
	

 /**
  * public boolean empty()
  *
  * Returns true if and only if the tree is empty.
  *
  */
 public boolean empty() {
	 if (this.root==EXTERNAL_NODE)
		 return true;
	 return false;
 }

/**
  * public String search(int k)
  *
  * Returns the info of an item with key k if it exists in the tree.
  * otherwise, returns null.
  */
 public String search(int k)
 {
	AVLNode pointer_node=this.root;
	while(pointer_node!=EXTERNAL_NODE) {
		if(k<pointer_node.key)
			pointer_node=pointer_node.left;
		else if(k>pointer_node.key)
			pointer_node=pointer_node.right;
		else
			break;
	}
	if(pointer_node==EXTERNAL_NODE)
		return null;
	 return pointer_node.info;  
 }

 /**
  * public int insert(int k, String i)
  *
  * Inserts an item with key k and info i to the AVL tree.
  * The tree must remain valid, i.e. keep its invariants.
  * Returns the number of re-balancing operations, or 0 if no re-balancing operations were necessary.
  * A promotion/rotation counts as one re-balance operation, double-rotation is counted as 2.
  * Returns -1 if an item with key k already exists in the tree.
  */
  public int insert(int k, String i) {
	  return 420;	// to be replaced by student code
  }

 /**
  * public int delete(int k)
  *
  * Deletes an item with key k from the binary tree, if it is there.
  * The tree must remain valid, i.e. keep its invariants.
  * Returns the number of re-balancing operations, or 0 if no re-balancing operations were necessary.
  * A promotion/rotation counts as one re-balance operation, double-rotation is counted as 2.
  * Returns -1 if an item with key k was not found in the tree.
  */
  public int delete(int k)
  {
	   return 421;	// to be replaced by student code
  }

  /**
   * public String min()
   *
   * Returns the info of the item with the smallest key in the tree,
   * or null if the tree is empty.
   */
  public String min()
  {
	   return this.min.info; 
  }

  /**
   * public String max()
   *
   * Returns the info of the item with the largest key in the tree,
   * or null if the tree is empty.
   */
  public String max()
  {
	   return this.max.info; 
  }

 /**
  * public int[] keysToArray()
  *
  * Returns a sorted array which contains all keys in the tree,
  * or an empty array if the tree is empty.
  */
 private int Create_sort_Keys_Array(int[] sort_key_arr,AVLNode node, int index) {
	 if(node==EXTERNAL_NODE)
		 return index;
	 index= Create_sort_Keys_Array(sort_key_arr,node.left,index);
	 sort_key_arr[index]=node.key;
	 index++;
	 index= Create_sort_Keys_Array(sort_key_arr,node.right,index);
	 return index;
 }
  
  public int[] keysToArray()
 {
	 int[] sort_key_arr= new int[this.size]; 
     Create_sort_Keys_Array(sort_key_arr,this.root,0);
	 return sort_key_arr; 
 }

 /**
  * public String[] infoToArray()
  *
  * Returns an array which contains all info in the tree,
  * sorted by their respective keys,
  * or an empty array if the tree is empty.
  */
  private int Create_sort_info_Array(String[] sort_info_arr,AVLNode node, int index) {
		 if(node==EXTERNAL_NODE)
			 return index;
		 index= Create_sort_info_Array(sort_info_arr,node.left,index);
		 sort_info_arr[index]=node.info;
		 index++;
		 index= Create_sort_info_Array(sort_info_arr,node.right,index);
		 return index;
	 }
  
  public String[] infoToArray()
 {
	 String[] sort_info_arr= new String[this.size]; 
     Create_sort_info_Array(sort_info_arr,this.root,0);
	 return sort_info_arr;
 }

  /**
   * public int size()
   *
   * Returns the number of nodes in the tree.
   */
  public int size()
  {
	   return this.size; // to be replaced by student code
  }
  
  /**
   * public int getRoot()
   *
   * Returns the root AVL node, or null if the tree is empty
   */
  public IAVLNode getRoot()
  {
	   return this.root;
  }
  
  /**
   * public AVLTree[] split(int x)
   *
   * splits the tree into 2 trees according to the key x. 
   * Returns an array [t1, t2] with two AVL trees. keys(t1) < x < keys(t2).
   * 
	* precondition: search(x) != null (i.e. you can also assume that the tree is not empty)
   * postcondition: none
   */   
  public AVLTree[] split(int x)
  {
	   return null; 
  }
  
  /**
   * public int join(IAVLNode x, AVLTree t)
   *
   * joins t and x with the tree. 	
   * Returns the complexity of the operation (|tree.rank - t.rank| + 1).
	*
	* precondition: keys(t) < x < keys() or keys(t) > x > keys(). t/tree might be empty (rank = -1).
   * postcondition: none
   */   
  public int join(IAVLNode x, AVLTree t)
  {
	   return -1;
  }

	/** 
	 * public interface IAVLNode
	 * ! Do not delete or modify this - otherwise all tests will fail !
	 */
	public interface IAVLNode{	
		public int getKey(); // Returns node's key (for virtual node return -1).
		public String getValue(); // Returns node's value [info], for virtual node returns null.
		public void setLeft(IAVLNode node); // Sets left child.
		public IAVLNode getLeft(); // Returns left child, if there is no left child returns null.
		public void setRight(IAVLNode node); // Sets right child.
		public IAVLNode getRight(); // Returns right child, if there is no right child return null.
		public void setParent(IAVLNode node); // Sets parent.
		public IAVLNode getParent(); // Returns the parent, if there is no parent return null.
		public boolean isRealNode(); // Returns True if this is a non-virtual AVL node.
   	public void setHeight(int height); // Sets the height of the node.
   	public int getHeight(); // Returns the height of the node (-1 for virtual nodes).
	}
	
//edited by rotem 20.11.2021
  /** 
   * public class AVLNode
   *
   * If you wish to implement classes other than AVLTree
   * (for example AVLNode), do it in this file, not in another file. 
   * 
   * This class can and MUST be modified (It must implement IAVLNode).
   */
 public class AVLNode implements IAVLNode{
	 
	 //class verables
	 private AVLNode right;
	 private AVLNode left;
	 private AVLNode parent;
	 private int rank;
	 private int key;
	 private String info;
	 public AVLNode(int nodeKey, String nodeInfo) 
	  	{
	  		// set initial values
		  	this.right=null;
		  	this.left=null;
		  	this.parent=null;
		  	this.key=nodeKey;
		  	this.info=nodeInfo;
		  	this.rank=0;
		}
	public int getKey()
	{
		if(this.key==0)
			return -1;
		return this.key;
	}
	public String getValue()
	{
		return this.info; 
	}
	public void setLeft(IAVLNode node)
	{
		this.left=(AVLNode)node;
	}
	public IAVLNode getLeft()
	{
		return this.left; 
	}
	public void setRight(IAVLNode node)
	{
		this.right=(AVLNode)node; 
	}
	public IAVLNode getRight()
	{
		return this.right;
	}
	public void setParent(IAVLNode node)
	{
		this.parent= (AVLNode)node; 
	}
	public IAVLNode getParent()
	{
		return this.parent; 
	}
	public boolean isRealNode()
	{
		if(this.key==-1)
			return false;
		return true; 
	}
    public void setHeight(int height)
    {
      this.rank=height; 
    }
    public int getHeight()
    {
      return this.rank; 
    }
 }

}
 

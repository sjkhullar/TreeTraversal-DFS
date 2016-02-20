
Binary Tree traversal is broadly categorized into following category

1.) Depth First Traversal
Pre Order Traversal
Post Order Traversal
In Order Traversal
2) Breadth First Traversal or Level Order Traversal.

In this post we will discuss about the Depth first traversal. We will take Breadth first traversal in separate post. In Depth first traversal the pre, post or in order nomenclature is with respect to parent node i.e. when we are visiting the parent node during the traversal.

Pre Order Traversal: In pre order traversal, we are visiting the current or parent node first before we start visiting its child nodes(left and right child).
1.) Visit current node or parent node
2.) Visit left child
3.) Visit right child

Post Order Traversal: In post order traversal, we are visiting the child nodes (left child and right child) before we visit the current or parent node. 
1.) Visit left child
2.) Visit right child
3.) Visit current node or parent node

In Order Traversal: In in-order traversal, we are visiting the left child , current node and then right child.
1.) Visit left child
2.) Visit current node or parent node
3.) Visit right child

We can use any of above traversal to visit the complete binary tree.
We can go through the complete code. We have created 3 packages
1.) org.learn.PrepareTree : Under this package we are creating the tree (This tree we will delete).
2.) org.learn.Question: Under this question package, we will have following traversal classes to traverse the whole binary tree.
PreOrder
PostOrder
InOrder
3.) org.learn.Client: Under this package we have main function, where we are constructing the tree and then we are deleting the whole tree.
We have used following data to construct the binary tree with root at 100.
int[] arrData = { 50, 150, 25, 80, 125, 160, 10, 20, 60, 90, 110, 140 };
The output of different traversal is as follows:
Pre Order Traversal
100 50 25 10 20 80 60 90 150 125 110 140 160 
Post Order Traversal
10 20 25 60 90 80 50 110 140 125 160 150 100 
In Order Traversal
10 25 20 50 60 80 90 100 110 125 140 150 160.
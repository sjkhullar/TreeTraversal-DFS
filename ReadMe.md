
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


Pre Order Traversal :
100 50 25 75 150 125 120 140 175 160 190 

Post Order Traversal :
25 75 50 120 140 125 160 190 175 150 100 

In Order Traversal : 
25 50 75 100 120 125 140 150 160 175 190 
package com.greatlearning.question2;

class Node
{
    int val;
    Node left, right;
    
    // Helper function that allocates a new node
    // with the given data and NULL left and right
    // pointers.
    Node(int item)
    {
        val = item;
        left = right = null;
    }
}



class Node:
    
    def __init__(self, data) :
        self.data = data
        self.left = None
        self.right = None 
    
def preorder(root):
    if root != None:
        print(root.data, end=' ')
        preorder(root.left)
        preorder(root.right)


# create binary tree.

root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)

preorder(root)









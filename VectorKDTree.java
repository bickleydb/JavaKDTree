/**
 * Auto Generated Java Class.
 */
public class VectorKDTree {
  Node root;
  
  
  public VectorKDTree() {
    Node root = null;  
  }
  
  public void add(double x,double y, double z, Vector data) {
    root = add(x,y,z,data,root);
    
  }
  
  private Node add(double x, double y, double z, Vector data, Node r) {
    int curRow = 0;
    if (r == null) {
      r = new Node(x,y,z,data);
      return r;
    } else {
        if (curRow % 3 == 0) {
          if (x < r.keyX) {
            return add(x,y,z,data,r.left);
          } else 
            return add(x,y,z,data,r.right);
        }
        else {
          if (curRow % 3 == 1) {
            if (y < r.keyY) {
              return add(x,y,z,data,r.left);
            } else 
              return add(x,y,z,data,r.right);
          }
          else {
          if (curRow % 3 == 2) {
            if (z < r.keyZ) {
              return add(x,y,z,data,r.left);
            } else 
              return add(x,y,z,data,r.right);
          }
          
        }
        }
      }
    
    return r;
  }
        
        
        
        private class Node {
          double keyX;
          double keyY;
          double keyZ;
          Vector data;
          Node left;
          Node right;
          
          private Node(double x, double y, double z, Vector t) {
            this.keyX = x;
            this.keyY = y;
            this.keyZ = z;
            this.data = t;
            this.left = null;
            this.right = null;
            
          }
          
          
          
          
          
          
          
        }
        
      }

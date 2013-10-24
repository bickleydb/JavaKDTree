public class Vector {
  double xVect;
  double yVect;
  double zVect;
  
  public Vector (double x, double y, double z) {
    this.xVect = x;
    this.yVect = y;
    this.zVect = z;
    
  }
  
  public void setVectX( double newX) {
    this.xVect = newX;
  }
  
  public void setVectY( double newY) {
    this.yVect = newY;
  }
  
  public void setVectZ( double newZ) {
    this.zVect = newZ;
  }
  
  public double getVectX() {
    return this.xVect;
  }
  
  public double getVectY() {
    return this.yVect;
  }
  
  public double getVectZ() {
    return this.zVect;
  }
  
  public double magnitude () {
    double xSquared = Math.pow(this.xVect,2);
    double ySquared = Math.pow(this.yVect,2);
    double zSquared = Math.pow(this.zVect,2);
    return Math.pow(xSquared+ySquared+zSquared,0.5);
  }
  
  public double magnitude (double x2, double y2, double z2 ) {
    double xSquared = Math.pow(this.xVect-x2,2);
    double ySquared = Math.pow(this.yVect-y2,2);
    double zSquared = Math.pow(this.zVect-z2,2);
    return Math.pow(xSquared+ySquared+zSquared,0.5);
  }
  
  public double magnitude (Vector v2){
    double newX = v2.getVectX();
    double newY = v2.getVectY();
    double newZ = v2.getVectZ();
    return magnitude (newX,newY,newZ);
  }
  
  public double dotProduct (double x2, double y2, double z2) {
    double newX = this.xVect*x2;
    double newY = this.yVect*y2;
    double newZ = this.zVect*z2;
    return newX+newY+newZ;
  }
  
  public double dotProduct (Vector v2){
    double newX = v2.getVectX();
    double newY = v2.getVectY();
    double newZ = v2.getVectZ();
    return dotProduct (newX,newY,newZ);
  }
  
  public Vector crossProd (Vector v2) {
    double firstTerm = (this.yVect * v2.zVect) - (v2.yVect * this.zVect);
    double secondTerm = (this.zVect * v2.xVect) - (v2.zVect * this.xVect);
    double thirdTerm = (this.xVect * v2.yVect) - (v2.xVect * this.yVect);
    return new Vector (firstTerm,secondTerm,thirdTerm);
  }
  
  public double getAngleWithDP (Vector v2) {
    double numer = this.dotProduct(v2);
    double denom = this.magnitude()*v2.magnitude();
    return Math.acos(numer/denom);
  }
  
  public double getAngleWithCP (Vector v2) {
    Vector initialNumer = this.crossProd(v2);
    double numer = initialNumer.magnitude();
    double denom = this.magnitude() * this.magnitude(v2);
    return Math.asin(numer/denom);
  }
  
  public Vector scaleVector (int scale) {
    double newX = this.xVect*scale;
    double newY = this.yVect*scale;
    double newZ = this.zVect*scale; 
    return new Vector (newX,newY,newZ);
  }
  
  public Vector addVectors (Vector v2) {
    return new Vector (this.xVect+v2.xVect, this.yVect+v2.yVect,this.zVect+v2.zVect);
  }
  
  
  
  public static Vector getUnitVector (Vector in) {
    double mag = in.magnitude();
    return new Vector (in.getVectX()/mag,in.getVectY()/mag,in.getVectZ()/mag);
    
  }
  
  public Vector getUnitVector () {
    return Vector.getUnitVector(this);
  }
  
  public String toString() {
    return "( " + this.xVect + ", " + this.yVect + ", " + this.zVect + " )";
  }
  
  public static void main(String[] args) {
    
    
  
  }
}
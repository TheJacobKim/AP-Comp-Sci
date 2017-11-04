/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void negate()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
  
  public static void testUnderwater()
  {
    Picture water = new Picture("water.jpg");
    water.explore();
    water.fixUnderwater();
    water.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorTempleVertical()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorVertical();
    temple.explore();
  }
  public static void mirrorVerticalRightToLeft()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorVerticalRightToLeft();
    temple.explore();
  }
  public static void mirrorHorizontal()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorHorizontal();
    temple.explore();
  }
  public static void mirrorDiagonal()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorDiagonal();
    temple.explore();
  }
 
  public static void mirrorArms()
  {
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
  
  public static void mirrorGull()
  {
    Picture seagull = new Picture("seagull.jpg");
    seagull.explore();
    seagull.mirrorGull();
    seagull.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(7);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
	  negate();
  }
}
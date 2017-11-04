import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D(); 
    for(int i=0; i<pixels.length; i++)
    	for(int j=0; j<pixels[0].length; j++)
    		pixels[i][j].setBlue(0);
  }

  public void keepOnlyBlue()
  {
	    Pixel[][] pixels = this.getPixels2D(); 
	    for(int i=0; i<pixels.length; i++)
	    	for(int j=0; j<pixels[0].length; j++)
	    	{
	    		pixels[i][j].setRed(0);
	    		pixels[i][j].setBlue(255);
	    		pixels[i][j].setGreen(0);
	    	}
	    
  }

  public void negate()
  {
	  Pixel[][] pixels = this.getPixels2D(); 
	    for(int i=0; i<pixels.length; i++)
	    	for(int j=0; j<pixels[0].length; j++)
	    	{
	    		pixels[i][j].setBlue(255-pixels[i][j].getBlue());
	    		pixels[i][j].setRed(255-pixels[i][j].getRed());
	    		pixels[i][j].setGreen(255-pixels[i][j].getGreen());
	    	}
  }
  
  public void grayscale()
  {
	  Pixel[][] pixels = this.getPixels2D(); 
	    for(int i=0; i<pixels.length; i++)
	    	for(int j=0; j<pixels[0].length; j++)
	    	{
	    		int num = (pixels[i][j].getBlue()+pixels[i][j].getRed()+pixels[i][j].getGreen()/3);
	    		pixels[i][j].setBlue(num);
	    		pixels[i][j].setRed(num);
	    		pixels[i][j].setGreen(num);
	    	}
  }

  public void fixUnderwater()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    for(int i=0; i<pixels.length; i++)
	    	for(int j=0; j<pixels[0].length; j++)
	    	{
	    		if(pixels[i][j].getBlue() > 159 && (Math.abs(pixels[i][j].getBlue() - pixels[i][j].getGreen())<10))
	    			pixels[i][j].setRed(pixels[i][j].getBlue()+70);
	    		
	    		pixels[i][j].setBlue((int)(pixels[i][j].getBlue())-50);
	    		pixels[i][j].setGreen((int)(pixels[i][j].getGreen())-50);
	    		pixels[i][j].setRed((int)(pixels[i][j].getRed()*2.7));
	    	}
  }

  public void mirrorVertical()
  {
	  
	   Pixel[][] pixels = this.getPixels2D();
	    for(int i=0; i<pixels.length; i++)
	    	for(int j=0; j<pixels[0].length; j++)
	    		pixels[i][j].setColor(pixels[i][pixels[0].length-j-1].getColor());
  }

  public void mirrorVerticalRightToLeft()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    for(int i=0; i<pixels.length; i++)
	    	for(int j=0; j<pixels[0].length; j++)
	    		pixels[i][j].setColor(pixels[i][pixels[0].length-j-1].getColor());
  }

  public void mirrorHorizontal()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    for(int i=0; i<pixels.length; i++)
	    	for(int j=0; j<pixels[0].length; j++)
	    		pixels[pixels.length-i-1][j].setColor(pixels[i][j].getColor());
  }
  
  public void mirrorHorizontalBotToTop()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    for(int i=0; i<pixels.length; i++)
	    	for(int j=0; j<pixels[0].length; j++)
	    		pixels[i][j].setColor(pixels[pixels.length-i-1][j].getColor());
  }

  public void mirrorDiagonal()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    for(int i=0; i<pixels.length; i++)
	    	for(int j=0; j<pixels.length; j++)	
	            pixels[i][j].setColor(pixels[j][i].getColor());
  }

  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  public void mirrorArms()
  {
	  	int mirrorPoint1 = 192;
	    Pixel topPixel1 = null;
	    Pixel bottomPixel1 = null;
	    Pixel[][] pixels = this.getPixels2D();
	    
	    // loop through the rows
	    for (int row = 157; row < 192; row++)
	    {
	      // loop from 13 to just before the mirror point
	      for (int col = 104; col < 171; col++)
	      {
	        
	        topPixel1 = pixels[row][col];      
	        bottomPixel1 = pixels[mirrorPoint1-row+mirrorPoint1][col];
	        bottomPixel1.setColor(topPixel1.getColor());
	      }
	    }
	    
	    int mirrorPoint2 = 196;
	    Pixel topPixel2 = null;
	    Pixel bottomPixel2 = null;
	    for (int row = 172; row < 196; row++)
	    {
	      // loop from 13 to just before the mirror point
	      for (int col = 239; col < 294; col++)
	      {
	        topPixel2 = pixels[row][col];      
	        bottomPixel2 = pixels[mirrorPoint2-row+mirrorPoint2][col];
	        bottomPixel2.setColor(topPixel2.getColor());
	      }
	    }
  }

  public void mirrorGull()
  {
	  	int mirrorPoint = 344;
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;

	    Pixel[][] pixels = this.getPixels2D();
	    
	    // loop through the rows
	    for (int row = 234; row < 322; row++)
	    {
	      // loop from 13 to just before the mirror point
	      for (int col = 238; col < mirrorPoint; col++)
	      {
	        
	        leftPixel = pixels[row][col];      
	        rightPixel = pixels[row] [mirrorPoint - col + mirrorPoint];
	        rightPixel.setColor(leftPixel.getColor());
	      }
	    }
	   
  }

  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    * set pixel color to BLACK if color distance is 
    * greater than edgeDist
    */
  public void edgeDetection(int edgeDist)
  {
	  	Pixel[][] pixels = this.getPixels2D();
	  	for(int i=0; i<pixels.length-1; i++)
	    	for(int j=0; j<pixels[0].length-1; j++)
	    	{
	    		if(((pixels[i][j].colorDistance(pixels[i][j+1].getColor()))<edgeDist) && ((pixels[i][j].colorDistance(pixels[i+1][j].getColor()))<edgeDist))
	    		{
	    			pixels[i][j].setBlue(255);
		    		pixels[i][j].setRed(255);
		    		pixels[i][j].setGreen(255);
	    		}
	    		else
	    		{
	    			pixels[i][j].setBlue(0);
		    		pixels[i][j].setRed(0);
		    		pixels[i][j].setGreen(0);
	    		}
	    	
	    	}
  }
  
} 

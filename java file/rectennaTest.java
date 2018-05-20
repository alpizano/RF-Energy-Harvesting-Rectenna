public class rectennaTest
{
  public static void main(String [] args)
  {
   // Dimensions of a microstrip patch antenna depend on the resonant frequency and value of the dielectric constant
    
    double h = 0.813*Math.pow(10,-3); // thickness of substrate "h" in millimeters
    double Er = 3.55; // value of dielectric constant of substrate
    double fr = 2.4*Math.pow(10,9); // value of frequency 2.4 GHz
    double C = 3.00*Math.pow(10,8); // value of speed of light constant 3.00*10^8
   
    // Multiply speed of light by 1000 to convert to millimeters per second
    
    double W = (C/(2*fr))*Math.sqrt((2 /(Er + 1)));
    double Ereff = ((Er+1)/2)+((Er-1)/2)*(1/(Math.sqrt(1+12*(h/W))));
    
    // This calculation will account for fringing of the antenna, thus an increase of length to be deltaL
    
    double deltaL = (0.412*((Ereff + 0.3)*(W/h + 0.264))/((Ereff - 0.258)*((W/h)+0.8)))*h;
    double L = ((C)/(((2*fr)*(Math.sqrt(Ereff)))))-2*deltaL;
    
    // Length and width of substrate is equal to that of ground plane
    
    double Lg = 6*h + L; // Lg is length of ground plane
    double Wg = 6*h + W; // Wg is width of groudn plane
    
    
    System.out.println("The value of the width of the antenna patch is: " +W+ " millimeters");
    
    System.out.println("The value of the effective dieletric constant of the antenna is: " +Ereff);
    
    System.out.println("The increase in length Delta L of the patch is: " +deltaL);
    
    System.out.println("The value of the length of the antenna patch: " +L+ " millimeters");
    
    System.out.println("The value of the length of ground plane is: " +Lg+ " millimeters");
    
    System.out.println("The value of the width of ground palne is: " +Wg+ " millimeters");
  }
}
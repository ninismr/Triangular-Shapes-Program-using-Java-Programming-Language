public class Tetrahedron extends EquilateralTriangle{
    
    @Override
    public float getArea()
    {
        float SurfaceArea = (float) (Math.pow(super.getSide(),2) * Math.sqrt(3));
		return SurfaceArea;  
	}
	
	public float getVolume()
	{
        float Volume = (float) ((Math.pow(super.getSide(),3) * Math.sqrt(2)) / 12);
		return Volume;
	}
    
}

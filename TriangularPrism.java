public class TriangularPrism extends RightAngledTriangle{
    private float ph;
    
    public void setPrismHeight(float ph)
	{
		this.ph = ph; 
	}
	
	public float getPrismHeight()
	{
		return ph; 
	}

    @Override
    public float getArea()
    {
        float SurfaceArea = (float) (ph * super.getPerimeter()) + (2 * super.getArea());
		return SurfaceArea;  
	}
	
	public float getVolume()
	{
        float Volume = super.getArea() * ph;
		return Volume;
	}
    
}

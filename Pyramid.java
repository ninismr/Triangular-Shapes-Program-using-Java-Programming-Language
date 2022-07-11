public class Pyramid extends IsoscelesTriangle{
    private float bs;
    private float ph;

    public void setBaseSide(float bs)
	{
		this.bs = bs; 
	}
	
	public float getBaseSide()
	{
		return bs; 
	}
    
    public void setPyramidHeight(float ph)
	{
		this.ph = ph; 
	}
	
	public float getPyramidHeight()
	{
		return ph; 
	}

    @Override
    public float getArea()
    {
        float SurfaceArea = (float) ((bs * bs) + (4 * (0.5 * bs * Math.sqrt(Math.pow(ph,2) + Math.pow((0.5*bs),2)))));
		return SurfaceArea;  
	}
	
	public float getVolume()
	{
        float Volume = (bs * bs * ph) / 3;
		return Volume;
	}
    
}

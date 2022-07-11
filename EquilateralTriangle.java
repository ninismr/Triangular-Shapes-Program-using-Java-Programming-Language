public class EquilateralTriangle extends Triangle {
    private float s;
    
    public void setSide(float s)
	{
		this.s = s; 
	}
	
	public float getSide()
	{
		return s; 
	}
	
    @Override
	public float getPerimeter()
	{
        float Perimeter = 3 * s;
		return Perimeter;
	}

    @Override
    public float getArea()
    {
        float Area = (float) (((s * s) / 4) * Math.sqrt(3));
		return Area;  
	}
	
}

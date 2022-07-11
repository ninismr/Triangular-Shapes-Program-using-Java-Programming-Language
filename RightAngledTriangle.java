public class RightAngledTriangle extends Triangle{
    private float b;
    private float h;

    public void setBase(float b)
	{
		this.b = b; 
	}
	
	public float getBase()
	{
		return b; 
	}
    
    public void setHeight(float h)
	{
		this.h = h; 
	}
	
	public float getHeight()
	{
		return h; 
	}
	
    @Override
	public float getPerimeter()
	{
        float Perimeter = (float) (b + h + Math.sqrt(Math.pow(b,2) + Math.pow(h,2)));
		return Perimeter;
	}

    @Override
    public float getArea()
    {
        float Area = (float) (0.5 * b * h);
		return Area;  
	}
    
}

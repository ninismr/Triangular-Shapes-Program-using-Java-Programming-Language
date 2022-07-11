public class IsoscelesTriangle extends Triangle{
    private float b;
    private float s;
    private float h;

    public void setBase(float b)
	{
		this.b = b; 
	}
	
	public float getBase()
	{
		return b; 
	}
    
    public void setSide(float s)
	{
		this.s = s; 
	}
	
	public float getSide()
	{
		return s; 
	}

    public void setHeight(float h)
	{
		this.h = h;
    }

	public float getHeight()
	{
		h = (float) Math.sqrt(Math.pow(s,2) - Math.pow((0.5*b),2));
        return h; 
	}
	
    @Override
	public float getPerimeter()
	{
        float Perimeter = b + (2 * s);
		return Perimeter;
	}

    @Override
    public float getArea()
    {
        float Area = (float) (0.5 * b * h);
        return Area;
	}
    
}

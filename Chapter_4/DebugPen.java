public class DebugPen
{
    private String color;
    private String point;

    public DebugPen()
    {
        color = "black";
        point = "fine";
    }

    public DebugPen(String color, String point)
    {
        this.color = color;  //color = color; (did not assign to instance variable)
        this.point = point;  //point = point; (did not assign to instance variable)
    }

    public String getColor()
    {
        return color;
    }

    public String getPoint()
    {
        return point;
    }
}

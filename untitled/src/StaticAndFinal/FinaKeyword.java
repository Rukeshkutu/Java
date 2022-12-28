package StaticAndFinal;

public class FinaKeyword {
    final Double pi = 3.14;

    public void areaOfCircle(Double radius){
        //we cannot modfy final variables
        //this.pi= 10.0'

        System.out.println(
                "this area of circle:" + this.pi *java.lang.Math.pow(radius, 2)
        );
    }

    public static void maiin (String[] args){
        FinaKeyword finaKeyword = new FinaKeyword();
        finaKeyword.areaOfCircle(2.0);
    }
}

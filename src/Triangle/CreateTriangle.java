package Triangle;

public class CreateTriangle implements Rtriangle {



    public void  createSides (){

        int X;
        int Y;
        int result;
        int result2;
        int result3;

        X = (int) Math.pow((getApexX1() - getApexX2()),2);
        Y = (int)Math.pow( (getApexY1() - getApexY2()),2);
        result = (int)(Math.sqrt(X + Y)) ;

        System.out.println("Первая сторона:" + result);

        X = (int) Math.pow((getApexX1() - getApexX3()),2);
        Y = (int)Math.pow( (getApexY1() - getApexY3()),2);
        result2 = (int)(Math.sqrt(X + Y)) ;

        System.out.println("Вторая сторона:"+ result2);

        X = (int) Math.pow((getApexX2() - getApexX3()),2);
        Y = (int)Math.pow( (getApexY2() - getApexY3()),2);
        result3 = (int)(Math.sqrt(X + Y)) ;

        System.out.println("Третья сторона:"+ result3);



            if (Math.pow(result3,2)== Math.pow(result2,2)+ Math.pow(result,2)){
                System.out.println("Треугольник прямоугольный");
            }

            else if (Math.pow(result2,2)== Math.pow(result,2)+ Math.pow(result3,2)){
                System.out.println("Треугольник прямоугольный");

            }

            else if (Math.pow(result,2)== Math.pow(result2,2)+ Math.pow(result3,2)){
                System.out.println("Треугольник прямоугольный");

            }

            else {
                System.out.println("Треугольник непрямоугольный");

            }

        }







    @Override
    public int getApexX1() {
        return 2;
    }

    @Override
    public int getApexY1() {
        return 2;
    }

    @Override
    public int getApexX2() {
        return 2;
    }

    @Override
    public int getApexY2() {
        return 6;
    }

    @Override
    public int getApexX3() {
        return 5;
    }

    @Override
    public int getApexY3() {
        return 2;
    }
}


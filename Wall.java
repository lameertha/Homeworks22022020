public class Wall {

    double width;// instance variable
    double height;//instance variable


    Wall() {//constructor without parameter

        System.out.println();//printing statement
    }

    Wall(double width, double height) {//constructor with parameter

        if (width < 0) {
            width = 0;
        }
        if (height < 0) {
            height = 0;
        }
        this.width = width;
        this.height = height;

    }

    public static void main(String[] args) {//main method

        Wall exe15 = new Wall(5, 4);//object with parameters in constructor
        System.out.println("area = " + exe15.getAreaWithoutAnyParameters());//printing statement
        exe15.setHeightWithOneParameter(-1.5);//calling method
        System.out.println("width = " + exe15.getWidthWithoutAnyParameters());//calling method
        System.out.println("height = " + exe15.getHeightWithoutAnyParameters());//calling method
        System.out.println("area = " + exe15.getAreaWithoutAnyParameters());//calling method

    }

    public double getWidthWithoutAnyParameters() {//created instance method
        return width;//returning value

    }

    public double getHeightWithoutAnyParameters() {// instance method without any parameter with data type double
        return height;

    }

    public void setWidthWithOneParameter(double width) {//instance method
        if (width < 0) {
            width = 0;
        }
        this.width = 0;
    }


    public void setHeightWithOneParameter(double height) {//declaring instance method with one parameters
        if (height < 0) {
            height = 0.0;
        }
        this.height = height;

    }

    public double getAreaWithoutAnyParameters() {//data type double with instance variable no parameters
        return getWidthWithoutAnyParameters() * getHeightWithoutAnyParameters();

    }
}

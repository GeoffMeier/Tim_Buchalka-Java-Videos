package AreaExercise;

public class Floor {
    double width;
    double height;
    public Floor( double width, double height){
        if (width<0){
            this.width = 0;
        } else{
            this.width=width;
        }
        if(height<0){
            this.height = 0;
        } else{
            this.height=height;
        }


    }

    public double getArea(){
        return height * width;
    }
    // write your code here
}


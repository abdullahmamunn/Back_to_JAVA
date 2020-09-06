/*
Name of the problem: Create a java class physics which will have the following members, distance and
time (float types) and velocity, displacement, t1, v1, u1 and t2(double types). The constructor will print out 
the following message “We are calculating the values of speed, velocity, and time “. It will have method called 
motion which will use method overloading to calculate the values of speed, velocity and acceleration.
 */
package lab_4;

/**
 *
 * @author Abdullah
 */
public class physics {
            float distance,time;
            double velocity, displacement, t1, v1, u1,t2;
            physics(){
            System.out.println("We are calculating the values of speed, velocity, and time ");
                }
    void motion(float distance,float time) {	
            double speed;
            speed = distance/time;
            System.out.println("Value of speed : "+speed);
    }
    void motion(double t1,double t2,double u1,double v1) {
            double time = t2 -t1;
            displacement = v1-u1;
            double velocity;
            velocity=displacement/time;
            System.out.println("Value of velocity : "+velocity);
    }
    void motion(float time,double u1,double v1) {
            double acceleration;
            acceleration = v1-u1/time;
            System.out.println("Value of Acceleration : "+acceleration);
    }

}

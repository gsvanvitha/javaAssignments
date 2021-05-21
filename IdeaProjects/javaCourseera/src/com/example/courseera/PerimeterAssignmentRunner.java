package com.example.courseera;

import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
        // Put code here
        int count=0;
        for(Point point : s.getPoints())count++;
        return count;
    }

    public double getAverageLength(Shape s) {
        // Put code here
        double averageLength = getPerimeter(s)/getNumPoints(s);
        return averageLength;
    }

    public double getLargestSide(Shape s) {
        // Put code here
        Point prevPt = s.getLastPoint();
        double largestSide = 0.0;
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            largestSide = Math.max(largestSide,currDist);
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        return largestSide;
    }

    public double getLargestX(Shape s) {
        // Put code here
        double largestX = 0.0;
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            largestX = Math.max(largestX, currPt.getX());

        }

        return largestX;
    }

    public double getLargestPerimeterMultipleFiles() {
        // Put code here
        DirectoryResource dr = new DirectoryResource();
        double largestPerimeter = 0.0;
        for(File f : dr.selectedFiles()){
            FileResource file = new FileResource(f);
            Shape shape = new Shape(file);
            largestPerimeter = Math.max(largestPerimeter, getPerimeter(shape));
        }
        return largestPerimeter;
    }

    public String getFileWithLargestPerimeter() {
        // Put code here
        File temp = null;
        double largestPerimeter = 0.0;// replace this code
        DirectoryResource dr = new DirectoryResource();
        for(File f : dr.selectedFiles()){
            FileResource file = new FileResource(f);
            Shape shape = new Shape(file);
            double currentPerimeter = getPerimeter(shape);
            if(currentPerimeter > largestPerimeter){
                largestPerimeter = currentPerimeter;
                temp = f;
            }
        }
        return temp.getName();
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
        int noOfPoints = getNumPoints(s);
        System.out.println("No of points = "+noOfPoints);
        double averageLength = getAverageLength(s);
        System.out.println("Average Length = "+averageLength);
        double largestSide = getLargestSide(s);
        System.out.println("LargestSide = "+largestSide);
        double largestX = getLargestX(s);
        System.out.println("Largest X point = "+largestX);
    }
    
    public void testPerimeterMultipleFiles() {
        // Put code here
        double largestPerimeter = getLargestPerimeterMultipleFiles();
        System.out.println("Largest Perimeter in multiple files "+largestPerimeter);
    }

    public void testFileWithLargestPerimeter() {
        // Put code here
        String fileName= getFileWithLargestPerimeter();
        System.out.println("File with largest perimeter ="+fileName);
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
    }
}

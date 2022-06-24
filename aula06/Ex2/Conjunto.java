package aula06.Ex2;
import java.util.Vector;

public class Conjunto {
    
    //create a vector to store the elements
    private Vector<Integer> numSet = new Vector<>();

    //add element if it is not in the vector
    public void insert(int n) {
        if (!this.contains(n)) {
            numSet.add(n);
        }
    }

    //check if the vector contains the element
    public boolean contains(int n) {
        return numSet.contains(n);
    }

    //remove element from the vector if it contains it
    public void remove(int n) {
        if (this.contains(n)) {
            numSet.remove(numSet.indexOf(n));
        }
    }

    //remove all elements from the vector
    public void empty() {
        numSet.clear();
    }

    //to string
    public String toString() {
        String result = "";
        for (int i = 0; i < numSet.size(); i++) {
            result += numSet.get(i) + " ";
        }
        return result;
    }

    //return the number of elements in the vector
    public int size() {
        return numSet.size();
    }

    //Builds a new set that combines two sets
    public Conjunto combine(Conjunto add){
        Conjunto combined = new Conjunto();
        for (int i = 0; i < this.size(); i++) {
            combined.insert(this.numSet.get(i));
        }
        for (int i = 0; i < add.size(); i++) {
            combined.insert(add.numSet.get(i));
        }
        return combined;
    }

    //Builds a new set that is the diference between (this) and (dif)
    public Conjunto subtract(Conjunto dif){
        Conjunto subtracted = new Conjunto();
        for (int i = 0; i < this.size(); i++) {
            if (!dif.contains(this.numSet.get(i))) {
                subtracted.insert(this.numSet.get(i));
            }
        }
        return subtracted;
    }

    //Builds a new set that is the intersection between (this) and (inter)
    public Conjunto intersect(Conjunto inter){
        Conjunto intersect = new Conjunto();
        for (int i = 0; i < this.size(); i++) {
            if (inter.contains(this.numSet.get(i))) {
                intersect.insert(this.numSet.get(i));
            }
        }
        return intersect;
    }
}

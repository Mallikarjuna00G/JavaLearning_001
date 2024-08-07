/**
 * File: PassOb.java
 * 
 * Purpose: Objects can be passed to methods.
 * 
 */
/*
 * Purpose: 
 */
class Block {
    int a, b, c;
    int volume;
    
    /*
     * Purpose: 
     */
    Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    } // Constructor 

    /*
     * Purpose: Return true of ob defines same block.
     */
    public boolean sameBlock(Block ob) {
        if((ob.a == a) & (ob.b == b) & (ob.c == c)) {
            // if: 
            return true;
        } else {
            // else: 
            return false;
        }  // if-else statement: 
    } // method sameBlock

    /*
     * Purpose: Return true if ob has same volume.
     */
    public boolean sameVolume(Block ob) {
        if(ob.volume == volume) {
            // if: 
            return true;
        } else {
            // else: 
            return false;
        }  // if-else statement: 
    } // method sameVolume
} // class Block

/*
 * Purpose: 
 */
class PassOb {
    public static void main(String[] args) {
        var ob1 = new Block(10, 2, 5);
        var ob2 = new Block(10, 2, 5);
        var ob3 = new Block(4, 5, 5);

        System.out.println("ob1 same dimensions as ob2: " + ob1.sameBlock(ob2));
        System.out.println("ob1 same dimensions as ob3: " + ob1.sameBlock(ob3));
        System.out.println("ob1 same volume as ob3: " + ob1.sameVolume(ob3));
    }  // main(String[])
}  // class PassOb
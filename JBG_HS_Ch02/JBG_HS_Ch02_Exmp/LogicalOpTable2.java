/**
 * Try This 2-2: a truth table for the logical operators.
 * Print 1's and 0's instead of true and false.
 * 
 * Call this file "LogicalOpTable2.java".
 */
class LogicalOpTable2 {
    public static void main(String[] args) {
        boolean pBoolean, qBoolean;
        byte p, q, pANDq, pORq, pXORq, pNOT = 0;
        boolean b_pANDq, b_pORq, b_pXORq;
        

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        pBoolean = true;
        qBoolean = true;

        p = 0;
        q = 0;
        if(pBoolean) p = 1;
        if(qBoolean) q = 1;
        
        b_pANDq = pBoolean & qBoolean;
        pANDq = 0;
        if(b_pANDq) pANDq = 1;
        b_pORq = pBoolean | qBoolean;
        pORq = 0;
        if(b_pORq) pORq = 1;
        b_pXORq = pBoolean ^ qBoolean;
        pXORq = 0;
        if(b_pXORq) pXORq = 1;
        
        if(pBoolean) pNOT = 0;
        if(!pBoolean) pNOT = 1;

        System.out.print(p + "\t" + q + "\t");
        System.out.print(pANDq + "\t" + pORq + "\t");
        System.out.println(pXORq + "\t" + pNOT);

        pBoolean = true;
        qBoolean = false;

        p = 0;
        q = 0;
        if(pBoolean) p = 1;
        if(qBoolean) q = 1;
        
        b_pANDq = pBoolean & qBoolean;
        pANDq = 0;
        if(b_pANDq) pANDq = 1;
        b_pORq = pBoolean | qBoolean;
        pORq = 0;
        if(b_pORq) pORq = 1;
        b_pXORq = pBoolean ^ qBoolean;
        pXORq = 0;
        if(b_pXORq) pXORq = 1;
        
        if(pBoolean) pNOT = 0;
        if(!pBoolean) pNOT = 1;

        System.out.print(p + "\t" + q + "\t");
        System.out.print(pANDq + "\t" + pORq + "\t");
        System.out.println(pXORq + "\t" + pNOT);
        
        pBoolean = false;
        qBoolean = true;

        p = 0;
        q = 0;
        if(pBoolean) p = 1;
        if(qBoolean) q = 1;
        
        b_pANDq = pBoolean & qBoolean;
        pANDq = 0;
        if(b_pANDq) pANDq = 1;
        b_pORq = pBoolean | qBoolean;
        pORq = 0;
        if(b_pORq) pORq = 1;
        b_pXORq = pBoolean ^ qBoolean;
        pXORq = 0;
        if(b_pXORq) pXORq = 1;
        
        if(pBoolean) pNOT = 0;
        if(!pBoolean) pNOT = 1;

        System.out.print(p + "\t" + q + "\t");
        System.out.print(pANDq + "\t" + pORq + "\t");
        System.out.println(pXORq + "\t" + pNOT);
        
        pBoolean = false;
        qBoolean = false;

        p = 0;
        q = 0;
        if(pBoolean) p = 1;
        if(qBoolean) q = 1;
        
        b_pANDq = pBoolean & qBoolean;
        pANDq = 0;
        if(b_pANDq) pANDq = 1;
        b_pORq = pBoolean | qBoolean;
        pORq = 0;
        if(b_pORq) pORq = 1;
        b_pXORq = pBoolean ^ qBoolean;
        pXORq = 0;
        if(b_pXORq) pXORq = 1;
        
        if(pBoolean) pNOT = 0;
        if(!pBoolean) pNOT = 1;
        
        System.out.print(p + "\t" + q + "\t");
        System.out.print(pANDq + "\t" + pORq + "\t");
        System.out.println(pXORq + "\t" + pNOT);
        
    }
}
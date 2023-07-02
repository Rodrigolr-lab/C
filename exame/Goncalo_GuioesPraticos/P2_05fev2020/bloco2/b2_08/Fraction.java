/**
 * Fraction class
 * Represents fractions, always reduced to lowest terms.
 * If fraction is negative, the numerator will always be negative.
 * All operators leave results stored in lowest terms.
 *
 * Class is not complete, only addition operation is implemented.
 *
 * @author Carol Zander
 */
 
public class Fraction {
    private int numerator;             // Fraction numerator
    private int denominator;           // Fraction denominator

    /*-----------------------------------------------------------------
     * constructor
     * Takes no parameters, initializes the object to 0/1
     */
    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    /*-----------------------------------------------------------------
     * constructor
     * Takes parameter, the numerator, initializes denominator to 1
     * so object is numerator/1
     */
    public Fraction(int num) {
        numerator = num;
        denominator = 1;
    }

    /*-----------------------------------------------------------------
     * constructor
     * If fraction is negative, put negative number in numerator
     */
    public Fraction(int num, int denom) {
        numerator = (denom < 0 ? -num : num);
        if (denom == 0) {
            denominator = 1;
        }
        denominator = (denom < 0 ? -denom : denom);
    }

    /*-----------------------------------------------------------------
     * constructor
     * Clones a fraction given as argument
     */
    public Fraction(Fraction f) {
        this.numerator=f.numerator;
        this.denominator=f.denominator;
    }

    /*-----------------------------------------------------------------
     * setNumerator
     * numerator is set to be the given parameter
     */
    public void setNumerator(int num) {
        numerator = num;
        reduce();
    }

    /*-----------------------------------------------------------------
     * getNumerator
     * return numerator
     */
    public int getNumerator() {
        return numerator;
    }

    /*-----------------------------------------------------------------
     * setDenominator
     * denominator is set to be the given parameter (zero is ignored),
     * if denominator is negative, numerator is adjusted
     */
    public void setDenominator(int denom) {
        if (denom > 0) {
            denominator = denom;
            reduce();
        }
        else if (denom < 0) {
            numerator = -numerator;
            denominator = -denom;
            reduce();
        }
    }

    /*-----------------------------------------------------------------
     * getDenominator
     * return denominator
     */
    public int getDenominator() {
        return denominator;
    }

    /*-----------------------------------------------------------------
     * add
     * add the parameter Fraction to the current object Fraction 
     */
    public Fraction add(Fraction rhs) {
        Fraction sum = new Fraction();
        sum.denominator = denominator * rhs.denominator;
        sum.numerator = numerator * rhs.denominator 
                          + denominator * rhs.numerator;
        sum.reduce();
        return sum;
    }

    /*-----------------------------------------------------------------
     * subtract
     * subtract the parameter Fraction to the current object Fraction 
     */
    public Fraction subtract(Fraction b) {
        // check preconditions
        if ((denominator == 0) || (b.denominator == 0))
            throw new IllegalArgumentException("invalid denominator");
        // find lowest common denominator
        int common = lcd(denominator, b.denominator);
        // convert fractions to lcd
        Fraction commonA = new Fraction();
        Fraction commonB = new Fraction();
        commonA = convert(common);
        commonB = b.convert(common);
        // create new fraction to return as difference
        Fraction diff = new Fraction();
        // calculate difference
        diff.numerator = commonA.numerator - commonB.numerator;
        diff.denominator = common;
        // reduce the resulting fraction
        diff.reduce();
        return diff;
    }

    /*-----------------------------------------------------------------
     * divide
     * divide the parameter Fraction by the current object Fraction 
     */
    public Fraction divide(Fraction b) {
        // check preconditions
        if ((denominator == 0) || (b.numerator == 0))
            throw new IllegalArgumentException("invalid denominator");
        // create new fraction to return as result
        Fraction result = new Fraction();
        // calculate result
        result.numerator = numerator * b.getDenominator();
        result.denominator = denominator * b.getNumerator();
        // reduce the resulting fraction
        result.reduce();
        return result;
    }

    /*-----------------------------------------------------------------
     * multiply
     * multiply the parameter Fraction by the current object Fraction 
     */
    public Fraction multiply(Fraction b) {
        // check preconditions
        if ((denominator == 0) || (b.denominator == 0))
            throw new IllegalArgumentException("invalid denominator");
        // create new fraction to return as product
        Fraction product = new Fraction();
        // calculate product
        product.numerator = numerator * b.numerator;
        product.denominator = denominator * b.denominator;
        // reduce the resulting fraction
        product.reduce();
        return product;
    }

    /*-----------------------------------------------------------------
     * invert
     * inverts the fraction
     */
    public Fraction invert() {
        return new Fraction(this.denominator, this.numerator);
    }

    /*-----------------------------------------------------------------
     * toString
     * convert the Fraction to a String object, e.g., 2/3
     */
    public String toString() {
        if (denominator==1)
            return Integer.toString(numerator);
        return numerator + "/" + denominator;
    }

    /*-----------------------------------------------------------------
     * equals
     * compare the parameter Fraction to the current object Fraction
     */
    public boolean equals(Fraction rhs) {
        return (numerator == rhs.numerator) && (denominator == rhs.denominator);
    }

    /*-----------------------------------------------------------------
     * reduce
     * reduce Fraction to lowest terms by finding largest common denominator
     * and dividing it out
     */
    public void reduce() {
        // find the larger of the numerator and denominator
        int n = numerator, d = denominator, largest;
        if (numerator < 0) {
            n = -numerator;
        }
        if (n > d) {
            largest = n;
        }
        else {
            largest = d;
        }

        // find the largest number that divide the numerator and
        // denominator evenly
        int gcd = 0;
        for (int i = largest; i >= 2; i--) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
                break;
            }
        }

        // divide the largest common denominator out of numerator, denominator
        if (gcd != 0) {
            numerator /= gcd;
            denominator /= gcd;
        }
    }

    /**********************************************************
    Method:         lcd
    Purpose:        find lowest common denominator, used to add and
                    subtract fractions
    Parameters:     two integers, denom1 and denom2
    Preconditions:  denom1 and denom2 must be non-zero integer values
    Postconditions: None
    Returns:        the lowest common denominator between denom1 and
                    denom2
   ***********************************************************/
   private int lcd(int denom1, int denom2)
   {
      int factor = denom1;
      while ((denom1 % denom2) != 0)
         denom1 += factor;
      return denom1;
   }

   /**********************************************************
    Method:         convert
    Purpose:        convert a fraction to an equivalent one based on
                    a lowest common denominator
    Parameters:     an integer common, the new denominator
    Preconditions:  the "this" fraction must contain valid data for
                    numerator and denominator
                    the integer value common is assumed to be greater
                    than the "this" fraction's denominator
    Postconditions: None
    Returns:        A new fraction which is equivalent to the "this"
                    fraction, but has been converted to the new
                    denominator called common
   ***********************************************************/
  private Fraction convert(int common)
  {
     Fraction result = new Fraction();
     int factor = common / denominator;
     result.numerator = numerator * factor;
     result.denominator = common;
     return result;
  }
}


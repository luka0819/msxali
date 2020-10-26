fun main(){
    var f1 = Fraction(176f, 280f)
    var f2 = Fraction(5f, 6f)

    println(f1.jami(f2))
    println( f1.sxvaoba(f2))
    println(f1.gamravleba(f2))
    println(f1.gayofa(f2))
    f1.shekveca()
}
public class Fraction(n: Float, d: Float ) {
    var numerator: Float = n
    var denominator: Float = d

    fun shekveca(){
        var n: Float = numerator
        var d: Float = denominator
        while (n != 0f && d != 0f) {
            if (n > d) {
                n = n % d
            } else {
                d = d % n
            }
        }
        var a=n+d
        var b=numerator/a
        var c=denominator/a
        this.denominator=c
        this.numerator=b
        println("$b/$c")

    }

    fun jami(fraction: Fraction): Fraction {
        var saertomnishvneli = denominator * fraction.denominator
        var mricxveli1 = saertomnishvneli / denominator * numerator
        var mricxveli2 = saertomnishvneli / fraction.denominator * fraction.numerator
        return Fraction(mricxveli1+mricxveli2,saertomnishvneli)
    }

    fun sxvaoba(fraction: Fraction): Fraction {
        var saertomnishvneli = denominator * fraction.denominator
        var mricxveli1 = saertomnishvneli / denominator * numerator
        var mricxveli2 = saertomnishvneli / fraction.denominator * fraction.numerator
        return Fraction(mricxveli1 - mricxveli2,saertomnishvneli)
    }
    fun gamravleba(fraction: Fraction):Fraction{
        var mnishvneli = denominator*fraction.denominator
        var mricxveli = numerator* fraction.numerator
        var namravli = mricxveli/mnishvneli
        return Fraction(mricxveli,mnishvneli)
    }
    fun gayofa(fraction: Fraction):Fraction{
        var mricxveli= numerator*fraction.denominator
        var mnishvneli = denominator*fraction.numerator
        var ganayofi = (numerator/denominator ) * 1/(fraction.numerator/fraction.denominator)
        return Fraction(mricxveli,mnishvneli)
    }

    open override fun toString(): String {
        return "$numerator/$denominator"
    }override fun equals(other: Any?): Boolean {
        if(other is Fraction){
            if(numerator*other.denominator/denominator == numerator){
                return true
            }
        }
        return false
    }

}


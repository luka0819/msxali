fun main()
{
    var x = Point(X = 1f, Y = 3f)


    var y = Point(X = 2f, Y = 4f)
    println(x == y)
    x.gadaaadgileX(7f)
    println(x)


}

class Point(X: Float, Y: Float) {
    var X: Float = X
    var Y: Float = Y

    fun gadaaadgileX(n: Float){
        var k: Float = X+n
        this.X = k
        println("X-IS GADAYVANISAS MIVIGBT: $k,$Y")
    }

    fun gadaaadgileY(n: Float){
        var k: Float = this.Y+n
        this.Y = k
        println("Y-is gadayvanisas mivigebt: $X $k")
    }


    override fun toString(): String {
        return "$X $Y"
    }

    override fun equals(other: Any?): Boolean {
        if(other is Point) {
            if(X == other.X && Y == other.Y){
                return true
            }
        }
        return false
    }

}
fun main() {
    val nums = arrayListOf(1,3,5,7,9)

    val newArr = nums.reverseArrayAfterSelectedIndex()
    val newArr2 = nums.reverseArrayAfterSelectedIndex(2)

    println("New Array with default value: " + newArr.toString())

    println("New Array with selected index two: " + newArr2.toString())
}

fun ArrayList<Int>.reverseArrayAfterSelectedIndex(index:Int = 0): ArrayList<Int> {

    if (index < this.size && index >= 0) {
        val sizeOfReversableElement = this.size - 1 - index

        //If there is not enough element to reverse, then return the same array
        if(sizeOfReversableElement === 0 || sizeOfReversableElement === 1)
            return this

        var result = arrayListOf<Int>()

        //before index part
        for (i in 0..index) {
            result.add(this[i])
        }

        //after index part and reverse elements of array
        for (i in (this.size - 1) downTo index+1) {
            result.add(this[i])
        }

        return result
    }else{
        //if user enter a wrong input then system throw exception according to error type
        if(index > 0)
            throw Throwable("Index must be lower than array size(Your array size is: " + this.size +  ")")
        else
            throw Throwable("Index must be greater than zero or equal to zero")
    }
}

package bonch.dev.school.secondhomework

class Fcounter(initialCount: Int = 0) {
    var currentCount = initialCount
        private set
    fun increment(){
        ++currentCount
    }

}
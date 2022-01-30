data class Time(internal var hour: Int, internal var miniute: Int, internal var second: Int)

fun main() {
    val t1 = Time(3, 50, 50)
    val t2 = Time(4, 55, 45)
    var diffRes: Time = differentTime(t2, t1)
    print("Time Difference : ${t1.hour}:${t1.miniute}:${t1.second}-")
    print("${t2.hour}:${t2.miniute}:${t2.second} = ")
    print("${diffRes.hour}:${diffRes.miniute}:${diffRes.second}")
}

fun differentTime(t1: Time, t2: Time): Time {
    var res = Time(0, 0, 0)
//    var t1 = startTime.copy()
    if (t1.second < t2.second) {
        --t1.miniute
        t1.second += 60
    }
    res.second = t1.second - t2.second
    if (t1.miniute < t2.miniute) {
        --t1.hour
        t1.miniute += 60
    }
    res.miniute = t1.miniute - t2.miniute

    res.hour = t1.hour - t2.hour
    return res
}

package collections

import android.renderscript.Sampler
import java.io.File

fun main() {
    val nameId = mutableMapOf(
        "" to 0
    )
    var max = 0
    File("D:\\Learn\\KotlinK\\app\\src\\androidTest\\java\\collections\\60.ips.txt").forEachLine {
        nameId.putIfAbsent(it, 0)
        nameId.set(it, nameId.getValue(it)+1)
    }
    nameId.values.forEach {
        if(it>max) max=it
    }
    nameId.entries.forEach {
        if(it.value==max) println(it.key)
    }
}

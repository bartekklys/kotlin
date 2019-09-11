import java.io.File
import java.util.*
import java.io.FileOutputStream
import java.io.OutputStreamWriter
import java.io.BufferedWriter
import java.io.Writer



fun main() {

    val keystore = File("C:\\Users\\klysb\\Downloads\\epro\\event-processing.keystore.jks").readBytes()
    val keystoreBase64 = "x=="

    val decoded = Base64.getDecoder().decode(keystoreBase64)

    val asString= decoded.toString(Charsets.UTF_8)
    val asString2=asString.replace(" ", "").replace("\n", "")
    println(asString2)


    val path = "C:\\Users\\klysb\\Downloads\\epro\\keystore3.jks"
    File(path).writeBytes(hexToAscii(asString2).toByteArray())

//    val keystore2 = File(path).readBytes()
//    println(keystore2.toString(Charsets.UTF_8))


//    println(decoded.toString(Charsets.UTF_8))

}

private fun hexToAscii(hexStr: String): String {
    val output = StringBuilder("")

    var i = 0
    while (i < hexStr.length) {
        val str = hexStr.substring(i, i + 2)
        output.append(Integer.parseInt(str, 16).toChar())
        i += 2
    }

    return output.toString()
}
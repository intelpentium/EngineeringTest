package ezlink.project.engineeringtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.testing1.*

class Testing1 : AppCompatActivity() {

    var result: Boolean? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.testing1)

        btn1.setOnClickListener {
            result = isAnagram("secure", "rescue")
            Popup.PopupSuccess(this, result.toString())
        }

        btn2.setOnClickListener {
            result = isAnagram("conifers", "fircones")
            Popup.PopupSuccess(this, result.toString())
        }

        btn3.setOnClickListener {
            result = isAnagram("flick", "flip")
            Popup.PopupSuccess(this, result.toString())
        }
    }

    fun isAnagram(kalimat1: String?, kalimat2: String?): Boolean {
        if (kalimat1 == null && kalimat2 == null) return true
        if (kalimat1 == null || kalimat2 == null) return false
        if (kalimat1.length != kalimat2.length) return false
        val count = IntArray(256)

        for (i in 0..kalimat1.length-1) {
            val kata1 = kalimat1[i].toInt()
            count[kata1]++
        }
        for (i in 0..kalimat2.length-1) {
            val kata2 = kalimat2[i].toInt()
            if (--count[kata2] < 0) return false
        }
        return true
    }
}
package campus.tech.kakao.contacts

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var cancel: Button
    lateinit var save: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mydebug()
    }

    fun mydebug(){
        cancel = findViewById(R.id.btn_cancel)
        save = findViewById(R.id.btn_save)

        cancel.setOnClickListener {
            Log.d("버튼","취소")
        }

        save.setOnClickListener {
            Log.d("버튼","저장")
        }
    }
}

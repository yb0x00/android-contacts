package campus.tech.kakao.contacts

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var cancel: Button
    lateinit var save: Button
    lateinit var more: Button
    lateinit var more_layout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showMoreEditTexts()
        mydebug()
    }

    fun showMoreEditTexts(){
        more = findViewById(R.id.btn_more)
        more_layout = findViewById(R.id.field_2)

        more.setOnClickListener {
            more.visibility = if(more.visibility == View.VISIBLE){
                View.GONE
            } else {View.VISIBLE}
            more_layout.visibility = if(more_layout.visibility == View.GONE){
                View.VISIBLE
            } else {View.GONE}
        }
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

package campus.tech.kakao.contacts

import android.app.DatePickerDialog
import android.icu.util.Calendar
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var cancel: Button
    lateinit var save: Button
    lateinit var more: Button
    lateinit var more_layout: LinearLayout
    lateinit var date_birth : EditText
    lateinit var dateString : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUI()
        showMoreEditTexts()
        showDatePicker()
        mydebug()
    }

    fun setUI(){
        more = findViewById(R.id.btn_more)
        more_layout = findViewById(R.id.field_2)
        date_birth = findViewById(R.id.edit_birth)
        cancel = findViewById(R.id.btn_cancel)
        save = findViewById(R.id.btn_save)
    }

    fun showMoreEditTexts(){
        more.setOnClickListener {
            more.visibility = if(more.visibility == View.VISIBLE){
                View.GONE
            } else {View.VISIBLE}
            more_layout.visibility = if(more_layout.visibility == View.GONE){
                View.VISIBLE
            } else {View.GONE}
        }
    }

    fun showDatePicker(){
        date_birth.setOnClickListener {
            val cal = Calendar.getInstance()

            val dateSetListener = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                dateString= "${year}.${month+1}.${dayOfMonth}"
                date_birth.setText(dateString)
            }
            DatePickerDialog(this, dateSetListener, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH)).show()
        }
    }

    fun mydebug(){
        cancel.setOnClickListener {
            Log.d("버튼","취소")
        }

        save.setOnClickListener {
            Log.d("버튼","저장")
        }
    }
}

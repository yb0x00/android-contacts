package campus.tech.kakao.contacts

import android.app.DatePickerDialog
import android.icu.util.Calendar
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import campus.tech.kakao.contacts.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var cancel: Button
    lateinit var save: Button
    lateinit var more: Button
    lateinit var more_layout: LinearLayout
    lateinit var edittext_date : EditText
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showMoreEditTexts()
        calendar()
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

    fun calendar(){
        edittext_date = findViewById(R.id.edit_birth)

        edittext_date.setOnClickListener {
            val cal = Calendar.getInstance()
            val data = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                binding.editBirth.hint = "${year}.${month+1}.${dayOfMonth}"
            }
            DatePickerDialog(this, data, cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH),
                cal.get(Calendar.DAY_OF_MONTH)).show()
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

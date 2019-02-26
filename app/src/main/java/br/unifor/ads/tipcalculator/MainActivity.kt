package br.unifor.ads.tipcalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {


    private lateinit var mEditTextBill: EditText
    private lateinit var mSeekBarPercentage: SeekBar
    private lateinit var mTextViewFixedPercentage: TextView
    private lateinit var mTextViewFixedPercentageValue: TextView
    private lateinit var mTextViewFixedPercentageResult: TextView
    private lateinit var mTextViewVariablePercentage: TextView
    private lateinit var mTextViewVariablePercentageValue: TextView
    private lateinit var mTextViewVariablePercentageResult: TextView


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mEditTextBill = findViewById(R.id.main_edittext_bill)
        mEditTextBill.setOnEditorActionListener { view, actionId, event ->

            if (actionId == EditorInfo.IME_ACTION_DONE){
                val billValue = mEditTextBill.text
                mTextViewFixedPercentageResult.text = billValue
            }

            false
        }


        mSeekBarPercentage = findViewById(R.id.main_seekbar_percentage)
        mSeekBarPercentage.setOnSeekBarChangeListener(this)


        mTextViewFixedPercentage = findViewById(R.id.main_edittext_fixed_percentage)
        mTextViewFixedPercentageValue = findViewById(R.id.main_edittext_fixed_percentage_value)
        mTextViewFixedPercentageResult = findViewById(R.id.main_edittext_fixed_percentage_result)
        mTextViewVariablePercentage = findViewById(R.id.main_edittext_variable_percentage)
        mTextViewVariablePercentageValue = findViewById(R.id.main_edittext_variable_percentage_value)
        mTextViewVariablePercentageResult = findViewById(R.id.main_edittext_percentage_variable_result)

    }

    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
        mTextViewVariablePercentage.text = progress.toString()
    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {

    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {

    }

}

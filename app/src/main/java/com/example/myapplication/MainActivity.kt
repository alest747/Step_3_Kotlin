package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    var tvText: TextView? = null   //переменная для вывода результата на экран смартфона
    var numberList = mutableListOf<Int>() //создал коллекцию и переменную к ней

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val simvols = 1..10  // переменная с диапазоном

        for (tipe in simvols) {          //цикл добавления значений в коллекцию
            numberList.add(tipe)
        }
        

        Disp()   //  функия для вывода информации на экран



    }
    fun Disp(){              //   Функция для вывода информации на экран
        print(numberList)  //проверка результата содержимого коллекции
        tvText = findViewById(R.id.TvText)
        tvText?.setText(numberList.toString())   //вывод содержимого коллекции на экран смартфона

    }
}

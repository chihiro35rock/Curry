package app.mita.chatamin.curry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val people = arrayOf("パパ","ママ","息子","娘")
    val food = arrayOf("かれー","みそしる","ちゃーはん","えびちり","ハンバーグ","パスタ")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun serveFood(view: View?){

        val randomName = Random
        val index = randomName.nextInt(4)
        val name = people[index]
        nameTextView.text = name+"に"

        foodTextView.text = food[Random.nextInt(6)]+"を"

        when(Random.nextInt(100)) {
            in 0..49 -> {
                verbTextView1.isVisible = true
                verbTextView2.isVisible = false
                verbTextView1.text = "よそえました^^"
            }
            in 50..99 ->{
                verbTextView1.isVisible = false
                verbTextView2.isVisible = true
                verbTextView2.text = "よそえませんでした"
            }
        }

    }
}
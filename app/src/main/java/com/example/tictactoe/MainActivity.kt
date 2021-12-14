package com.example.TicTacToe

import ...

class MainActivity : AppCompatActivity(), View.OnClickListener  {
    private lateInit var button1: Button
    private lateInit var button2: Button
    private lateInit var button3: Button
    private lateInit var button4: Button
    private lateInit var button5: Button
    private lateInit var button6: Button
    private lateInit var button7: Button
    private lateInit var button8: Button
    private lateInit var button9: Button
    private lateInit var reset: Button

    private var FirstPlayer = ArrayList<int>()
    private var SecondPlayer = ArrayList<int>()

    private fun init()  {
        button1 = findViewById<button>(R.id.button1)
        button2 = findViewById<button>(R.id.button2)
        button3 = findViewById<button>(R.id.button3)
        button4 = findViewById<button>(R.id.button4)
        button5 = findViewById<button>(R.id.button5)
        button6 = findViewById<button>(R.id.button6)
        button7 = findViewById<button>(R.id.button7)
        button8 = findViewById<button>(R.id.button8)
        button9 = findViewById<button>(R.id.button9)
        reset = findViewById<button>(R.id.reset)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
        reset.setOnClickListener(this)
    }

    override fun onCreate(savedInstanceState: Bundle?)  {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

    }

    override fun onClick(clickedView: View?) {
        if (clickedView is Button) {

            var buttonNumber = 0

            when(clickedView.id) {
                R.id.button1 -> buttonNumber = 1
                R.id.button2 -> buttonNumber = 2
                R.id.button3 -> buttonNumber = 3
                R.id.button4 -> buttonNumber = 4
                R.id.button5 -> buttonNumber = 5
                R.id.button6 -> buttonNumber = 6
                R.id.button7 -> buttonNumber = 7
                R.id.button8 -> buttonNumber = 8
                R.id.button9 -> buttonNumber = 9
            }
            if (buttonNumber != 0){
                playGame(clickedView, buttonNumber)
            }
        }
    }

    private fun playGame(clickedView: Button, buttonNumber: int) {
        if(activePlayer == 1) {
            clickedView.text = "X"
            clickedView.setBackgroundColor(color.PINK)
            activePlayer = 2
            firstPlayer.add(buttonNumber)
        } else {
            clickedView.text = "O"
            clickedView.setBackgroundColor(color.LIME)
            activePlayer = 1
            secondPlayer.add(buttonNumber)
        }
        clickedView.isEnabled = false
        check()

    }

    private fun check(){

        var winnerPlayer = 0

        if(firstPlayer.contains(1) && firstPlayer.contains(2) && firstPlayer.contains(3)) {
            winnerPlayer = 1
        }
        if(secondPlayer.contains(1) && secondPlayer.contains(2) && secondPlayer.contains(3)) {
            winnerPlayer = 2
        }
        if(firstPlayer.contains(4) && firstPlayer.contains(5) && firstPlayer.contains(6)) {
            winnerPlayer = 1
        }
        if(secondPlayer.contains(4) && secondPlayer.contains(5) && secondPlayer.contains(6)) {
            winnerPlayer = 2
        }
        if(firstPlayer.contains(7) && firstPlayer.contains(😎 && firstPlayer.contains(9)) {
            winnerPlayer = 1
        }
        if(secondPlayer.contains(7) && secondPlayer.contains(😎 && secondPlayer.contains(9)) {
            winnerPlayer = 2
        }
        if(firstPlayer.contains(1) && firstPlayer.contains(4) && firstPlayer.contains(7)) {
            winnerPlayer = 1
        }
        if(secondPlayer.contains(1) && secondPlayer.contains(4) && secondPlayer.contains(7)) {
            winnerPlayer = 2
        }
        if(firstPlayer.contains(2) && firstPlayer.contains(5) && firstPlayer.contains(8)) {
            winnerPlayer = 1
        }
        if(secondPlayer.contains(2) && secondPlayer.contains(5) && secondPlayer.contains(8)) {
            winnerPlayer = 2
        }
        if(firstPlayer.contains(3) && firstPlayer.contains(6) && firstPlayer.contains(9)) {
            winnerPlayer = 1
        }
        if(secondPlayer.contains(3) && secondPlayer.contains(6) && secondPlayer.contains(9)) {
            winnerPlayer = 2
        }
        if(firstPlayer.contains(1) && firstPlayer.contains(5) && firstPlayer.contains(9)) {
            winnerPlayer = 1
        }
        if(secondPlayer.contains(1) && secondPlayer.contains(5) && secondPlayer.contains(9)) {
            winnerPlayer = 2
        }
        if(firstPlayer.contains(3) && firstPlayer.contains(5) && firstPlayer.contains(7)) {
            winnerPlayer = 1
        }
        if(secondPlayer.contains(3) && secondPlayer.contains(5) && secondPlayer.contains(7)) {
            winnerPlayer = 2
        }

        if (winnerPlayer == 1) {
            Toast.makeText( context: this, text:First Player Wins!!!, Toast.LENGTH_SHORT).show()
        } else if (winnerPlayer == 2) {
            Toast.makeText( context: this, text:Second Player Wins!!!, Toast.LENGTH_SHORT).show()
        }
    }
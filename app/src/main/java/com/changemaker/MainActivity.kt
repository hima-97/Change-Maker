package com.changemaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.math.BigDecimal
import java.math.RoundingMode

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Global variables:
    var twentyDollar : Long = 0
    var tenDollar : Long = 0
    var fiveDollar : Long = 0
    var oneDollar : Long = 0
    var quarter : Long = 0
    var dime : Long = 0
    var nickel : Long = 0
    var cent : Long = 0

    fun makeChange(myPriceString: String)
    {

        val desmoIndex = myPriceString.indexOf('.')
        var amountInDollarsString = myPriceString.substring(0, desmoIndex)
        var amountInCentsString = myPriceString.substring(desmoIndex + 1)

        var amountInDollars = amountInDollarsString.toLong()
        var amountInCents = amountInCentsString.toLong()


        twentyDollar = amountInDollars / 20
        amountInDollars = amountInDollars % 20
        val twentyDollarText = findViewById<TextView>(R.id.twentyDollar)
        twentyDollarText.text = twentyDollar.toString()

        tenDollar = amountInDollars / (10)
        amountInDollars = amountInDollars % 10
        val tenDollarText = findViewById<TextView>(R.id.tenDollar)
        tenDollarText.text = tenDollar.toString()

        fiveDollar = amountInDollars / (5)
        amountInDollars = amountInDollars % 5
        val fiveDollarText = findViewById<TextView>(R.id.fiveDollar)
        fiveDollarText.text = fiveDollar.toString()

        oneDollar = amountInDollars
        val oneDollarText = findViewById<TextView>(R.id.oneDollar)
        oneDollarText.text = oneDollar.toString()

        quarter = amountInCents / (25)
        amountInCents = amountInCents % 25
        val quarterText = findViewById<TextView>(R.id.quarter)
        quarterText.text = quarter.toString()

        dime = amountInCents / (10)
        amountInCents = amountInCents % 10
        val dimeText = findViewById<TextView>(R.id.dime)
        dimeText.text = dime.toString()

        nickel = amountInCents / (5)
        amountInCents = amountInCents % 5
        val nickelText = findViewById<TextView>(R.id.nickel)
        nickelText.text = nickel.toString()

        cent = amountInCents
        val centText = findViewById<TextView>(R.id.cent)
        centText.text = cent.toString()

    }

    // Global variable:
    var previousPrice = 0.00

    fun button1_onclick(view: View)
    {
        val updatedPrice = findViewById<TextView>(R.id.myPrice)
        previousPrice = (previousPrice*10.00) + .01
        updatedPrice.text = BigDecimal(previousPrice).setScale(2, RoundingMode.HALF_EVEN).toString()
        makeChange(updatedPrice.text as String)

    }

    fun button2_onclick(view: View)
    {
        val updatedPrice = findViewById<TextView>(R.id.myPrice)
        previousPrice = (previousPrice*10.00) + .02
        updatedPrice.text = BigDecimal(previousPrice).setScale(2, RoundingMode.HALF_EVEN).toString()
        makeChange(updatedPrice.text as String)

    }

    fun button3_onclick(view: View)
    {
        val updatedPrice = findViewById<TextView>(R.id.myPrice)
        previousPrice = (previousPrice*10.00) + .03
        updatedPrice.text = BigDecimal(previousPrice).setScale(2, RoundingMode.HALF_EVEN).toString()
        makeChange(updatedPrice.text as String)

    }

    fun button4_onclick(view: View)
    {
        val updatedPrice = findViewById<TextView>(R.id.myPrice)
        previousPrice = (previousPrice*10.00) + .04
        updatedPrice.text = BigDecimal(previousPrice).setScale(2, RoundingMode.HALF_EVEN).toString()
        makeChange(updatedPrice.text as String)

    }

    fun button5_onclick(view: View)
    {
        val updatedPrice = findViewById<TextView>(R.id.myPrice)
        previousPrice = (previousPrice*10.00) + .05
        updatedPrice.text = BigDecimal(previousPrice).setScale(2, RoundingMode.HALF_EVEN).toString()
        makeChange(updatedPrice.text as String)

    }

    fun button6_onclick(view: View)
    {
        val updatedPrice = findViewById<TextView>(R.id.myPrice)
        previousPrice = (previousPrice*10.00) + .06
        updatedPrice.text = BigDecimal(previousPrice).setScale(2, RoundingMode.HALF_EVEN).toString()
        makeChange(updatedPrice.text as String)

    }

    fun button7_onclick(view: View)
    {
        val updatedPrice = findViewById<TextView>(R.id.myPrice)
        previousPrice = (previousPrice*10.00) + .07
        updatedPrice.text = BigDecimal(previousPrice).setScale(2, RoundingMode.HALF_EVEN).toString()
        makeChange(updatedPrice.text as String)

    }

    fun button8_onclick(view: View)
    {
        val updatedPrice = findViewById<TextView>(R.id.myPrice)
        previousPrice = (previousPrice*10.00) + .08
        updatedPrice.text = BigDecimal(previousPrice).setScale(2, RoundingMode.HALF_EVEN).toString()
        makeChange(updatedPrice.text as String)

    }

    fun button9_onclick(view: View)
    {
        val updatedPrice = findViewById<TextView>(R.id.myPrice)
        previousPrice = (previousPrice*10.00) + .09
        updatedPrice.text = BigDecimal(previousPrice).setScale(2, RoundingMode.HALF_EVEN).toString()
        makeChange(updatedPrice.text as String)

    }

    fun button0_onclick(view: View)
    {
        val updatedPrice = findViewById<TextView>(R.id.myPrice)
        previousPrice = (previousPrice*10.00) + .00
        updatedPrice.text = BigDecimal(previousPrice).setScale(2, RoundingMode.HALF_EVEN).toString()
        makeChange(updatedPrice.text as String)

    }

    fun buttonClear_onclick(view: View)
    {
        val newPrice = findViewById<TextView>(R.id.myPrice)
        newPrice.text = ""
        previousPrice = 0.00

        val twentyDollarText = findViewById<TextView>(R.id.twentyDollar)
        twentyDollarText.text = "0"

        val tenDollarText = findViewById<TextView>(R.id.tenDollar)
        tenDollarText.text = "0"

        val fiveDollarText = findViewById<TextView>(R.id.fiveDollar)
        fiveDollarText.text = "0"

        val oneDollarText = findViewById<TextView>(R.id.oneDollar)
        oneDollarText.text = "0"

        val quarterText = findViewById<TextView>(R.id.quarter)
        quarterText.text = "0"

        val dimeText = findViewById<TextView>(R.id.dime)
        dimeText.text = "0"


        val nickelText = findViewById<TextView>(R.id.nickel)
        nickelText.text = "0"

        val centText = findViewById<TextView>(R.id.cent)
        centText.text = "0"
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putString("updatedPrice", BigDecimal(previousPrice).setScale(2, RoundingMode.HALF_EVEN).toString())
        outState.putString("twentyDollar", twentyDollar.toString())
        outState.putString("tenDollar", tenDollar.toString())
        outState.putString("fiveDollar", fiveDollar.toString())
        outState.putString("oneDollar", oneDollar.toString())
        outState.putString("quarter", quarter.toString())
        outState.putString("dime", dime.toString())
        outState.putString("nickel", nickel.toString())
        outState.putString("cent", cent.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        val updatedPriceText = findViewById<TextView>(R.id.myPrice)
        updatedPriceText.text = savedInstanceState.getString("updatedPrice")
        val twentyDollarText = findViewById<TextView>(R.id.twentyDollar)
        twentyDollarText.text = savedInstanceState.getString("twentyDollar")
        val tenDollarText = findViewById<TextView>(R.id.tenDollar)
        tenDollarText.text = savedInstanceState.getString("tenDollar")
        val fiveDollarText = findViewById<TextView>(R.id.fiveDollar)
        fiveDollarText.text = savedInstanceState.getString("fiveDollar")
        val oneDollarText = findViewById<TextView>(R.id.oneDollar)
        oneDollarText.text = savedInstanceState.getString("oneDollar")
        val quarterText = findViewById<TextView>(R.id.quarter)
        quarterText.text = savedInstanceState.getString("quarter")
        val dimeText = findViewById<TextView>(R.id.dime)
        dimeText.text = savedInstanceState.getString("dime")
        val nickelText = findViewById<TextView>(R.id.nickel)
        nickelText.text = savedInstanceState.getString("nickel")
        val centText = findViewById<TextView>(R.id.cent)
        centText.text = savedInstanceState.getString("cent")
    }
}
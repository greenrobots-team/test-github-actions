package pl.adamchodera.testgithubactions.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    fun addFiveCalculation(startNumber: Int): Int {
        return startNumber.addFive()
    }

    fun Int.addFive() : Int {
        return this + 5
    }
}

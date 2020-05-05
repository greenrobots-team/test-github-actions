package pl.adamchodera.testgithubactions.ui.main

import org.junit.Test

/**
 * Created by Adam Chodera on 05/05/2020.
 */
class MainViewModelTest {
    private val mainViewModel = MainViewModel()

    @Test
    fun sampleCalculation() {
        val startNumber = 5
        val endNumber = mainViewModel.addFiveCalculation(startNumber)
        assert(endNumber == startNumber + 5)
    }
}
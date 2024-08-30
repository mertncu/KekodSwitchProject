package com.example.kekodswitchproject.ui.joy

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class JoyViewModel : ViewModel() {

    private val _characterName = MutableLiveData<String>().apply {
        value = "Joy"
    }
    val characterName: LiveData<String> = _characterName

    private val _description = MutableLiveData<String>().apply {
        value = "''All right, everyone, fresh start. We are going to have a good day, which will turn into a good week, which will turn into a good year, which turns into a good life!''"
    }
    val description: LiveData<String> = _description

    private val _longDescription = MutableLiveData<String>().apply {
        value = "Joy is the main character of Inside Out and Inside Out 2. She is the yellow Emotion and the main Emotion out of the five that live inside the mind of Riley Andersen with the others being Fear, Anger, Disgust and Sadness. She appears to be happy all the time and full of energy.\n" +
                "\n" +
                "Amy Poehler describes her as follows: \"Joy is the engine. She keeps everyone moving and happy. She represents the parts of Riley that are starting to change and become more complicated, and she is reluctant to let that change happen. She may be the most positive, but in many ways, she is the least flexible.\""
    }
    val longDescription: LiveData<String> = _longDescription
}
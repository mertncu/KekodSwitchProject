package com.example.kekodswitchproject.ui.sadness

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SadnessViewModel : ViewModel() {
    private val _characterName = MutableLiveData<String>().apply {
        value = "Sadness"
    }
    val characterName: LiveData<String> = _characterName

    private val _description = MutableLiveData<String>().apply {
        value = "''Crying helps me slow down and obsess over the weight of life's problems.''"
    }
    val description: LiveData<String> = _description

    private val _longDescription = MutableLiveData<String>().apply {
        value = "Sadness is a character in Inside Out and Inside Out 2. She is the blue Emotion and one of the five Emotions inside the mind of Riley, along with Joy, Fear, Anger, and Disgust.\n" +
                "\n" +
                "According to an interview with Phyllis Smith, Sadness is the voice of reason: when Joy has an idea, she'll try and drag her down. She appears to be depressive and shy most of the time, but there are a few instances where she is seen smiling. " +
                "flames."
    }
    val longDescription: LiveData<String> = _longDescription
}
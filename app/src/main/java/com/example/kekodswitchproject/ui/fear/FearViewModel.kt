package com.example.kekodswitchproject.ui.fear

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FearViewModel : ViewModel() {
    private val _characterName = MutableLiveData<String>().apply {
        value = "Fear"
    }
    val characterName: LiveData<String> = _characterName

    private val _description = MutableLiveData<String>().apply {
        value = "''I sure am glad you told me earthquakes are a myth, Joy. Otherwise I'd be terrified right now!''"
    }
    val description: LiveData<String> = _description

    private val _longDescription = MutableLiveData<String>().apply {
        value = "Fear is a character in Inside Out and Inside Out 2. He is the purple Emotion and one of the five Emotions inside the mind of Riley, along with Joy, Anger, Disgust and Sadness.\n"
    }
    val longDescription: LiveData<String> = _longDescription
}
package com.example.kekodswitchproject.ui.disgust

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DisgustViewModel : ViewModel() {
    private val _characterName = MutableLiveData<String>().apply {
        value = "Disgust"
    }
    val characterName: LiveData<String> = _characterName

    private val _description = MutableLiveData<String>().apply {
        value = "''OK, caution. There is a dangerous smell here, people... hold on, what is that?''"
    }
    val description: LiveData<String> = _description

    private val _longDescription = MutableLiveData<String>().apply {
        value = "Disgust is a character in Inside Out and Inside Out 2. She is the green Emotion and one of the five Emotions inside the mind of Riley, along with Joy, Fear, Anger, and Sadness.\n" +
                "\n" +
                "Mindy Kaling describes her as follows: \"Disgust is very protective of Riley. She has high expectations for everyone around her and isn’t very patient. Disgust is also very put-together because appearances matter to her.\""
    }
    val longDescription: LiveData<String> = _longDescription
}
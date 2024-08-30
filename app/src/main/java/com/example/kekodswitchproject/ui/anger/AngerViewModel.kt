package com.example.kekodswitchproject.ui.anger

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AngerViewModel : ViewModel() {
    private val _characterName = MutableLiveData<String>().apply {
        value = "Anger"
    }
    val characterName: LiveData<String> = _characterName

    private val _Description = MutableLiveData<String>().apply {
        value = "''So that's how you wanna play it, old man? No dessert?! Oh sure- we'll eat our dinner, right after you eat this!''"
    }
    val description: LiveData<String> = _Description

    private val _longDescription = MutableLiveData<String>().apply {
        value = "Anger is a major character in Inside Out and Inside Out 2. He is the red Emotion and one of the five Emotions inside the mind of a young girl named Riley, along with Joy, Fear, Disgust and Sadness.\n" +
                "\n" +
                "Lewis Black describes Anger as follows: " +
                "He's angry. He knows the group is well-meaning and they try hard, " +
                "but they don't get how things should work as well as he does. So he has " +
                "to stay on top of everything, and the only way he knows how to get their attention," +
                " keep it, and make sure they get things done right is by getting angry. He is comfortable" +
                " with his anger. It makes him happy. But when pushed too far, the top of his head bursts into " +
                "flames."
    }
    val longDescription: LiveData<String> = _longDescription
}

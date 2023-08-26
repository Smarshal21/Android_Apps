package com.example.Chat.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.Chat.R
import com.example.Chat.model.ChatUser
import com.example.Chat.ui.login.LoginnFragmentDirections
import io.getstream.chat.android.client.ChatClient
import io.getstream.chat.android.client.models.name

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private val client = ChatClient.instance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = findNavController(R.id.navHostFragment)

        if (navController.currentDestination?.label.toString().contains("login")) {
            val currentUser = client.getCurrentUser()
            if (currentUser != null) {
                val user = ChatUser(currentUser.name, currentUser.id)
                val action = LoginnFragmentDirections.actionLoginFragmentToChannelFragment(user)
                navController.navigate(action)
            }
        }

    }
}
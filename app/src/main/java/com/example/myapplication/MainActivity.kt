package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.mamoe.mirai.BotFactory
import net.mamoe.mirai.utils.BotConfiguration

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BotFactory.newBot(114514, "1919810") {
            protocol = BotConfiguration.MiraiProtocol.MACOS
            heartbeatStrategy = BotConfiguration.HeartbeatStrategy.NONE
        }
    }
}